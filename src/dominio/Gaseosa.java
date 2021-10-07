package dominio;

public class Gaseosa extends Bebida {

    private Double porcentajeAzucar;
    private Double promocion;
    private CantidadMiliLitros mililitros;
    private TipoGaseosa tipoDeGaseosa;


    // RE VER LA PROMOCION

    public Gaseosa(Double cantidad, Double precio, String marca) {
        super(cantidad, precio, marca);
      
     
    }






    // calcular promocion de cada bebida
    public Double getPromocion(String marca) {
        return promocion;
    }

    public void setPromocion(Double promocion) {
        this.promocion = promocion;
    }

}

