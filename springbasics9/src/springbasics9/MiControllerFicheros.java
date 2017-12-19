package springbasics9;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
 
/**
 * Clase controller para subir ficheros
 */
@Controller
public class MiControllerFicheros {
 
    /**
     * Usamos este metodo para subir un fichero
     */
    @RequestMapping(value = "/subirUnFichero", method = RequestMethod.POST)
    @ResponseBody
    public String guardarFichero(@RequestParam("name") String[] name, @RequestParam("file") List<MultipartFile> files) {
    	String mensaje = null;
 
    	
    	System.out.println("se han subido " + files.size() + " files");
    	System.out.println("se han subido " + name.length + " nombres");
    	/**
    	 * 
    	 * Código ejecutable para guardar cada fichero
    	 * 
        if (!file.isEmpty()) {
            try 
            	{
	                byte[] bytes = file.getBytes();
	 
	                String rootPath = System.getProperty("catalina.home");//obtengo la ruta del tomcat
	                File dir = new File(rootPath + File.separator + "tmpFiles");//creo la subcarpeta tmpFiles en caso de que no exista
	                if (!dir.exists())
	                {
	                	dir.mkdirs();
	                }
	                    
	                File serverFile = new File(dir.getAbsolutePath() + File.separator + name[0]);
	                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
	                stream.write(bytes);
	                stream.close();
	 
	                System.out.println(serverFile.getAbsolutePath());
	 
	                mensaje = "Fichero subido guay =" + name[0];
            } catch (Exception e) {
            	mensaje = "Se ha liado parda " + name + " => " + e.getMessage();
            }
        } else {
        	mensaje = "No me traigas ficheros vacios";
        }*/
        return mensaje;
    }
 
  
}