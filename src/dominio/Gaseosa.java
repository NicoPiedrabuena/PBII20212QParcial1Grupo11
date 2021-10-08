package dominio;

public class Gaseosa extends Bebida {


    private Double promocion;
    private TipoGaseosa tipoDeGaseosa;
    private Boolean enPromocion;
    private Integer porcentajeAzucar;


    public Gaseosa(Double precio, Marca marca, CantidadMiliLitros mililitros, TipoGaseosa tipoGaseosa) {

        super(precio, marca, mililitros);
        this.enPromocion = false;
        switch (getMarca()) {

        case DIA:
            this.porcentajeAzucar = 20;
            break;
        case MANAOS:
            this.porcentajeAzucar = 40;
            break;
        case LA_BICHY:
            this.porcentajeAzucar = 34;
            break;
        default:
            break;
        }
    }

    // RE VER LA PROMOCION




    public Double getPrecio() {
        if(getEnPromocion()) {
            return super.getPrecio()0.9;
        }else {
            return super.getPrecio();
        }
    }

    public Boolean getEnPromocion() {
        return enPromocion;
    }

    public void setEnPromocion(Boolean enPromocion) {
        if (enPromocion) {
            setPrecio(getPrecio()0.9);
        }

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

    public Integer getPorcentajeAzucar() {
        return porcentajeAzucar;
    }

    public void setPorcentajeAzucar(Integer porcentajeAzucar) {
        this.porcentajeAzucar = porcentajeAzucar;
    }


}
