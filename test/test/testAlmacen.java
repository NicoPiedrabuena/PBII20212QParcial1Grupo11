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
		BebidaAlcoholica vodka = new BebidaAlcoholica(100.00, 10.000, "new style", TipoAlcohol.GANCIA,
				CantidadMiliLitros.ML1000);

		Boolean resultadoEsperado = true;
		Boolean resultadoObtenido = loshijosdeputa.agregarProducto(vodka);

		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	@Test
	public void queSePuedaAgregarProductoSinAlcohol() {

		Almacen loshijosdeputa = new Almacen();
		// Double cantidad, Double precio, String marca, TipoGaseosa tipoDeGaseosa,
		// CantidadMiliLitros miliLitros

		Gaseosa cocaCola = new Gaseosa(10.00, 100.000, "cola ", 07, 1.0);

		assertTrue(loshijosdeputa.agregarProductoSinAlcohol(cocaCola));

	}

	// arreglar

	@Test
	public void queSePuedaEliminarBebidas() {

		Almacen loshijosdeputa = new Almacen();

		BebidaAlcoholica vodka = new BebidaAlcoholica(100.00, 10.000, "new style", 100);

		boolean resultado = loshijosdeputa.eliminarBebida(100);

		assertTrue(resultado);
	}

	// fijate el test
	@Test
	public void queSeMuestreLaMarcaDeLaBebida() {

		Almacen loshijosdeputa = new Almacen();

		BebidaAlcoholica ferno = new BebidaAlcoholica(100.00, 10.000, "branca", 100);

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
