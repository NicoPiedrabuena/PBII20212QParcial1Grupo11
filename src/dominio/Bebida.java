package dominio;

public class Bebida {

	
	private Integer id = 0;
	private Double cantidad; //enum de cc 
	private Double precio;
	private String marca;
	private CantidadMiliLitros mililitros;


	public Bebida(CantidadMiliLitros mililitros, Double precio, String marca) {
		this.id = this.id++; //PARA QUE TODAS LAS BEBIDAS DE INICIALICEN CON UN ID DISTINTO
		this.precio = precio;
		this.marca = marca;
		this.mililitros = mililitros;
		
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

	public CantidadMiliLitros getMililitros() {
		return mililitros;
	}

	public void setMililitros(CantidadMiliLitros mililitros) {
		this.mililitros = mililitros;
	}
	

}


