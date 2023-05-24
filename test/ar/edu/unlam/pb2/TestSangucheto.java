package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSangucheto {

	@Test
	public void queSeCreeUnSangucheto() {
		Sangucheto sangucheto = new Sangucheto();
		assertNotNull(sangucheto);
	}

	@Test
	public void queSePuedaAgregarUnIngrediente() {
		Sangucheto sangucheto = new Sangucheto();
		Ingrediente ingrediente = new Ingrediente("cheddar", 5.0);
		sangucheto.agregarIngrediente(ingrediente);
		Integer valorEsperado = 1;
		assertEquals(valorEsperado, sangucheto.getIngredientes(), 0.01);
	}

	@Test
	public void queSePuedaEliminarUnIngrediente() {
		Sangucheto sangucheto = new Sangucheto();
		Ingrediente ingrediente = new Ingrediente("cheddar", 5.0);
		sangucheto.agregarIngrediente(ingrediente);
		sangucheto.eliminarIngrediente(ingrediente, 1);
		Integer valorEsperado = 0;
		assertEquals(valorEsperado, sangucheto.getIngredientes());
	}

	@Test
	public void queSePuedaObtenerElStockDeUnIngrediente() {
		Sangucheto sangucheto = new Sangucheto();
		Ingrediente ingrediente = new Ingrediente("cheddar", 5.0);
		sangucheto.agregarIngrediente(ingrediente);
		sangucheto.agregarCantidad(ingrediente, 3);
		Integer valorEsperado = 3;
		assertEquals(valorEsperado, sangucheto.getCantidad(ingrediente));
	}

	@Test
	public void queSePuedaAgregarUnCondimento() {
		Sangucheto sangucheto = new Sangucheto();
		Condimento condimento = new Condimento("mayonesa", 5.0);
		sangucheto.agregarCondimento(condimento);
		Integer valorEsperado = 1;
		assertEquals(valorEsperado, sangucheto.getCondimentos(), 0.01);
	}

	@Test
	public void queSePuedaPrepararUnSanguchetoASuGusto() {
		Sangucheto sangucheto = new Sangucheto();
		Ingrediente ingrediente = new Ingrediente("cheddar", 5.0);
		Ingrediente ingrediente1 = new Ingrediente("tomate", 4.0);
		Condimento condimento = new Condimento("mayonesa", 1.0);
		Condimento condimento1 = new Condimento("ketchup", 2.0);
		sangucheto.agregarIngrediente(ingrediente);
		sangucheto.agregarIngrediente(ingrediente1);
		sangucheto.agregarCondimento(condimento);
		sangucheto.agregarCondimento(condimento1);
		Integer valorEsperadoPorCadaIngrediente = 2;
		assertEquals(valorEsperadoPorCadaIngrediente, sangucheto.getCondimentos(), 0.01);
		assertEquals(valorEsperadoPorCadaIngrediente, sangucheto.getIngredientes(), 0.01);

	}

	@Test
	public void queSePuedaComprarUnIngrediente() {
		Sangucheto sangucheto = new Sangucheto();
		Ingrediente ingrediente = new Ingrediente("cheddar", 5.0);
		sangucheto.agregarIngrediente(ingrediente);
		sangucheto.agregarCantidad(ingrediente, 3);
		sangucheto.comprarIngrediente(ingrediente, 2);
		Double valorEsperado = 10.0;
		assertEquals(valorEsperado, sangucheto.getPrecioCompra(), 0.01);

	}
	
	

}