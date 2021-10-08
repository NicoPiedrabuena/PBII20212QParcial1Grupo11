package main;

import java.util.Scanner;

import dominio.*;


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
				Marca marca = null;
				CantidadMiliLitros mililitros = null;
				Double precio;
				TipoGaseosa tipoGaseosa = null;
				char opcionRepositor;
				do {
					System.out.println("INGRESE 1 PARA GUARDAR UNA GASEOSA");
					System.out.println("INGRESE 2 PARA GUARDAR UNA BEBIDA CON ALCOHOL");
					System.out.println("INGRESE 3 PARA GUARDAR AGUA");
					System.out.println("INGRESE 0 PARA TERMINAR DE GUARDAR BEBIDAS");
					opcionRepositor = teclado.next().charAt(0);
					char opcionMarca = '0';
					switch (opcionRepositor) {
					case '1':
						System.out.println("INGRESE SU PRECIO");
						precio = teclado.nextDouble();
						System.out.println("INGRESE SU MARCA");
						do {
							System.out.println("1 - MANAOS");
							System.out.println("2- DIA");
							System.out.println("3- BICHY");
							System.out.println("0-para salir");
							opcionMarca = teclado.next().charAt(0);
							switch (opcionMarca) {
							case '1':
								marca = Marca.MANAOS;
								opcionMarca = '0';
								break;
							case '2':
								marca = Marca.DIA;
								opcionMarca = '0';
								break;
							case '3':
								marca = Marca.LA_BICHY;
								opcionMarca = '0';
								break;
							case '0':
								System.out.println("FIN.");
								break;
							default:
								break;
							}
						} while (opcionMarca != '0');
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
								opcionMililitros = '0';
								break;
							case '2':
								mililitros = CantidadMiliLitros.ML1000;
								opcionMililitros = '0';
								break;
							case '3':
								mililitros = CantidadMiliLitros.ML2250;
								opcionMililitros = '0';
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
						char opcionTipoGaseosa = 0;
						do {
							System.out.println("INGRESE 1 SI QUIERE DE COLA");
							System.out.println("INGRESE 2 SI QUIERE DE LIMA");
							System.out.println("INGRESE 3 SI QUIERE DE NARANJA");
							System.out.println("INGRESE 0 PARA SALIR");
							opcionTipoGaseosa = teclado.next().charAt(0);
							switch (opcionTipoGaseosa) {
							case '1':
								tipoGaseosa = TipoGaseosa.BEBIDA_COLA;
								opcionTipoGaseosa = '0';
								break;
							case '2':
								tipoGaseosa = TipoGaseosa.BEBIDA_LIMA;
								opcionTipoGaseosa = '0';
								break;
							case '3':
								tipoGaseosa = TipoGaseosa.BEBIDA_NARANJA;
								opcionTipoGaseosa = '0';
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
							System.out.println("************SE AGREGO UNA BEBIDA A LA ESTANTERIA**********");
							System.out.println("************SE AGREGO UNA BEBIDA A LA ESTANTERIA**********");
							System.out.println("************SE AGREGO UNA BEBIDA A LA ESTANTERIA**********");
							System.out.println("************SE AGREGO UNA BEBIDA A LA ESTANTERIA**********");
						} else {
							System.out.println("NO SE AGREGO NADA A LA ESTANTERIA");
						}
						break;
					case '2':
						System.out.println("INGRESE SU PRECIO");
						precio = teclado.nextDouble();
						System.out.println("INGRESE SU MARCA");

						char opcionTipoAlcohol = 0;
						do {
							System.out.println("INGRESE 1 SI QUIERE QUILMES");
							System.out.println("INGRESE 2 SI QUIERE FERNET");
							System.out.println("INGRESE 3 SI QUIERE GANCIA");
							System.out.println("INGRESE 4 SI QUIERE SMIRNOFF");
							System.out.println("INGRESE 0 PARA SALIR");
							opcionTipoAlcohol = teclado.next().charAt(0);
							switch (opcionTipoAlcohol) {
							case '1':
								marca = Marca.QUILMES;
								opcionTipoAlcohol = '0';
								break;
							case '2':
								marca = Marca.FERNET;
								opcionTipoAlcohol = '0';
								break;
							case '3':
								marca = Marca.GANCIA;
								opcionTipoAlcohol = '0';
								break;
							case '4':
								marca = Marca.SMIRNOFF;
								opcionTipoAlcohol = '0';
								break;
							case '0':
								System.out.println("FIN.");
								break;
							default:
								System.out.println("OPCION INCORRECTA");
								break;
							}
						} while (opcionTipoAlcohol != '0');
						System.out.println("DE CUANTOS MILILITROS ES");
						opcionMililitros = '0';
						do {
							System.out.println("INGRESE 1 SI QUIERE DE 500CC");
							System.out.println("INGRESE 2 SI QUIERE DE 1000CC");
							System.out.println("INGRESE 3 SI QUIERE DE 2250CC");
							System.out.println("INGRESE 0 PARA SALIR");
							opcionMililitros = teclado.next().charAt(0);
							switch (opcionMililitros) {
							case '1':
								mililitros = CantidadMiliLitros.ML500;
								opcionMililitros = '0';
								break;
							case '2':
								mililitros = CantidadMiliLitros.ML1000;
								opcionMililitros = '0';
								break;
							case '3':
								mililitros = CantidadMiliLitros.ML2250;
								opcionMililitros = '0';
								break;
							case '0':
								System.out.println("FIN.");
								break;
							default:
								System.out.println("OPCION INCORRECTA");
								break;
							}
						} while (opcionMililitros != '0');

						BebidaAlcoholica bebidaAlcoholica = new BebidaAlcoholica(precio, marca, mililitros);
						if (nuevoAlmacen.agregarProducto(bebidaAlcoholica)) {
							System.out.println("************SE AGREGO UNA BEBIDA A LA ESTANTERIA**********");
							System.out.println("************SE AGREGO UNA BEBIDA A LA ESTANTERIA**********");
							System.out.println("************SE AGREGO UNA BEBIDA A LA ESTANTERIA**********");
							System.out.println("************SE AGREGO UNA BEBIDA A LA ESTANTERIA**********");
						} else {
							System.out.println("NO SE AGREGO NADA A LA ESTANTERIA");
						}
						break;
					case '3':
						System.out.println("INGRESE SU PRECIO");
						precio = teclado.nextDouble();
						System.out.println("INGRESE SU MARCA");

						do {
							System.out.println("1 - GLACIAR");
							System.out.println("2- VILLAMANAOS");
							System.out.println("3- VILLAVICENCIO");
							System.out.println("0-para salir");
							opcionMarca = teclado.next().charAt(0);
							switch (opcionMarca) {
							case '1':
								marca = Marca.GLACIAR;
								opcionMarca = '0';
								break;
							case '2':
								marca = Marca.VILLAMANAOS;
								opcionMarca = '0';
								break;
							case '3':
								marca = Marca.VILLAVICENCIO;
								opcionMarca = '0';
								break;
							case '0':
								System.out.println("FIN.");
								break;
							default:
								break;
							}
						} while (opcionMarca != '0');
						System.out.println("DE CUANTOS MILILITROS ES");
						opcionMililitros = 0;
						do {
							System.out.println("INGRESE 1 SI QUIERE DE 500CC");
							System.out.println("INGRESE 2 SI QUIERE DE 1000CC");
							System.out.println("INGRESE 3 SI QUIERE DE 2250CC");
							System.out.println("INGRESE 0 PARA SALIR");
							opcionMililitros = teclado.next().charAt(0);
							switch (opcionMililitros) {
							case '1':
								mililitros = CantidadMiliLitros.ML500;
								opcionMililitros = '0';
								break;
							case '2':
								mililitros = CantidadMiliLitros.ML1000;
								opcionMililitros = '0';
								break;
							case '3':
								mililitros = CantidadMiliLitros.ML2250;
								opcionMililitros = '0';
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
							System.out.println("************SE AGREGO UNA BEBIDA A LA ESTANTERIA**********");
							System.out.println("************SE AGREGO UNA BEBIDA A LA ESTANTERIA**********");
							System.out.println("************SE AGREGO UNA BEBIDA A LA ESTANTERIA**********");
							System.out.println("************SE AGREGO UNA BEBIDA A LA ESTANTERIA**********");
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
					System.out.println("INGRESE 0 PARA TERMINAR DE GUARDAR BEBIDAS");
					opcionesCliente = teclado.next().charAt(0);
					char opcionMarca;
					switch (opcionesCliente) {
					case '1':
						System.out.println("INGRESE LA FILA");
						Integer fila = teclado.nextInt();
						System.out.println("INGRESE LA COLUMNA");
						Integer columna = teclado.nextInt();

						System.out.println(nuevoAlmacen.mostrarEstante(fila, columna));

						break;

					case '2':
						// FALTA HACER EL METODO
						// FALTA HACER EL METODO
						// FALTA HACER EL METODO
						// FALTA HACER EL METODO
						nuevoAlmacen.mostrarPrecios();
						break;

					case '3':
						System.out.println("INGRESE SU MARCA");
						Marca marca1 = null;
						do {
							System.out.println("1 - MANAOS");
							System.out.println("2- DIA");
							System.out.println("3- BICHY");
							System.out.println("0-para salir");
							opcionMarca = teclado.next().charAt(0);
							switch (opcionMarca) {
							case '1':
								marca1 = Marca.MANAOS;
								opcionMarca = '0';
								break;
							case '2':
								marca1 = Marca.DIA;
								opcionMarca = '0';
								break;
							case '3':
								marca1 = Marca.LA_BICHY;
								opcionMarca = '0';
								break;
							case '0':
								System.out.println("FIN.");
								break;
							default:
								break;
							}
						} while (opcionMarca != '0');
						System.out.println("INGRESE EL TAMAÑO DE LA BOTELLA");
						char opcionMililitros = 0;
						do {
							System.out.println("INGRESE 1 SI QUIERE DE 500CC");
							System.out.println("INGRESE 2 SI QUIERE DE 1000CC");
							System.out.println("INGRESE 3 SI QUIERE DE 2250CC");
							System.out.println("INGRESE 0 PARA SALIR");
							opcionMililitros = teclado.next().charAt(0);
							mililitros = null;

							switch (opcionMililitros) {
							case '1':
								mililitros = CantidadMiliLitros.ML500;
								opcionMililitros = '0';
								break;
							case '2':
								mililitros = CantidadMiliLitros.ML1000;
								opcionMililitros = '0';
								break;
							case '3':
								mililitros = CantidadMiliLitros.ML2250;
								opcionMililitros = '0';
								break;
							case '0':
								System.out.println("FIN.");
								break;
							default:
								System.out.println("OPCION INCORRECTA");
								break;
							}
						} while (opcionMililitros != '0');

						if (nuevoAlmacen.comprarBebida(marca1, mililitros)) {
							System.out.println("SE LA COMPRA FUE REALIZADA CON EXITO");
						} else {
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

	}
}
