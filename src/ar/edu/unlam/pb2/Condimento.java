package ar.edu.unlam.pb2;

public class Condimento extends Ingrediente {

	private String nombre;
	private Double precio;
	private Integer cantidad = 0;

	public Condimento(String nombre, Double precio) {
		super(nombre, precio);
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
