package dominio;

public class BebidaAlcoholica extends Bebida {


	private Double gradoDeAlchol;
	private TipoAlcohol tipoAlcohol;


	public BebidaAlcoholica(Double precio, Marca marca, CantidadMiliLitros mililitros) {
		super(precio, marca, mililitros);
		

	}


	public TipoAlcohol getTipoAlcohol() {
		return tipoAlcohol;
	}

	public void setTipoAlcohol(TipoAlcohol tipoAlcohol) {
		this.tipoAlcohol = tipoAlcohol;
	}

	public Double getGradoDeAlchol() {
		return gradoDeAlchol;
	}


	public void setGradoDeAlchol(Double gradoDeAlchol) {
		this.gradoDeAlchol = gradoDeAlchol;
	}

}