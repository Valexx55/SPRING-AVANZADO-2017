package springbasics9;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController //realmente, esto equivale a Controller + ResponseBody
public class MiWsPutController {
	
	
	@RequestMapping(path = "/personaJSONPUT", produces="application/json", method=RequestMethod.PUT)
	public Persona personaJSONPut(@RequestBody Persona p) {
		
		//TODO CON Put, debería MODIFICAR la persona en la base de datos
 
		System.out.println(p.toString());
		return p;
	}
	
	@RequestMapping(value = "/persona/{nombrePersona}", method=RequestMethod.GET, produces="application/json" )
	public Persona getOrder(@PathVariable String nombrePersona){
		Persona p = null;
		
		//TODO GET --> recuperaría la información de la persona con ése nombre
		
		p = new Persona();
		p.setNombre(nombrePersona);
		
		return p;
	}
	
	
	@RequestMapping(value = "/perro/{raza}", method=RequestMethod.GET, produces="application/xml" )
	public Perro getPerro(@PathVariable String raza){
		Perro p = null;
		
		//TODO GET --> recuperaría la información de la persona con ése nombre
		
		p = new Perro();
		p.setRaza(raza);
		
		return p;
	}
	
	
	
	

}
