package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAlmacen {

    @Test
    public void queSePuedaAgregarUnaBebidaALCOHOLICA() {

        Almacen loshijosdeputa = new Almacen();

        // Double cantidad, Double precio, String marca
        BebidaAlcoholica vodka = new BebidaAlcoholica(100.00, 10.000, "new style", 05);

        Boolean resultadoEsperado = true;
        Boolean resultadoObtenido = loshijosdeputa.agregarProductoConAlchohol(vodka);

        assertEquals(resultadoEsperado, resultadoObtenido);
    }
    @Test
    public void queSePuedaAgregarProductoSinAlcohol() {

        Almacen loshijosdeputa = new Almacen();

        // Double cantidad, Double precio, String marca, Double porcentajeAzucar, Double
        // promocion,
        Gaseosa cocaCola = new Gaseosa(10.00, 100.000, "cola ", 07, 1.0);

        assertTrue(loshijosdeputa.agregarProductoSinAlcohol(cocaCola));

    }

    //arreglar

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

        loshijosdeputa.agregarProductoConAlchohol(ferno);

        String bebidaEsperada = "branca";

        assertEquals(bebidaEsperada, loshijosdeputa.mostrarBebida());

    }

    //completar 

    @Test
    public void queSePuedaVerElPrecio() {

    }

    //arreglar

    @Test
    public void verSiEsMayorONo() {

        Almacen loshijosdeputa = new Almacen();

        assertFalse(loshijosdeputa.siEsMayor(20));

    }


}
