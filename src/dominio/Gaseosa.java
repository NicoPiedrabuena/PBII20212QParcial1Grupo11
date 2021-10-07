package dominio;

public class Gaseosa extends Bebida {

	private Double promocion;

	private TipoGaseosa tipoDeGaseosa;

	// RE VER LA PROMOCION

	public Gaseosa(Double precio, String marca, TipoGaseosa tipoDeGaseosa, CantidadMiliLitros miliLitros) {
		super(precio, marca, miliLitros);
		this.tipoDeGaseosa = tipoDeGaseosa;

	}

	public TipoGaseosa getTipoDeGaseosa() {
		return tipoDeGaseosa;
	}

	public void setTipoDeGaseosa(TipoGaseosa tipoDeGaseosa) {
		this.tipoDeGaseosa = tipoDeGaseosa;
	}

	public Double getPromocion() {
		return promocion;
	}

	// calcular promocion de cada bebida
	public Double getPromocion(String marca) {
		return promocion;
	}

	public void setPromocion(Double promocion) {
		this.promocion = promocion;
	}

}
