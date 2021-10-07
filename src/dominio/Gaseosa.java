package dominio;

public class Gaseosa extends Bebida {

	private Boolean promocion;
	private TipoGaseosa tipoDeGaseosa;

	public Gaseosa(Double precio, String marca, CantidadMiliLitros miliLitros, TipoGaseosa tipoGaseosa) {
		super(precio, marca, miliLitros);
		this.tipoDeGaseosa = tipoGaseosa;
	}

	// calcular promocion de cada bebida
	public Boolean getPromocion(String marca) {
		return promocion;
	}

}
