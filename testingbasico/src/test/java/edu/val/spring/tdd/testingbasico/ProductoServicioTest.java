package edu.val.spring.tdd.testingbasico;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;
import static org.mockito.Mockito.*;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ProductoServicioTest {
	
	private ProductoService productService;
   // private ProductoDao productDao;
   // private Producto product;
    private int cantidadPedida = 15;
 
    @Mock
    private ProductoDao productDao; //alternativa creación MOcks con Anotación
    @Mock
    private Producto product; //alternativa creación MOcks con Anotación
    
    @Before
    public void setupMock() {
    	
    	MockitoAnnotations.initMocks(this); //alternativa creación MOcks con Anotación
    	
        productService = new ProductoService();
        /*product = mock(Producto.class);
        productDao = mock(ProductoDao.class);*/
        productService.setProductDao(productDao);
    }
 
    /*
     * STUB : Simulamos un resultado ante una llamada a un método del doble o mock
     * Es decir, cuando llamamoe a un método del mock, le decimos lo que tiene que devolver
     * 
     * VERIFY : Queremos asegurarnos que un método de un mock fue invocado apropiadamente dentro 
     * del método de la clase servicio que queremos testar
     * 
     */
    
    
    @Test
    public void testComprar() throws NoHayProductosSufcientesException {
        int availableQuantity = 30;
        
	        System.out.println("Simulando obtenerNumeroDisponibleProducto(product) para que devuelva " + availableQuantity);
	        when(productDao.obtenerNumeroDisponibleProducto(product)).thenReturn(availableQuantity);
	       
	        System.out.println("Invocando al método comprar (product," + cantidadPedida + ")");
	        productService.comprar(product, cantidadPedida);
	        
	        System.out.println("Verificando que ProductDao.pedirProducto ha sido invocado correctamente");
	        verify(productDao).pedirProducto(product, cantidadPedida);
	        
	        System.out.println("Veriicando que obtenerNumeroDisponibleProducto(product) fue llamado al menos una vez");
	        verify(productDao, atLeastOnce()).obtenerNumeroDisponibleProducto(product);
	        
	        System.out.println("Verficando que primero se llama a obtenerNumeroDisponibleProducto y después a pedirProducto");
	        InOrder order = inOrder(productDao);
	        
	        order.verify(productDao).obtenerNumeroDisponibleProducto(product);
	        order.verify(productDao).pedirProducto(product, cantidadPedida);
 
    }
 
    @Test(expected = NoHayProductosSufcientesException.class)
    public void pedirConCantidadInsuficiente() throws NoHayProductosSufcientesException {
        int availableQuantity = 3;
        
	        System.out.println("Simulando el método obtenerNumeroDisponibleProducto(product) para que devuelva " + availableQuantity);
	        when(productDao.obtenerNumeroDisponibleProducto(product)).thenReturn(availableQuantity);
	        
	        try 
	        	{
		            System.out.println("El método comprar(), debería lanzar NoHayProductosSufcientesException");
		            productService.comprar(product, cantidadPedida);
	        	} 
	        
	        catch (NoHayProductosSufcientesException e) 
	        	{
		            System.out.println("NoHayProductosSufcientesException producida");
		            verify(productDao, times(0)).pedirProducto(product, cantidadPedida);
		            System.out.println("Verficado que pedirProducto no ha sido llamado");
		            throw e;
	        	}
    }

}
