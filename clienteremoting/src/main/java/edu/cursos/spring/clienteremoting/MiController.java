package edu.cursos.spring.clienteremoting;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MiController {
	
	
	
	private final static Logger log = Logger.getLogger("mylog");
	

	@Autowired
	SimpleObject so;
	
	@RequestMapping(path = "/rmi", method=RequestMethod.GET)
	public String paginicio() {
 
		String pagina = null;
		
			log.info("Ha entrado en RMI--se dispone a llamar");
			so.llamarServicio();
			
			
			pagina = "inicio";
		
		return pagina;
	}
 

}
