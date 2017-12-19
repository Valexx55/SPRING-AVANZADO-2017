package edu.cursos.spring.clienteremoting;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import edu.val.indra.spring.salamanca.Account;
import edu.val.indra.spring.salamanca.AccountService;

public class SimpleObject {

    private AccountService accountService;
    
    private final static Logger log = Logger.getLogger("mylog");

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }
    
    public void llamarServicio ()
    {
    	Account account = new Account();
    	account.setName ("Ramoncín");
    	String strdev = accountService.insertAccount(account);
    	log.debug("La llamada al servicio remoto devolvió = "+ strdev);
    }


}