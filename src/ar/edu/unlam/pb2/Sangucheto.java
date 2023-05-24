package ar.edu.unlam.pb2;

import java.util.*;

public class Sangucheto {

	private ArrayList<Ingrediente> ingredientes;
	private ArrayList<Condimento> condimentos;
	private Double precioDeLaCompra;

	public Sangucheto() {
		super();
		this.ingredientes = new ArrayList<Ingrediente>();
		this.condimentos = new ArrayList<Condimento>();
		this.precioDeLaCompra = 0.0;
	}

	public Integer getIngredientes() {
		return ingredientes.size();
	}

	public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public Integer getCondimentos() {
		return condimentos.size();
	}

	public void setCondimentos(ArrayList<Condimento> condimentos) {
		this.condimentos = condimentos;
	}

	public void agregarIngrediente(Ingrediente ingrediente) {
		this.ingredientes.add(ingrediente);

	}

	public void eliminarIngrediente(Ingrediente ingrediente, Integer i) {
		this.ingredientes.remove(ingrediente);

	}

	public void agregarCantidad(Ingrediente ingrediente, Integer i) {
		Integer index = ingredientes.indexOf(ingrediente);
		ingredientes.get(index).agregarCantidad(i);
	}

	public Integer getCantidad(Ingrediente ingrediente) {
		Integer index = ingredientes.indexOf(ingrediente);

		return ingredientes.get(index).getCantidad();
	}

	public void agregarCondimento(Condimento condimento) {
		this.condimentos.add(condimento);

	}

	public void eliminarCondimento(Condimento condimento) {
		this.condimentos.remove(condimento);

	}

	public void agregarCantidad(Condimento condimento, Integer i) {
		Integer index = condimentos.indexOf(condimento);
		condimentos.get(index).agregarCantidad(i);
	}

	public Integer getCantidad(Condimento condimento) {
		Integer index = condimentos.indexOf(condimento);

		return condimentos.get(index).getCantidad();
	}

	public void comprarIngrediente(Ingrediente ingrediente, Integer i) {
		Integer index = ingredientes.indexOf(ingrediente);
		Double precio = ingredientes.get(index).obtenerPrecio();
		precioDeLaCompra = precio * i;
		ingredientes.get(index).eliminarCantidad(i);
	}

	public double getPrecioCompra() {
		
		return precioDeLaCompra;
	}

}
