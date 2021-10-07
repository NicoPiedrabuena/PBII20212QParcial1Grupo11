package dominio;

public class Gaseosa extends Bebida {

    private Double porcentajeAzucar;
    private Double promocion;
    private CantidadMiliLitros mililitros;
    private TipoGaseosa tipoDeGaseosa;
    private Boolean enPromocion;


    // RE VER LA PROMOCION

    public Gaseosa( CantidadMiliLitros mililitros, Double precio, String marca) {
        super(mililitros , precio, marca);
      this.enPromocion = false;
     
    }

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


    public void setPromocion(Double promocion) {
        this.promocion = promocion;
    }

}

