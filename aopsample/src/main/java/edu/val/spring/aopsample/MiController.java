package edu.val.spring.aopsample;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
public class MiController {
	
	
	
	private final static Logger log = Logger.getLogger("mylog");
	
	
	@Autowired
	private ApplicationContext appContext;

	
	
	@RequestMapping(path = "/login", method=RequestMethod.GET)
	public String paginicio() {
 
		String pagina = null;
		
			log.info("Ha entrado en Saludo");
			pagina = "inicio";
		
		return pagina;
	}
	
	@Chequeable
	@RequestMapping(path = "/login2", method=RequestMethod.GET)
	public String paginicio2() {
 
		String pagina = null;
		
			pagina = "inicio";
			//pagina.charAt(3); //comentar anterior y decomentar ésta para probar excepción
			
			ViewResolver vr = (ViewResolver)appContext.getBean("viewResolver");
			InternalResourceViewResolver ivr = (org.springframework.web.servlet.view.InternalResourceViewResolver)vr;
			System.out.println("La prioridad de este view resolver es " + ivr.getOrder());
			
		return pagina;
	}
 

	@RequestMapping(path = "/login3", method=RequestMethod.GET)
	public String paginicio3() {
 
		String pagina = null;
		
			log.info("Ha entrado en Saludo");
			pagina = "inicio";
		
		return pagina;
	}
	
}
