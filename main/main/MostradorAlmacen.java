package main;

import java.util.Scanner;

import dominio.Agua;
import dominio.Almacen;
import dominio.BebidaAlcoholica;
import dominio.CantidadMiliLitros;
import dominio.Gaseosa;
import dominio.TipoAlcohol;
import dominio.TipoGaseosa;

public class MostradorAlmacen {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		Almacen nuevoAlmacen = new Almacen();
		BebidaAlcoholica nuevaBebida = null;
		Gaseosa nuevaGaseosa = null;
		Agua nuevaAgua = null;
		char opcion = '0';

		do {
			System.out.println("PRESIONE 1 PARA INGRESAR COMO REPOSITOR");
			System.out.println("PRESIONE 2 PARA INGRESAR COMO CLIENTE");
			opcion = teclado.next().charAt(0);
			switch (opcion) {
			case '1':
				String marca;
				String marca;
				CantidadMiliLitros mililitros;
				Double precio;
				TipoAlcohol tipoAlcohol;
				TipoGaseosa tipoGaseosa;
				char opcionRepositor;
				do {
					System.out.println("INGRESE 1 PARA GUARDAR UNA GASEOSA");
					System.out.println("INGRESE 2 PARA GUARDAR UNA BEBIDA CON ALCOHOL");
					System.out.println("INGRESE 3 PARA GUARDAR AGUA");
					opcionRepositor = teclado.next().chartAt(0);
					switch (opcionRepositor) {
					case '1':
						System.out.println("INGRESE SU PRECIO");
						precio = teclado.nextDouble();

						System.out.println("INGRESE SU MARCA");
						marca = teclado.next();

						System.out.println("DE CUANTOS MILILITROS ES");
						char opcionMililitros = 0;
						do {
							System.out.println("INGRESE 1 SI QUIERE DE 500CC");
							System.out.println("INGRESE 2 SI QUIERE DE 1000CC");
							System.out.println("INGRESE 3 SI QUIERE DE 2250CC");
							System.out.println("INGRESE 0 PARA SALIR");

							opcionMililitros = teclado.next().charAt(0);
							switch (opcionMililitros) {
							case '1':
								mililitros = CantidadMiliLitros.ML500;
								break;
							case '2':
								mililitros = CantidadMiliLitros.ML1000;
								break;
							case '3':
								mililitros = CantidadMiliLitros.ML2250;
								break;
							case '0':
								System.out.println("FIN.");
								break;
							default:
								System.out.println("OPCION INCORRECTA");
								break;
							}
						} while (opcionMililitros != '0');

						// PUEDE SUSTITUIR A MARCA
						System.out.println("INGRESE SU TIPO DE GASEOSA"); // PUEDE SUSTITUIR A MARCA
						// PUEDE SUSTITUIR A MARCA
						char opcionTipoGaseosa;
						do {
							System.out.println("INGRESE 1 SI QUIERE DE COLA");
							System.out.println("INGRESE 2 SI QUIERE DE LIMA");
							System.out.println("INGRESE 3 SI QUIERE DE NARANJA");
							System.out.println("INGRESE 0 PARA SALIR");
							switch (opcionTipoGaseosa) {
							case '1':
								tipoGaseosa = TipoGaseosa.BEBIDA_COLA;
								break;
							case '2':
								tipoGaseosa = TipoGaseosa.BEBIDA_LIMA;
								break;
							case '3':
								tipoGaseosa = TipoGaseosa.BEBIDA_NARANJA;
								break;
							case '0':
								System.out.println("FIN.");
								break;
							default:
								System.out.println("OPCION INCORRECTA");
								break;
							}

						} while (opcionTipoGaseosa != '0');

						Gaseosa gaseosa = new Gaseosa(precio, marca, mililitros, tipoGaseosa);

						if (nuevoAlmacen.agregarProducto(gaseosa)) {
							System.out.println("SE AGREGO UNA BEBIDA A LA ESTANTERIA");
						} else {
							System.out.println("NO SE AGREGO NADA A LA ESTANTERIA");
						}

						break;
					case '2':
						System.out.println("INGRESE SU PRECIO");
						precio = teclado.nextDouble();

						System.out.println("INGRESE SU MARCA");
						marca = teclado.next();

						System.out.println("DE CUANTOS MILILITROS ES");
						char opcionMililitros = 0;
						do {
							System.out.println("INGRESE 1 SI QUIERE DE 500CC");
							System.out.println("INGRESE 2 SI QUIERE DE 1000CC");
							System.out.println("INGRESE 3 SI QUIERE DE 2250CC");
							System.out.println("INGRESE 0 PARA SALIR");

							opcionMililitros = teclado.next().charAt(0);
							switch (opcionMililitros) {
							case '1':
								mililitros = CantidadMiliLitros.ML500;
								break;
							case '2':
								mililitros = CantidadMiliLitros.ML1000;
								break;
							case '3':
								mililitros = CantidadMiliLitros.ML2250;
								break;
							case '0':
								System.out.println("FIN.");
								break;
							default:
								System.out.println("OPCION INCORRECTA");
								break;
							}
						} while (opcionMililitros != '0');

						// PUEDE SUSTITUIR A MARCA
						System.out.println("INGRESE SU TIPO DE GASEOSA"); // PUEDE SUSTITUIR A MARCA
						// PUEDE SUSTITUIR A MARCA
						char opcionTipoAlcohol;
						do {
							System.out.println("INGRESE 1 SI QUIERE CERVEZA");
							System.out.println("INGRESE 2 SI QUIERE FERNET");
							System.out.println("INGRESE 3 SI QUIERE GANCIA");
							System.out.println("INGRESE 4 SI QUIERE VODKA");
							System.out.println("INGRESE 0 PARA SALIR");
							switch (opcionTipoAlcohol) {
							case '1':
								tipoAlcohol = tipoAlcohol.CERVEZA;
								break;
							case '2':
								tipoAlcohol = tipoAlcohol.FERNET;
								break;
							case '3':
								tipoAlcohol = tipoAlcohol.GANCIA;
								break;
							case '4':
								tipoAlcohol = tipoAlcohol.VODKA;
								break;
							case '0':
								System.out.println("FIN.");
								break;
							default:
								System.out.println("OPCION INCORRECTA");
								break;
							}

						} while (opcionTipoAlcohol != '0');
						BebidaAlcoholica bebidaAlcoholica = new BebidaAlcoholica(precio, marca, mililitros,
								tipoAlcohol);

						if (nuevoAlmacen.agregarProducto(bebidaAlcoholica)) {
							System.out.println("SE AGREGO UNA BEBIDA A LA ESTANTERIA");
						} else {
							System.out.println("NO SE AGREGO NADA A LA ESTANTERIA");
						}
						break;
					case '3':
						System.out.println("INGRESE SU PRECIO");
						precio = teclado.nextDouble();

						System.out.println("INGRESE SU MARCA");
						marca = teclado.next();

						System.out.println("DE CUANTOS MILILITROS ES");
						char opcionMililitros = 0;
						do {
							System.out.println("INGRESE 1 SI QUIERE DE 500CC");
							System.out.println("INGRESE 2 SI QUIERE DE 1000CC");
							System.out.println("INGRESE 3 SI QUIERE DE 2250CC");
							System.out.println("INGRESE 0 PARA SALIR");

							opcionMililitros = teclado.next().charAt(0);
							switch (opcionMililitros) {
							case '1':
								mililitros = CantidadMiliLitros.ML500;
								break;
							case '2':
								mililitros = CantidadMiliLitros.ML1000;
								break;
							case '3':
								mililitros = CantidadMiliLitros.ML2250;
								break;
							case '0':
								System.out.println("FIN.");
								break;
							default:
								System.out.println("OPCION INCORRECTA");
								break;
							}
						} while (opcionMililitros != '0');

						Agua agua = new Agua(precio, marca, mililitros);

						if (nuevoAlmacen.agregarProducto(agua)) {
							System.out.println("SE AGREGO UN AGUA A LA ESTANTERIA");
						} else {
							System.out.println("NO SE AGREGO NADA.");
						}

						break;
					case '0':
						System.out.println("FIN.");
						break;
					default:
						System.out.println("OPCION INCORRECTA");
						break;
					}

				} while (opcionRepositor != '0');
				break;

			// ACA EMPIEZAN LAS OPCIONES DEL CLIENTE //ACA EMPIEZAN LAS OPCIONES DEL CLIENTE
			// ACA EMPIEZAN LAS OPCIONES DEL CLIENTE //ACA EMPIEZAN LAS OPCIONES DEL CLIENTE
			// ACA EMPIEZAN LAS OPCIONES DEL CLIENTE //ACA EMPIEZAN LAS OPCIONES DEL CLIENTE
			// ACA EMPIEZAN LAS OPCIONES DEL CLIENTE //ACA EMPIEZAN LAS OPCIONES DEL CLIENTE
			case '2':
				char opcionesCliente = '0';
				do {
					System.out.println("INGRESE 1 PARA VER UNA GASEOSA");
					System.out.println("INGRESE 2 PARA VER LA LISTA DE PRECIOS");
					System.out.println("INGRESE 3 PARA COMPRAR UNA BEBIDA ");
					opcionesCliente = teclado.next().chartAt(0);
					switch (opcionesCliente) {
					case '1':
						System.out.println("INGRESE LA FILA");
						Integer fila = teclado.nextInt();
						System.out.println("INGRESE LA COLUMNA");
						Integer columna = teclado.nextInt();
						
						System.out.println(nuevoAlmacen.mostrarEstante(fila, columna));
						
						
						break;
						
					case '2':
						//FALTA HACER EL METODO
						//FALTA HACER EL METODO
						//FALTA HACER EL METODO
						//FALTA HACER EL METODO
						nuevoAlmacen.mostrarPrecios();
						break;
						
					case '3':
						System.out.println("INGRESE LA MARCA");
						marca = teclado.next();
						System.out.println("INGRESE EL TAMAÑO DE LA BOTELLA");
						char opcionMililitros = 0;
						do {
							System.out.println("INGRESE 1 SI QUIERE DE 500CC");
							System.out.println("INGRESE 2 SI QUIERE DE 1000CC");
							System.out.println("INGRESE 3 SI QUIERE DE 2250CC");
							System.out.println("INGRESE 0 PARA SALIR");

							opcionMililitros = teclado.next().charAt(0);
							switch (opcionMililitros) {
							case '1':
								mililitros = CantidadMiliLitros.ML500;
								break;
							case '2':
								mililitros = CantidadMiliLitros.ML1000;
								break;
							case '3':
								mililitros = CantidadMiliLitros.ML2250;
								break;
							case '0':
								System.out.println("FIN.");
								break;
							default:
								System.out.println("OPCION INCORRECTA");
								break;
							}
						} while (opcionMililitros != '0');
						
						if (nuevoAlmacen.comprarBebida(marca, mililitros)) {
							System.out.println("SE LA COMPRA FUE REALIZADA CON EXITO");
						}else {
							System.out.println("NO SE PUDO COMPRAR.");
						}
						
						break;
					case '0':
						System.out.println("FIN.");
						break;
					default:
						break;
					}
				} while (opcionesCliente != '0');
				break;
			default:
				break;
			}
		} while (opcion != 0);

