package dominio;

public class Gaseosa extends Bebida {

    private Double porcentajeAzucar;
    private Double promocion;

    private TipoGaseosa tipoDeGaseosa;


    // RE VER LA PROMOCION

    public Gaseosa(Double cantidad, Double precio, String marca, Double porcentajeAzucar) {
        super(cantidad, precio, marca);
        this.porcentajeAzucar = porcentajeAzucar;
        // this.promocion = promocion;   REE VERLO
    }



    public Double getPorcentajeAzucar() {
        return porcentajeAzucar;
    }

    public void setPorcentajeAzucar(Double porcentajeAzucar) {
        this.porcentajeAzucar = porcentajeAzucar;
    }

    // calcular promocion de cada bebida
    public Double getPromocion(String marca) {
        return promocion;
    }

    public void setPromocion(Double promocion) {
        this.promocion = promocion;
    }

}

