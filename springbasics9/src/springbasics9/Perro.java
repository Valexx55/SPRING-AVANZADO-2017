package springbasics9;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "perro")
public class Perro {
	
	
	private String raza;
	
	
	public Perro () {
		//constructor por defecto, tan insulso como imprescindible
	}
	
	public Perro(String raza) {
		this.raza = raza;
	}
	
	public String getRaza() {
		return raza;
	}
	
	@XmlElement
	public void setRaza(String raza) {
		this.raza = raza;
	}
	
}
