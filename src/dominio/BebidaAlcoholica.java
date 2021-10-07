package dominio;

public class BebidaAlcoholica extends Bebida {

	private TipoAlcohol tipoDeAlcohol;
	private Double gradoDeAlchol;

	public BebidaAlcoholica(Double precio, String marca,CantidadMiliLitros miliLitros,TipoAlcohol tipoAlcohol) {
		super(precio, marca,miliLitros, tipoAlcohol);

	}

	public TipoAlcohol getTipoDeAlcohol() {
		return tipoDeAlcohol;
	}

	public void setTipoDeAlcohol(TipoAlcohol tipoDeAlcohol) {
		this.tipoDeAlcohol = tipoDeAlcohol;
	}

	public Double getGradoDeAlchol() {
		return gradoDeAlchol;
	}

	public void setGradoDeAlchol(Double gradoDeAlchol) {
		this.gradoDeAlchol = gradoDeAlchol;
	}

}