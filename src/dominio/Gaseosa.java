package dominio;

public class Gaseosa extends Bebida {


    private Double promocion;
    private TipoGaseosa tipoDeGaseosa;
    private Boolean enPromocion;


	public Gaseosa(Double precio, Marca marca, CantidadMiliLitros mililitros, TipoGaseosa tipoGaseosa) {

		super(precio, marca, mililitros);
		this.enPromocion = false;
	}

	// RE VER LA PROMOCION


   

	public Double getPrecio() {
		if(getEnPromocion()) {
			return super.getPrecio()*0.9;
		}else {
			return super.getPrecio();
		}
	}
	
    public Boolean getEnPromocion() {
		return enPromocion;
	}

	public void setEnPromocion(Boolean enPromocion) {
		this.enPromocion = enPromocion;

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

