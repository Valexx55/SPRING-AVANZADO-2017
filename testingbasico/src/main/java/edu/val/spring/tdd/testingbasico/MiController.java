package edu.val.spring.tdd.testingbasico;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MiController {
	
	
	
	private final static Logger log = Logger.getLogger("mylog");
	

	
	
	@RequestMapping(path = "/login", method=RequestMethod.GET)
	public String paginicio() {
 
		String pagina = null;
		
			log.info("Ha entrado en Saludo");
			pagina = "inicio";
		
		return pagina;
	}
 

}
