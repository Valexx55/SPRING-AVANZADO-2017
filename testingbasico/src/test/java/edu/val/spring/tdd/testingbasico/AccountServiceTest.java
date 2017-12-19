package edu.val.spring.tdd.testingbasico;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;

import static org.mockito.Mockito.*;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AccountServiceTest {
 
    @Mock
    private NotificationService notificationService;
 
    @Mock
    private AccountDAO accountDAO;
 
    @InjectMocks
    private AccountServiceImpl accountService = new AccountServiceImpl();
 
    @Test
    public void createNewAccount() {
 
        // Expected objects
        String name = "Test Account";
        long accountId = 12345;
        
        Account accountToSave = new Account(name);
        Account persistedAccount = new Account(name);

        persistedAccount.setId(accountId);
 
        // Mockito expectations                            
        when(accountDAO.save(any(Account.class))).thenReturn(persistedAccount);
        doNothing().when(notificationService).notifyOfNewAccount(accountId);
 
        // Execute the method being tested     
        Account newAccount = accountService.createNewAccount(name);
 
        // Validation  
        assertNotNull(newAccount);
        assertEquals("No tiene el mismo ID", accountId, newAccount.getId());
        assertEquals("No tiene el mismo nombre" ,name, newAccount.getName());
 
        verify(notificationService).notifyOfNewAccount(accountId);
        verify(accountDAO).save(newAccount);
    }
}