package ar.edu.unlam.pb2;

public class Ingrediente {

	protected String nombre;
	protected Double precio;
	protected Integer cantidad = 0;

	public Ingrediente(String nombre, Double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public void agregarCantidad(Integer i) {
		this.cantidad += i;
		
	}
	
	public Double obtenerPrecio() {
		return precio;
		
	}

	public void eliminarCantidad(Integer i) {
		this.cantidad -= i;
		
	}

}
