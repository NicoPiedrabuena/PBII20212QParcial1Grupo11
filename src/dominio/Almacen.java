package dominio;

public class Almacen {

	private Bebida[][] estanteria;

	public Almacen() {
		estanteria = new Bebida[10][10];
	}

	public boolean agregarProducto(Bebida bebidaa) {
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


	public boolean comprarBebida(String marca, CantidadMiliLitros mililitros) {
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

	// terminar de arreglarlo bien -ARREGLADO-
	// MUESTRA LO QUE HAY EN EL ESTANTE - MARCOS
	public String mostrarEstante(Integer fila, Integer columna) {
		String informacion = " ";

		if (estanteria[fila][columna] != null) {
			informacion = "fila =" + fila + ", columa =" + columna + "bebida = " + estanteria[fila][columna].toString();
		}
		return informacion;
	}

	// modificar
	// NO SE QUE HAY QUE MODIFICAR - MARCOS
	// PARA MI YA ESTA BIEN - MARCOS
	public Double calcularPrecioDeLaBebida(String marca, CantidadMiliLitros mililitros) {
		double precio = 0;

		for (int i = 0; i < estanteria.length; i++) {
			for (int j = 0; j < estanteria.length; j++) {
				if (estanteria[i][j] != null && estanteria[i][j].equals(marca)
						&& estanteria[i][j].getMililitros().equals(mililitros)) {
					precio = estanteria[i][j].getPrecio();
					break;
				}
			}
		}
		return precio;
	}

	// AGREGAR METODO "MAPA DE PRECIOS" QUE MUESTRE LOS PRECIOS DE TODA LA
	// ESTANTERIA
	// AGREGAR METODO "MAPA DE PRECIOS" QUE MUESTRE LOS PRECIOS DE TODA LA
	// ESTANTERIA
	// AGREGAR METODO "MAPA DE PRECIOS" QUE MUESTRE LOS PRECIOS DE TODA LA
	// ESTANTERIA

	public Boolean siEsMayor(Integer edad) {
		Boolean puedeTomar = null;

		if (edad >= 18) {
			puedeTomar = true;
		}
		return puedeTomar; 
	}
	
	public String mostrarBebida(){
        /*
         * Devuelve un mapa de los asientos del vuelo indicando por cada uno si se
         * encuentra libre "L" u ocupado "O".
         */
        String L = "L";
        String O = "O";
        String estante= "";
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if (estanteria[i][j] == null) { 
                    estante += "  " + L;
                } else {
                    estante += "  " + O;
                }
            }estante+="\n";
        }
        return estante;
    }

}