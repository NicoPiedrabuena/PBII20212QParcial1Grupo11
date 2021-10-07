package dominio;

public class Almacen {

    private Bebida[][] estanteria;

    public Almacen() {
        estanteria = new Bebida[10][10];
    }

    // falta agregar el tipo de gaseosa
    public boolean agregarProductoSinAlcohol(Bebida bebidaa) {
        boolean seAgregoONo = false;
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria.length; j++) {
                if (estanteria[i][j] == null) {
                    estanteria[i][j] = bebidaa;
                    seAgregoONo = true;
                    break;
                }
            }
        }
        return seAgregoONo;

    }

    // falta agregar el tipo de alchol
    public boolean agregarProductoConAlchohol(Bebida bebidaa) {
        boolean seAgregoONo = false;
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria.length; j++) {
                if (estanteria[i][j] == null) {
                    estanteria[i][j] = bebidaa;
                    seAgregoONo = true;
                    break;
                }

            }
        }
        return seAgregoONo;
    }

    public boolean eliminarBebida(Integer id) {
        boolean eliminadoONo = false;
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria.length; j++) {
                if (estanteria[i][j] != null && estanteria[i][j].getId().equals(id)) {
                    estanteria[i][j] = null;
                    eliminadoONo = true;
                    break;
                }
            }
        }
        return eliminadoONo;
    }

    // terminar de arreglarlo bien
    public String mostrarBebida() {
        String valorBebida = " ";
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria.length; j++) {
                if (estanteria[i][j] != null) {
                    valorBebida = "fila =" + i + ", columa =" + j + "bebida = " + estanteria.toString();
                }
            }
        }
        return valorBebida;
    }

    //

    public Double calcularPrecioBebidas(String marca) {
        double precioTotal = 0;

        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria.length; j++) {
                if (estanteria[i][j] != null && estanteria[i][j].equals(marca)) {

                    precioTotal += estanteria[i][j].getPrecio();
                }
            }
        }
        return precioTotal;

    }

    // despues en la interfaz va agregar siso
    public Boolean siEsMayor(Integer edad) {
        Boolean puedeTomar = null;        

        if (edad >= 18) {
            puedeTomar = true;
        }
        return puedeTomar;
    }

}