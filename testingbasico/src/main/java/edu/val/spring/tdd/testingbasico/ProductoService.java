package edu.val.spring.tdd.testingbasico;

public class ProductoService {
	
	private ProductoDao productoDao;
	
	public void setProductDao(ProductoDao productDao) {
		this.productoDao = productDao;
	}
	public boolean comprar(Producto product, int orderedQuantity) throws NoHayProductosSufcientesException {
		boolean transactionStatus = false;
		
			int availableQuantity = productoDao.obtenerNumeroDisponibleProducto(product);
			if (orderedQuantity > availableQuantity) 
			{
				throw new NoHayProductosSufcientesException();
			}
			productoDao.pedirProducto(product, orderedQuantity);
			transactionStatus = true;
			
		return transactionStatus;
	}

}
