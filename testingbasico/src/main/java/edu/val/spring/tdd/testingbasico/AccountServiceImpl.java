package edu.val.spring.tdd.testingbasico;

import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountServiceImpl {
	
	
	@Autowired
	private NotificationService notificationService;
	 
	@Autowired
	private AccountDAO accountDAO;
	
	
	public Account createNewAccount (String nombre)
	{
		Account cuenta = null;
		
			cuenta = new Account(nombre);
			cuenta = accountDAO.save(cuenta);
			notificationService.notifyOfNewAccount(cuenta.getId());
		
		return cuenta;
	}

}
