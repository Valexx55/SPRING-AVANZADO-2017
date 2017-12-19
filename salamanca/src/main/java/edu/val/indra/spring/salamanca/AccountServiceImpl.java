package edu.val.indra.spring.salamanca;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
	
	private final static Logger log = Logger.getLogger("mylog");

    public String insertAccount(Account acc) {
        log.info("ENTRA en INSERT pasando " + acc);
        return acc.getName();
        
    }

    public List<Account> getAccounts(String name) {
    	
    	log.info("ENTRA en getAccounts pasando " + name);
    	return null;
    }

}