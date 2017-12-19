package edu.val.spring.tdd.testingbasico;

 
public interface ProductoDao {
	int obtenerNumeroDisponibleProducto(Producto product);
	int pedirProducto(Producto product, int orderedQuantity);
}