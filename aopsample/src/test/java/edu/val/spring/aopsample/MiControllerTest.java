package edu.val.spring.aopsample;



import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:WebContent/WEB-INF/dispatcher-servlet.xml"})
public class MiControllerTest 

{
	@Autowired
    private ViewResolver vr;
     
     
    @Test
    public void testPrioridadResolver() {   
     
    	InternalResourceViewResolver ivr = (InternalResourceViewResolver) vr;
        assertEquals("La prioridad no es uno", ivr.getOrder(), 1);
    }
    
    @Test
    public void testPrioridadResolverNoEsCero() {   
     
    	InternalResourceViewResolver ivr = (InternalResourceViewResolver) vr;
        assertEquals("La prioridad es cero" ,ivr.getOrder(), 0);
    }
     
  
}

