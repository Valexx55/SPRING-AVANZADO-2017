package edu.val.spring.tdd.testingbasico;

import static org.junit.Assert.*;

import java.io.IOException;

import javax.servlet.ServletException;

import org.junit.Before;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

public class MiServletTest {
	
	
	private MiServlet servlet;
    private MockHttpServletRequest request;
    private MockHttpServletResponse response;

    @Before
    public void setUp() {
        servlet = new MiServlet();
        request = new MockHttpServletRequest();
        response = new MockHttpServletResponse();
    }

    @Test
    public void correctUsernameInRequest() throws ServletException, IOException {
        request.addParameter("username", "laura");
        request.addParameter("password", "notiene");

        servlet.doGet(request, response);

        assertEquals("text/html", response.getContentType());
       
    }
    
}
