package test;

import static org.junit.Assert.*;

import org.junit.Test;

import dominio.Almacen;
import dominio.BebidaAlcoholica;
import dominio.CantidadMiliLitros;
import dominio.Gaseosa;
import dominio.TipoAlcohol;
import dominio.TipoGaseosa;

public class testAlmacen {

	@Test
	public void queSePuedaAgregarUnaBebida() {

		Almacen loshijosdeputa = new Almacen();

		// Double cantidad, Double precio, String marca
		BebidaAlcoholica vodka = new BebidaAlcoholica(10.0, "new style", TipoAlcohol.VODKA, CantidadMiliLitros.ML1000);

		Boolean resultadoEsperado = true;
		Boolean resultadoObtenido = loshijosdeputa.agregarProducto(vodka);

		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	@Test
	public void queSePuedaAgregarProductoSinAlcohol() {

		Almacen loshijosdeputa = new Almacen();
		// DDouble precio, String marca, 
		// CantidadMiliLitros miliLitros

		Gaseosa cocaCola = new Gaseosa(125.0, "cola - cola ", CantidadMiliLitros.ML1000);

		assertTrue(loshijosdeputa.agregarProducto(cocaCola));

	}

	// arreglar

	@Test
	public void queSePuedaEliminarBebidas() {

		Almacen loshijosdeputa = new Almacen();

		BebidaAlcoholica vodka = new BebidaAlcoholica(10.0, "new style", TipoAlcohol.VODKA, CantidadMiliLitros.ML1000);

		boolean resultado = loshijosdeputa.comprarBebida("new style" , CantidadMiliLitros.ML1000);

		assertTrue(resultado);
	}

	// fijate el test
	@Test
	public void queSeMuestreLaMarcaDeLaBebida() {

		Almacen loshijosdeputa = new Almacen();

		BebidaAlcoholica ferno = new BebidaAlcoholica(125.0, "branca", TipoAlcohol.FERNET, CantidadMiliLitros.ML1000);

		loshijosdeputa.agregarProducto(ferno);

		String bebidaEsperada = "branca";

		assertEquals(bebidaEsperada, loshijosdeputa.mostrarEstante(null, null));

	}

	// completar

	@Test
	public void queSePuedaVerElPrecio() {

	}

	// arreglar

	@Test
	public void verSiEsMayorONo() {

		Almacen loshijosdeputa = new Almacen();

		assertFalse(loshijosdeputa.siEsMayor(20));

	}

}
