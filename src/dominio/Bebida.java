package dominio;

public class Bebida {

	private Integer id = 0;
	
	private Double precio;
	private Marca marca;
	private CantidadMiliLitros mililitros;

	public Bebida(Double precio, Marca marca, CantidadMiliLitros mililitros) {
		this.id++; // PARA QUE TODAS LAS BEBIDAS DE INICIALICEN CON UN ID DISTINTO
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

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}



	@Override
	public String toString() {
		return  marca +" " + mililitros +" $$= " + precio+" | " ;
	}

	public CantidadMiliLitros getMililitros() {
		return mililitros;
	}

	public void setMililitros(CantidadMiliLitros mililitros) {
		this.mililitros = mililitros;
	}

}
