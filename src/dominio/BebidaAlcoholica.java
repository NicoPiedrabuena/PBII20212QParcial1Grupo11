package dominio;

public class BebidaAlcoholica extends Bebida {


	private Double gradoDeAlchol;
	


	public BebidaAlcoholica(Double precio, Marca marca, CantidadMiliLitros mililitros) {
		super(precio, marca, mililitros);
		

	}



	public Double getGradoDeAlchol() {
		return gradoDeAlchol;
	}


	public void setGradoDeAlchol(Double gradoDeAlchol) {
		this.gradoDeAlchol = gradoDeAlchol;
	}

}