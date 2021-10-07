package main;

import java.util.Scanner;

import dominio.Agua;
import dominio.Almacen;
import dominio.BebidaAlcoholica;
import dominio.Gaseosa;



public class MostradorAlmacen {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		Almacen nuevoAlmacen = new Almacen();
		BebidaAlcoholica nuevaBebida = null;
		Gaseosa nuevaGaseosa = null;
		Agua nuevaAgua =null;
		int opcion = 0;

		// FALTA COMPLETAR ALGUNOS TEST , TERMINAR LA INTERFAZ, REE VER LAS PROMOCIONES,
		// METODOS Y VER EL TEMA ENUMS

		do {
			
			System.out.println("INGRESE 1 PARA GUARDAR UNA GASEOSA");
			System.out.println("INGRESE 2 PARA GUARDAR UNA BEBIDA CON ALCOHOL");
			System.out.println("INGRESE 3 PARA GUARDAR AGUA");
			System.out.println("INGRESE 4 PARA VER LO QUE ESTA TOMANDO");
			System.out.println("INGRESE 5 PARA VER LA LISTA DE PRECIOS");
			System.out.println("INGRESE 6 PARA ELIMINAR UNA BEBIDA ");
			
			
			opcion = teclado.nextInt();
			//aca van !!!
			//AGREGAR LAS VARIABLES NECESRIAAS
			
			Double cantidad;
			
			switch (opcion) {
			case 1:
				System.out.println("BEBIDA SIN ALCOHOL");

				System.out.println("INGRESE SU CANDIDA DE ML");
				 cantidad = teclado.nextDouble();

				System.out.println("INGRESE SU PRECIO");
				Double precio = teclado.nextDouble();

				System.out.println("INGRESE SU MARCA");
				String marca = teclado.next();

				// completar para que se recorra solo
				System.out.println("ID");
				Integer id = teclado.nextInt();

				System.out.println("INGRESE LA CANTIDAD DE AZUCAR");
				Double porcentajeAzucar = teclado.nextDouble();

				// ree ver la promocion , deberia dar solo el precio de la promo

				nuevaGaseosa = new Gaseosa(cantidad, precio, marca, id, porcentajeAzucar);

				if (nuevoAlmacen.agregarProductoSinAlcohol(nuevaBebida)) {
					System.out.println("BEBIDA GUARDADA");
				} else {
					System.out.println("NO SE PUDO GURADAR");
				}
				break;

			case 2:
				System.out.println("BEBIDA CON ALCOHOL");

				System.out.println("INGRESE SU CANDIDA DE ML");
				Double cantidad2 = teclado.nextDouble();
				
				System.out.println("INGRESE SU PRECIO");
				Double precio2 = teclado.nextDouble();

				System.out.println("INGRESE SU MARCA");
				String marca2 = teclado.next();

				// completar para que se recorra solo
				System.out.println("id");
				Integer id2 = teclado.nextInt();

				nuevaBebida = new BebidaAlcoholica(cantidad2, precio2, marca2, id2);
				if (nuevoAlmacen.agregarProductoConAlchohol(nuevaBebida)) {
					System.out.println("BEBIDA GUARDADA");
				} else {
					System.out.println("NO SE PUDO GURADAR");
				}

				System.out.println("INGRESE SU EDAD");
				Integer edad = teclado.nextInt();

				if (nuevoAlmacen.siEsMayor(edad) == true) {
					System.out.println("USTED PUEDE CONSUMIR BEBIDAS ALCOHOLICAS");
				} else {
					System.out.println("USTED NO TIENE NO TIENE LA EDAD NECESARIA PARA BEBER");
				}

				break;
			case 3:
				System.out.println("AGREGAR AGUA");
				//Double cantidad, Double precio, String marca, Integer id
				System.out.println("INGRESE LA CANTIDAD DE ML DE LA BOTELLA");
				double cantidad3 =teclado.nextDouble();
				
				System.out.println("INGRESE SU PRECIO");
				double precio3 = teclado.nextDouble();
				System.out.println("INGRESAR LA MARCA");
				String marca3= teclado.next();
				
				// completar para que se recorra solo
				System.out.println("INGRESE LA ID DE LA BEBIDA");
				Integer id3= teclado.nextInt();
				
				nuevaAgua = new Agua(cantidad3, precio3, marca3, id3);
				
				
				//if para ver si se puede guardar o no 
				// nuevoAlmacen.mostrarBebida();				
				//if para ver si se puede guardar o no 			
				// nuevoAlmacen.mostrarBebida();				
				//if para ver si se puede guardar o no 			
				// nuevoAlmacen.mostrarBebida();
				
				break;

			case 4:
				System.out.println("VER LO QUE ESTA TOMANDO");

				System.out.println("USTED ESTA BEBIENDO UN +" + nuevoAlmacen.mostrarBebida());

				break;

			case 5:
				System.out.println("INGRESE UNA MARCA PARA SABER SU PRECIO ");
				String marcaABuscar = teclado.next();

				nuevoAlmacen.calcularPrecioDeLaBebida(marcaABuscar);
				break;

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

}
