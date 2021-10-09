package dominio;

public class Almacen {

    private Bebida[][] estanteria;

    public Almacen() {
        estanteria = new Bebida[5][5];
    }

    public boolean agregarProducto(Bebida bebidaa) {
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria.length; j++) {
                if (estanteria[i][j] == null) {
                    estanteria[i][j] = bebidaa;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean comprarBebida(Marca marca, CantidadMiliLitros mililitros) {
        boolean eliminadoONo = false;
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria.length; j++) {
                if (estanteria[i][j] != null && estanteria[i][j].getMarca().equals(marca)
                        && estanteria[i][j].getMililitros().equals(mililitros)) {

                    estanteria[i][j] = null;
                    eliminadoONo = true;
                    break;
                }
            }
        }
        return eliminadoONo;
    }

    public String mostrarEstante(Integer fila, Integer columna) {
        String informacion = null;

        if (estanteria[fila][columna] != null) {
            informacion = "fila =" + fila + ", columa =" + columna + "bebida = " + estanteria[fila][columna].toString();
        }
        return informacion;
    }

    public Double calcularPrecioDeLaBebida(Marca marca, CantidadMiliLitros mililitros) {

        double precio = 0;

        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria.length; j++) {
                if (estanteria[i][j] != null && estanteria[i][j].getMarca().equals(marca)
                        && estanteria[i][j].getMililitros().equals(mililitros)) {
                    precio = estanteria[i][j].getPrecio();
                    break;
                }
            }
        }
        return precio;
    }

    public Boolean siEsMayor(Integer edad) {
        Boolean puedeTomar = false;

        if (edad >= 18) {
            puedeTomar = true;
        }
        return puedeTomar;
    }

    public String mostrarPrecios() {
        String estante = "";

        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria.length; j++) {
                if (estanteria[i][j] != null) {
                    estante += estanteria[i][j].toString();
                } else {
                    estante += "           VACIO         | ";
                }
            }
            estante += "\n";
        }
        return estante;
    }

    public Gaseosa buscarGaseosa(Marca marca) {
        Gaseosa gaseosaEncontrada = null;

        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria.length; j++) {
                if (estanteria[i][j] != null && estanteria[i][j].getMarca().equals(marca)) {
                    gaseosaEncontrada = (Gaseosa) estanteria[i][j];
                    break;
                }
            }
            break;
        }
        return gaseosaEncontrada;
    }

    public BebidaAlcoholica buscarAlcohol(Marca marca) {
        BebidaAlcoholica escabioEncontrado = null;
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria.length; j++) {
                if (estanteria[i][j] != null && estanteria[i][j].getMarca().equals(marca)) {
                    escabioEncontrado = (BebidaAlcoholica) estanteria[i][j];
                    break;
                }
            }
            break;
        }
        return escabioEncontrado;
    }

    public String mostrarBebidas(Marca marca) {
        String informacion = null;
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria.length; j++) {
                if (estanteria[i][j] != null && estanteria[i][j].getMarca().equals(marca)) {
                    informacion += estanteria[i][j].toString() + " ";

                }
            }

        }
        return informacion;
    }

    public Agua buscarAgua(Marca marca) {
        Agua agua = null;
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria.length; j++) {
                if (estanteria[i][j] != null && estanteria[i][j].getMarca().equals(marca)) {
                    agua = (Agua) estanteria[i][j];
                    break;
                }
            }
            break;
        }
        return agua;
    }

}