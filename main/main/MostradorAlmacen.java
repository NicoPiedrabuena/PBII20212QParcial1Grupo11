package main;

import java.util.Scanner;

import dominio.*;

public class MostradorAlmacen {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Almacen nuevoAlmacen = new Almacen();
		Gaseosa nuevaGaseosa = null;
		Integer opcion = 0;
		CantidadMiliLitros mililitros = null;

		do {
			System.out.println("PRESIONE 1 PARA INGRESAR COMO REPOSITOR");
			System.out.println("PRESIONE 2 PARA INGRESAR COMO CLIENTE");
			System.out.println("PRESIONE 0 PARA SALIR.");
			opcion = teclado.nextInt();
			Marca marca = null;
			switch (opcion) {
			case 1:

				Double precio;
				TipoGaseosa tipoGaseosa = null;
				Integer opcionRepositor;
				do {
					System.out.println("INGRESE 1 PARA GUARDAR UNA GASEOSA");
					System.out.println("INGRESE 2 PARA GUARDAR UNA BEBIDA ALCOHOLICA");
					System.out.println("INGRESE 3 PARA GUARDAR UN AGUA");
					System.out.println("INGRESE 0 PARA SALIR DEL MENU DE REPOSITOR");
					opcionRepositor = teclado.nextInt();
					Integer opcionMarca = 0;
					Integer opcionMililitros;
					switch (opcionRepositor) {
					case 1:
						System.out.println("INGRESE SU PRECIO");
						precio = teclado.nextDouble();
						System.out.println("INGRESE SU MARCA");
						do {
							System.out.println("1 - MANAOS");
							System.out.println("2 - DIA");
							System.out.println("3 - BICHY");
							System.out.println("0 - PARA VOLVER ATRAS");
							opcionMarca = teclado.nextInt();
							switch (opcionMarca) {
							case 1:
								marca = Marca.MANAOS;
								opcionMarca = 0;
								break;
							case 2:
								marca = Marca.DIA;
								opcionMarca = 0;
								break;
							case 3:
								marca = Marca.LA_BICHY;
								opcionMarca = 0;
								break;
							case 0:
								System.out.println("FIN.");
								marca = null;
								break;
							default:
								break;
							}

							if (marca != null) {
								System.out.println("DE CUANTOS MILILITROS ES");

								opcionMililitros = 0;
								do {
									System.out.println("INGRESE 1 SI QUIERE DE 500CC");
									System.out.println("INGRESE 2 SI QUIERE DE 1000CC");
									System.out.println("INGRESE 3 SI QUIERE DE 2250CC");
									System.out.println("INGRESE 0 PARA SALIR");
									opcionMililitros = teclado.nextInt();
									switch (opcionMililitros) {
									case 1:
										mililitros = CantidadMiliLitros.ML500;
										opcionMililitros = 0;
										break;
									case 2:
										mililitros = CantidadMiliLitros.ML1000;
										opcionMililitros = 0;
										break;
									case 3:
										mililitros = CantidadMiliLitros.ML2250;
										opcionMililitros = 0;
										break;
									case 0:
										System.out.println("FIN.");
										mililitros = null;
										break;
									default:
										System.out.println("OPCION INCORRECTA");
										break;
									}
									if (mililitros != null) {
										System.out.println("INGRESE SU TIPO DE GASEOSA");

										Integer opcionTipoGaseosa = 0;
										do {
											System.out.println("INGRESE 1 SI QUIERE DE COLA");
											System.out.println("INGRESE 2 SI QUIERE DE LIMA");
											System.out.println("INGRESE 3 SI QUIERE DE NARANJA");
											System.out.println("INGRESE 0 PARA SALIR");
											opcionTipoGaseosa = teclado.nextInt();
											switch (opcionTipoGaseosa) {
											case 1:
												tipoGaseosa = TipoGaseosa.BEBIDA_COLA;
												opcionTipoGaseosa = 0;
												break;
											case 2:
												tipoGaseosa = TipoGaseosa.BEBIDA_LIMA;
												opcionTipoGaseosa = 0;
												break;
											case 3:
												tipoGaseosa = TipoGaseosa.BEBIDA_NARANJA;
												opcionTipoGaseosa = 0;
												break;
											case 0:
												System.out.println("FIN.");
												tipoGaseosa = null;
												break;
											default:
												System.out.println("OPCION INCORRECTA");
												break;
											}

											if (tipoGaseosa != null) {
												nuevaGaseosa = new Gaseosa(precio, marca, mililitros, tipoGaseosa);
												Integer condition;
												do {
													System.out.println("¿¿QUERES PONERLE PROMOCION??");
													System.out.println("PRESIONE 1 PARA SI");
													System.out.println("PRESIONE 2 PARA NO");
													condition = teclado.nextInt();
													switch (condition) {
													case 1:
														nuevaGaseosa.setEnPromocion(true);
														condition = 0;
														break;
													case 2:
														nuevaGaseosa.setEnPromocion(false);
														condition = 0;
														break;
													default:
														break;
													}
												} while (condition != 0);

												if (nuevoAlmacen.agregarProducto(nuevaGaseosa)) {
													System.out.println(
															"************SE AGREGO UNA BEBIDA A LA ESTANTERIA**********");
													System.out.println(
															"************SE AGREGO UNA BEBIDA A LA ESTANTERIA**********");
													System.out.println(
															"************SE AGREGO UNA BEBIDA A LA ESTANTERIA**********");
													System.out.println(
															"************SE AGREGO UNA BEBIDA A LA ESTANTERIA**********");
													System.out.println("\n");
													System.out.println("\n");
												} else {
													System.out.println(
															"************NO SE AGREGO NADA A LA ESTANTERIA***********");
													System.out.println(
															"************NO SE AGREGO NADA A LA ESTANTERIA***********");
													System.out.println(
															"************NO SE AGREGO NADA A LA ESTANTERIA***********");
													System.out.println("\n");
													System.out.println("\n");
												}
											}

										} while (opcionTipoGaseosa != 0);

									}

								} while (opcionMililitros != 0);

							}

						} while (opcionMarca != 0);

						break;
					case 2:
						System.out.println("INGRESE SU PRECIO");
						precio = teclado.nextDouble();
						System.out.println("INGRESE SU MARCA");

						Integer opcionTipoAlcohol = 0;
						do {
							System.out.println("INGRESE 1 SI QUIERE QUILMES");
							System.out.println("INGRESE 2 SI QUIERE FERNET");
							System.out.println("INGRESE 3 SI QUIERE GANCIA");
							System.out.println("INGRESE 4 SI QUIERE SMIRNOFF");
							System.out.println("INGRESE 0 PARA SALIR");
							opcionTipoAlcohol = teclado.nextInt();
							switch (opcionTipoAlcohol) {
							case 1:
								marca = Marca.QUILMES;
								opcionTipoAlcohol = 0;
								break;
							case 2:
								marca = Marca.FERNET;
								opcionTipoAlcohol = 0;
								break;
							case 3:
								marca = Marca.GANCIA;
								opcionTipoAlcohol = 0;
								break;
							case 4:
								marca = Marca.SMIRNOFF;
								opcionTipoAlcohol = 0;
								break;
							case 0:
								System.out.println("FIN.");
								break;
							default:
								System.out.println("OPCION INCORRECTA");
								break;
							}

							if (marca != null) {
								System.out.println("DE CUANTOS MILILITROS ES");
								opcionMililitros = 0;
								do {
									System.out.println("INGRESE 1 SI QUIERE DE 500CC");
									System.out.println("INGRESE 2 SI QUIERE DE 1000CC");
									System.out.println("INGRESE 3 SI QUIERE DE 2250CC");
									System.out.println("INGRESE 0 PARA SALIR");
									opcionMililitros = teclado.nextInt();
									switch (opcionMililitros) {
									case 1:
										mililitros = CantidadMiliLitros.ML500;
										opcionMililitros = 0;
										break;
									case 2:
										mililitros = CantidadMiliLitros.ML1000;
										opcionMililitros = 0;
										break;
									case 3:
										mililitros = CantidadMiliLitros.ML2250;
										opcionMililitros = 0;
										break;
									case 0:
										System.out.println("FIN.");
										break;
									default:
										System.out.println("OPCION INCORRECTA");
										break;
									}

									if (mililitros != null) {
										BebidaAlcoholica bebidaAlcoholica = new BebidaAlcoholica(precio, marca,
												mililitros);
										if (nuevoAlmacen.agregarProducto(bebidaAlcoholica)) {
											System.out.println(
													"************SE AGREGO UNA BEBIDA A LA ESTANTERIA**********");
											System.out.println(
													"************SE AGREGO UNA BEBIDA A LA ESTANTERIA**********");
											System.out.println(
													"************SE AGREGO UNA BEBIDA A LA ESTANTERIA**********");
											System.out.println(
													"************SE AGREGO UNA BEBIDA A LA ESTANTERIA**********");
											System.out.println("\n");
											System.out.println("\n");
										} else {
											System.out
													.println("***********NO SE AGREGO NADA A LA ESTANTERIA**********");
											System.out
													.println("***********NO SE AGREGO NADA A LA ESTANTERIA**********");
											System.out
													.println("***********NO SE AGREGO NADA A LA ESTANTERIA**********");
											System.out
													.println("***********NO SE AGREGO NADA A LA ESTANTERIA**********");
											System.out.println("\n");
											System.out.println("\n");
										}
									}

								} while (opcionMililitros != 0);

							}

						} while (opcionTipoAlcohol != 0);

						break;
					case 3:
						System.out.println("INGRESE SU PRECIO");
						precio = teclado.nextDouble();
						System.out.println("INGRESE SU MARCA");

						do {
							System.out.println("1 - GLACIAR");
							System.out.println("2 - VILLAMANAOS");
							System.out.println("3 - VILLAVICENCIO");
							System.out.println("0 - para salir");
							opcionMarca = teclado.nextInt();
							switch (opcionMarca) {
							case 1:
								marca = Marca.GLACIAR;
								opcionMarca = 0;
								break;
							case 2:
								marca = Marca.VILLAMANAOS;
								opcionMarca = 0;
								break;
							case 3:
								marca = Marca.VILLAVICENCIO;
								opcionMarca = 0;
								break;
							case 0:
								System.out.println("FIN.");
								break;
							default:
								break;
							}

							if (marca != null) {
								System.out.println("DE CUANTOS MILILITROS ES");
								opcionMililitros = 0;
								do {
									System.out.println("INGRESE 1 SI QUIERE DE 500CC");
									System.out.println("INGRESE 2 SI QUIERE DE 1000CC");
									System.out.println("INGRESE 3 SI QUIERE DE 2250CC");
									System.out.println("INGRESE 0 PARA SALIR");
									opcionMililitros = teclado.nextInt();
									switch (opcionMililitros) {
									case 1:
										mililitros = CantidadMiliLitros.ML500;
										opcionMililitros = 0;
										break;
									case 2:
										mililitros = CantidadMiliLitros.ML1000;
										opcionMililitros = 0;
										break;
									case 3:
										mililitros = CantidadMiliLitros.ML2250;
										opcionMililitros = 0;
										break;
									case 0:
										System.out.println("FIN.");
										break;
									default:
										System.out.println("OPCION INCORRECTA");
										break;
									}

									if (mililitros != null) {
										Agua agua = new Agua(precio, marca, mililitros);
										if (nuevoAlmacen.agregarProducto(agua)) {
											System.out.println(
													"************SE AGREGO UNA BEBIDA A LA ESTANTERIA**********");
											System.out.println(
													"************SE AGREGO UNA BEBIDA A LA ESTANTERIA**********");
											System.out.println(
													"************SE AGREGO UNA BEBIDA A LA ESTANTERIA**********");
											System.out.println(
													"************SE AGREGO UNA BEBIDA A LA ESTANTERIA**********");
											System.out.println("\n");

										} else {
											System.out
													.println("***********NO SE AGREGO NADA A LA ESTANTERIA**********");
											System.out
													.println("***********NO SE AGREGO NADA A LA ESTANTERIA**********");
											System.out
													.println("***********NO SE AGREGO NADA A LA ESTANTERIA**********");
											System.out
													.println("***********NO SE AGREGO NADA A LA ESTANTERIA**********");
											System.out.println("\n");
										}
									}

								} while (opcionMililitros != 0);

							}

						} while (opcionMarca != 0);

						break;
					case 0:
						System.out.println("FIN.");
						break;
					default:
						System.out.println("OPCION INCORRECTA");
						break;
					}
				} while (opcionRepositor != 0);
				break;
			// ACA EMPIEZAN LAS OPCIONES DEL CLIENTE //ACA EMPIEZAN LAS OPCIONES DEL CLIENTE
			// ACA EMPIEZAN LAS OPCIONES DEL CLIENTE //ACA EMPIEZAN LAS OPCIONES DEL CLIENTE
			// ACA EMPIEZAN LAS OPCIONES DEL CLIENTE //ACA EMPIEZAN LAS OPCIONES DEL CLIENTE
			// ACA EMPIEZAN LAS OPCIONES DEL CLIENTE //ACA EMPIEZAN LAS OPCIONES DEL CLIENTE
			case 2:
				Integer opcionesCliente = 0;
				do {
					System.out.println("INGRESE 1 PARA VER UN ESTANTE");
					System.out.println("INGRESE 2 PARA VER LA LISTA DE PRECIOS");
					System.out.println("INGRESE 3 PARA COMPRAR UNA BEBIDA ");
					System.out.println("INGRESE 4 PARA CONSULTAR POR UNA MARCA");

					System.out.println("INGRESE 0 PARA SALIR DEL MENU DE CLIENTE");
					opcionesCliente = teclado.nextInt();
					Integer opcionDeMarca;
					switch (opcionesCliente) {
					case 1:
						System.out.println("INGRESE LA FILA");
						Integer fila = teclado.nextInt();
						System.out.println("INGRESE LA COLUMNA");
						Integer columna = teclado.nextInt();

						if (nuevoAlmacen.mostrarEstante(fila, columna) == null) {
							System.out.println("EL ESTANTE ESTA VACIO");
							System.out.println("EL ESTANTE ESTA VACIO");
							System.out.println("EL ESTANTE ESTA VACIO");
						} else {
							System.out.println(nuevoAlmacen.mostrarEstante(fila, columna));
						}

						break;

					case 2:

						System.out.println(nuevoAlmacen.mostrarPrecios());
						break;

					case 3:
						System.out.println("INGRESE SU MARCA");

						do {

							System.out.println("1 - MANAOS");
							System.out.println("2 - DIA");
							System.out.println("3 - BICHY");
							System.out.println("4 - FERNET");
							System.out.println("5 - GANCIA");
							System.out.println("6 - QUILMES");
							System.out.println("7 - SMIRNOFF");
							System.out.println("8 - GLACIAR");
							System.out.println("9 - VILLAMANAOS");
							System.out.println("10 - VILLAVICENCIO");
							System.out.println("0 - para salir");
							opcionDeMarca = teclado.nextInt();
							switch (opcionDeMarca) {
							case 1:
								marca = Marca.MANAOS;
								opcionDeMarca = 0;
								break;
							case 2:
								marca = Marca.DIA;
								opcionDeMarca = 0;
								break;
							case 3:
								marca = Marca.LA_BICHY;
								opcionDeMarca = 0;
								break;
							case 4:
								marca = Marca.FERNET;

								break;
							case 5:
								marca = Marca.GANCIA;

								break;
							case 6:
								marca = Marca.QUILMES;

								break;
							case 7:
								marca = Marca.SMIRNOFF;

								break;
							case 8:
								marca = Marca.GLACIAR;
								opcionDeMarca = 0;
								break;
							case 9:
								marca = Marca.VILLAMANAOS;
								opcionDeMarca = 0;
								break;
							case 10:
								marca = Marca.VILLAVICENCIO;
								opcionDeMarca = 0;
								break;
							case 0:
								System.out.println("FIN.");
								break;
							default:
								System.out.println("OPCION INCORRECTA");
								marca = null;
								break;
							}

							if (marca != null && (nuevoAlmacen.buscarGaseosa(marca) != null
									|| nuevoAlmacen.buscarAgua(marca) != null
									|| nuevoAlmacen.buscarAlcohol(marca) != null)) {
								if (marca.equals(Marca.FERNET) || marca.equals(Marca.GANCIA)
										|| marca.equals(Marca.QUILMES) || marca.equals(Marca.SMIRNOFF)) {
									System.out.println("INGRESE SU EDAD");
									Integer edad = teclado.nextInt();
									if (!nuevoAlmacen.siEsMayor(edad)) {
										System.out.println("NO PUEDE COMPRAR ALCOHOL, ELIJA OTRA OPCION");

									} else {
										Integer respuesta;
										do {

											System.out.println("QUERES SABER EL PORCENTAJE DE ALCOHOL?");
											System.out.println("PRESIONE 1 PARA SI");
											System.out.println("PRESIONE 2 PARA NO");
											respuesta = teclado.nextInt();

											switch (respuesta) {
											case 1:
												if (nuevoAlmacen.buscarAlcohol(marca) != null) {
													System.out.println("el porcentaje de alcohol es de: "
															+ nuevoAlmacen.buscarAlcohol(marca).getGradoDeAlchol()
															+ "%");
												}

												respuesta = 0;
												break;
											case 2:
												respuesta = 0;
												break;
											default:
												break;
											}
										} while (respuesta != 0);
										opcionDeMarca = 0;
									}

								}

								if (marca.equals(Marca.DIA) || marca.equals(Marca.LA_BICHY)
										|| marca.equals(Marca.MANAOS)) {

									Integer respuesta;
									do {
										System.out.println("QUERES SABER EL PORCENTAJE DE AZUCAR?");
										System.out.println("PRESIONE 1 PARA SI");
										System.out.println("PRESIONE 2 PARA NO");
										respuesta = teclado.nextInt();

										switch (respuesta) {
										case 1:
											if (nuevoAlmacen.buscarGaseosa(marca) != null) {
												System.out.println("el porcentaje de azucar es de: "
														+ nuevoAlmacen.buscarGaseosa(marca).getPorcentajeAzucar()
														+ "%");
											} else {
												System.out.println("NO HAY STOCK");
											}
											respuesta = 0;
											break;
										case 2:
											respuesta = 0;
											break;
										default:
											break;
										}
									} while (respuesta != 0);

								}

								if (marca.equals(Marca.VILLAMANAOS) || marca.equals(Marca.VILLAVICENCIO)
										|| marca.equals(Marca.GLACIAR)) {
									Integer preguntaAgua;
									do {
										System.out.println("QUERES SABER QUE TIPO DE AGUA ES");
										System.out.println("PRESIONE 1 PARA SI");
										System.out.println("PRESIONE 2 PARA NO");
										preguntaAgua = teclado.nextInt();

										switch (preguntaAgua) {
										case 1:
											if (nuevoAlmacen.buscarAgua(marca) != null) {
												System.out.println("el tipo de agua es : "
														+ nuevoAlmacen.buscarAgua(marca).getTipoDeAgua());
											} else {
												System.out.println("NO HAY STOCK");
											}
											preguntaAgua = 0;
											break;
										case 2:
											preguntaAgua = 0;
											break;
										default:
											break;
										}
									} while (preguntaAgua != 0);
								}

								System.out.println("INGRESE EL TAMAÑO DE LA BOTELLA");
								Integer opcionMililitros = 0;
								do {
									System.out.println("INGRESE 1 SI QUIERE DE 500CC");
									System.out.println("INGRESE 2 SI QUIERE DE 1000CC");
									System.out.println("INGRESE 3 SI QUIERE DE 2250CC");
									System.out.println("INGRESE 0 PARA SALIR");
									opcionMililitros = teclado.nextInt();
									mililitros = null;

									switch (opcionMililitros) {
									case 1:
										mililitros = CantidadMiliLitros.ML500;
										opcionMililitros = 0;
										break;
									case 2:
										mililitros = CantidadMiliLitros.ML1000;
										opcionMililitros = 0;
										break;
									case 3:
										mililitros = CantidadMiliLitros.ML2250;
										opcionMililitros = 0;
										break;
									case 0:
										System.out.println("FIN.");
										break;
									default:
										System.out.println("OPCION INCORRECTA");
										break;
									}
								} while (opcionMililitros != 0);

								if (mililitros != null) {
									if (nuevoAlmacen.comprarBebida(marca, mililitros)) {
										System.out
												.println("***********SE LA COMPRA FUE REALIZADA CON EXITO***********");
										System.out
												.println("***********SE LA COMPRA FUE REALIZADA CON EXITO***********");
										System.out
												.println("***********SE LA COMPRA FUE REALIZADA CON EXITO***********");
										System.out
												.println("***********SE LA COMPRA FUE REALIZADA CON EXITO***********");
										System.out.println("\n");

									} else {
										System.out
												.println("***********NO HAY STOCK DE LO QUE DESEA COMPRAR***********");
										System.out
												.println("***********NO HAY STOCK DE LO QUE DESEA COMPRAR***********");
										System.out
												.println("***********NO HAY STOCK DE LO QUE DESEA COMPRAR***********");
										System.out
												.println("***********NO HAY STOCK DE LO QUE DESEA COMPRAR***********");
										System.out.println("\n");

									}
								}

							}
						} while (opcionDeMarca != 0);

						break;
					case 4:
						System.out.println("INGRESE LA MARCA POR LA QUE DESEA CONSULTAR");
						do {

							System.out.println("1 - MANAOS");
							System.out.println("2 - DIA");
							System.out.println("3 - BICHY");
							System.out.println("4 - FERNET");
							System.out.println("5 - GANCIA");
							System.out.println("6 - QUILMES");
							System.out.println("7 - SMIRNOFF");
							System.out.println("8 - GLACIAR");
							System.out.println("9 - VILLAMANAOS");
							System.out.println("10 - VILLAVICENCIO");
							System.out.println("0 - para salir");
							opcionDeMarca = teclado.nextInt();
							switch (opcionDeMarca) {
							case 1:
								marca = Marca.MANAOS;
								opcionDeMarca = 0;
								break;
							case 2:
								marca = Marca.DIA;
								opcionDeMarca = 0;
								break;
							case 3:
								marca = Marca.LA_BICHY;
								opcionDeMarca = 0;
								break;
							case 4:
								marca = Marca.FERNET;

								break;
							case 5:
								marca = Marca.GANCIA;

								break;
							case 6:
								marca = Marca.QUILMES;

								break;
							case 7:
								marca = Marca.SMIRNOFF;

								break;
							case 8:
								marca = Marca.GLACIAR;
								opcionDeMarca = 0;
								break;
							case 9:
								marca = Marca.VILLAMANAOS;
								opcionDeMarca = 0;
								break;
							case 10:
								marca = Marca.VILLAVICENCIO;
								opcionDeMarca = 0;
								break;
							case 0:
								System.out.println("FIN.");
								break;
							default:
								System.out.println("OPCION INCORRECTA");
								marca = null;
								break;
							}
							
							if (marca != null) {
								if (nuevoAlmacen.mostrarBebidas(marca) != null) {
									System.out.println(nuevoAlmacen.mostrarBebidas(marca));
								} else {
									System.out.println("NO HAY STOCK DE ESA MARCA");
								}
							}
							
						} while (opcionDeMarca != 0);

						

						break;
					case 0:
						System.out.println("FIN.");
						break;
					default:
						break;
					}
				} while (opcionesCliente != 0);
				break;
			default:
				break;
			}
		} while (opcion != 0);

	}
}