		// DE ACA PARA ABAJO ES VIEJO ES LA VERSION ANTERIOR//DE ACA PARA ABAJO ES VIEJO
		// ES
		// DE ACA PARA ABAJO ES VIEJO ES LA VERSION ANTERIOR//DE ACA PARA ABAJO ES VIEJO
		// ES
		// DE ACA PARA ABAJO ES VIEJO ES LA VERSION ANTERIOR//DE ACA PARA ABAJO ES VIEJO
		// ES LA VERSION ANTERIOR
		// DE ACA PARA ABAJO ES VIEJO ES LA VERSION ANTERIOR//DE ACA PARA ABAJO ES VIEJO
		// ES LA VERSION ANTERIOR
		// DE ACA PARA ABAJO ES VIEJO ES LA VERSION ANTERIOR//DE ACA PARA ABAJO ES VIEJO
		// ES LA VERSION ANTERIOR

		// FALTA COMPLETAR ALGUNOS TEST , TERMINAR LA INTERFAZ, REE VER LAS PROMOCIONES,
		// METODOS Y VER EL TEMA ENUMS

		do {

			// AGREGAR OPCION BUSCAR BEBIDA

			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("BEBIDA SIN ALCOHOL");

				// AGREGAR ENUM DE ML DE GASEOSA 500ML, 1L, 2L
				// AGREGAR ENUM DE ML DE GASEOSA 500ML, 1L, 2L
				// AGREGAR ENUM DE ML DE GASEOSA 500ML, 1L, 2L
				// AGREGAR ENUM DE ML DE GASEOSA 500ML, 1L, 2L

				// ree ver la promocion , deberia dar solo el precio de la promo
				// ree ver la promocion , deberia dar solo el precio de la promo
				// ree ver la promocion , deberia dar solo el precio de la promo
				// ree ver la promocion , deberia dar solo el precio de la promo
				// ree ver la promocion , deberia dar solo el precio de la promo

				do {

					System.out.println("INGRESE EL TIPO DE GASEOSA ");
					char opcionGaseosa = teclado.next().charAt(0);
					switch (opcionGaseosa) {
					case 1:
						tipoGaseosa = TipoGaseosa.BEBIDA_COLA;
						break;
					case 2:
						tipoGaseosa = TipoGaseosa.BEBIDA_LIMA;
						break;
					case 3:
						tipoGaseosa = TipoGaseosa.BEBIDA_NARANJA;
						break;
					case 0:
						System.out.println("FIN");
						break;
					default:
						break;
					}
				} while (opcion != 0);

				nuevaGaseosa = new Gaseosa(cantidad, precio, marca, tipoGaseosa);

				if (nuevoAlmacen.agregarProductoSinAlcohol(nuevaBebida)) {
					System.out.println("BEBIDA GUARDADA");
				} else {
					System.out.println("NO SE PUDO GURADAR");
				}
				break;

			case 2:
				System.out.println("BEBIDA CON ALCOHOL");

				System.out.println("INGRESE SU CANDIDA DE ML");
				cantidad = teclado.nextDouble();

				System.out.println("INGRESE SU PRECIO");
				precio = teclado.nextDouble();

				System.out.println("INGRESE SU MARCA");
				marca = teclado.next();

				System.out.println("INGRESE SU EDAD");
				Integer edad = teclado.nextInt();

				if (nuevoAlmacen.siEsMayor(edad)) {
					System.out.println("USTED PUEDE CONSUMIR BEBIDAS ALCOHOLICAS");
				} else {
					System.out.println("USTED NO TIENE NO TIENE LA EDAD NECESARIA PARA BEBER");
				}

				do {

					System.out.println("INGRESE EL TIPO DE BEBIDA ALCOHOLICA");

					char opcionAlcohol = teclado.next().charAt(0);
					switch (opcionAlcohol) {
					case 1:
						tipoAlcohol = TipoAlcohol.CERVEZA;
						break;
					case 2:
						tipoAlcohol = TipoAlcohol.FERNET;
						break;
					case 3:
						tipoAlcohol = TipoAlcohol.GANCIA;
						break;
					case 4:
						tipoAlcohol = TipoAlcohol.VODKA;
						break;
					case 0:
						System.out.println("FIN");
						break;
					default:
						break;
					}
				} while (opcion != 0);
				nuevaBebida = new BebidaAlcoholica(cantidad, precio, marca, tipoAlcohol);
				if (nuevoAlmacen.agregarProductoConAlchohol(nuevaBebida)) {
					System.out.println("BEBIDA GUARDADA");
				} else {
					System.out.println("NO SE PUDO GUARDAR");
				}

				break;
			case 3:
				System.out.println("AGREGAR AGUA");
				// Double cantidad, Double precio, String marca, Integer id

	

				System.out.println("INGRESE LA CANTIDAD DE ML DE LA BOTELLA");
				cantidad = teclado.nextDouble();

				System.out.println("INGRESE SU PRECIO");
				precio = teclado.nextDouble();
				System.out.println("INGRESAR LA MARCA");
				marca = teclado.next();

				nuevaAgua = new Agua(cantidad, precio, marca, id);
				if (nuevoAlmacen.agregarProductoSinAlcohol(nuevaAgua)) {
					System.out.println("AGUA GUARDADA");
				} else {
					System.out.println("NO SE PUDO GUARDAR");
				}

				break;

			case 4:

				// AGREGAR UN COMPORTAMIENTO DISTINTO
				// AGREGAR UN COMPORTAMIENTO DISTINTO
				// AGREGAR UN COMPORTAMIENTO DISTINTO
				// AGREGAR UN COMPORTAMIENTO DISTINTO
				// AGREGAR UN COMPORTAMIENTO DISTINTO

				// System.out.println("USTED ESTA BEBIENDO UN " + nuevoAlmacen.mostrarBebida());

				break;

			case 5:
				System.out.println("INGRESE UNA MARCA PARA SABER SU PRECIO ");
				String marcaABuscar = teclado.next();

				nuevoAlmacen.calcularPrecioDeLaBebida(marcaABuscar);
				break;
			// METODO INCOMPLETO !HAY QUE TERMINARLO!
			// METODO INCOMPLETO !HAY QUE TERMINARLO!
			// METODO INCOMPLETO !HAY QUE TERMINARLO!
			// METODO INCOMPLETO !HAY QUE TERMINARLO!
			case 6:
				System.out.println("INGRESE EL ID DE LA BEBIDA A ELEMINAR");
				Integer bebidaAEliminar = teclado.nextInt();

				if (nuevoAlmacen.eliminarBebida(bebidaAEliminar)) {
					System.out.println("BEBIDA ELIMINADA");
				} else {
					System.out.println("NO SE PUDO ELIMINAR LA BEBIDA");
				}

				break;

			default:
				System.out.println("OPCION INVALIDA");
				break;
			}
		} while (opcion != 9);
	}
}
