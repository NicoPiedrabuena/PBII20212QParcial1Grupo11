package dominio;

public class BebidaAlcoholica extends Bebida {

	private Double gradoDeAlchol;
	private TipoAlcohol tipoAlcohol;


	public BebidaAlcoholica(Double cantidad, Double precio, String marca, TipoAlcohol tipoAlcohol,
			CantidadMiliLitros mililitros) {
		super(precio, marca, mililitros);
		this.tipoAlcohol = tipoAlcohol;

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