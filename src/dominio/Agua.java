package dominio;

public class Agua extends Bebida {

    private TipoDeAgua tipoDeAgua;

    public Agua(Double precio, Marca marca, CantidadMiliLitros mililitros) {
        super(precio, marca, mililitros);
        if (marca != Marca.VILLAMANAOS) {
            tipoDeAgua = TipoDeAgua.MINERAL;
        }else {
            tipoDeAgua = TipoDeAgua.INDUSTRIAL;
        }
    }

    public TipoDeAgua getTipoDeAgua() {
        return tipoDeAgua;
    }

    public void setTipoDeAgua(TipoDeAgua tipoDeAgua) {
        this.tipoDeAgua = tipoDeAgua;
    }

}