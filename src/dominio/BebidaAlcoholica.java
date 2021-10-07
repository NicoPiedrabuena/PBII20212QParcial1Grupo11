package dominio;

public class BebidaAlcoholica extends Bebida {

    private TipoAlcohol tipoDeAlcohol;
    private Double gradoDeAlchol;

    public BebidaAlcoholica(Double cantidad, Double precio, String marca, Integer id) {
        super(cantidad, precio, marca, id);

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
