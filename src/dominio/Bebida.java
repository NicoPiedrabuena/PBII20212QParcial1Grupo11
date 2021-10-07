package dominio;

public class Bebida {

	//private static Integer idActual = 1;
	private Integer id;
	private Double cantidad;
	private Double precio;
	private String marca;

	public Bebida(Double cantidad, Double precio, String marca,Integer id) {
		this.id=id;
		//this.id = idActual++;
		this.cantidad = cantidad;
		this.precio = precio;
		this.marca = marca;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getCantidad() {
		return cantidad;
	}

	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String toString() {
		return "Bebida [id=" + id + ", cantidad=" + cantidad + ", precio=" + precio + ", marca=" + marca + "]";
	}

}


