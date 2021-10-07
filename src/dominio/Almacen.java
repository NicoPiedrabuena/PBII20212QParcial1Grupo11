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
	// MUESTRA LO QUE HAY EN EL ESTANTE - MARCOS
	public String mostrarBebida(Integer fila, Integer columna) {
		String valorBebida = " ";

		if (estanteria[fila][columna] != null) {
			valorBebida = "fila =" + fila + ", columa =" + columna + "bebida = " + estanteria[fila][columna].toString();
		}
		return valorBebida;
	}

	// POSIBLE METODO "buscarBebidaPorId" PORQUE ME PARECIO QUE FALTABA - MARCOS
	public Bebida buscarBebidaPorId(Integer id) {
		Bebida bebida = null;
		for (int i = 0; i < estanteria.length; i++) {
			for (int j = 0; j < estanteria.length; j++) {
				if (estanteria[i][j] != null && estanteria[i][j].getId().equals(id)) {
					bebida = estanteria[i][j];
					break;
				}
			}
		}
		return bebida;
	}

	// modificar
	//NO SE QUE HAY QUE MODIFICAR - MARCOS
	public Double calcularPrecioDeLaBebida(String marca) {
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