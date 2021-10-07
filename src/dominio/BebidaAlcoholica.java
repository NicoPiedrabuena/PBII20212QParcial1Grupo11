package dominio;

public class BebidaAlcoholica extends Bebida {

    private TipoAlcohol tipoDeAlcohol;
    private Double gradoDeAlchol;

    public BebidaAlcoholica(TipoAlcohol tipoDeAlcohol ,CantidadMiliLitros mililitros ,Double cantidad, Double precio, String marca) {
        super(mililitros , precio, marca);
        this.tipoDeAlcohol = tipoDeAlcohol;
        
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