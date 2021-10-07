package dominio;

public class Bebida {

	private Integer id = 0;
	private Double precio;
	private String marca;
	private CantidadMiliLitros mililitros;


	public Bebida(Double precio, String marca, CantidadMiliLitros mililitros) {
		this.id = this.id++; // PARA QUE TODAS LAS BEBIDAS DE INICIALICEN CON UN ID DISTINTO
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
		return "Bebida [id=" + id + ", precio=" + precio + ", marca=" + marca + "]";
	}

	public CantidadMiliLitros getMililitros() {
		return mililitros;
	}

	public void setMililitros(CantidadMiliLitros mililitros) {
		this.mililitros = mililitros;
	}
	

}
