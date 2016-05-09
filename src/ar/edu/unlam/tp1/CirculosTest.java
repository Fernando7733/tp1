package ar.edu.unlam.tp1;


import static org.junit.Assert.*;

import org.junit.Test;

public class CirculosTest {

	private double precision = 0.01;	
	
	@Test
	public void crearUnCirculoConRadio2() {
		Circulo circulo = new Circulo(2);
		 assertEquals(2, circulo.obtenerRadio(), precision);
	}
	
	@Test
	public void crearUnCirculoConRadio3Punto7() {
		Circulo circulo = new Circulo(3.7);
		assertEquals(3.7, circulo.obtenerRadio(), precision);
	}
	
	@Test
	public void crearUnCirculoConRadio5() {
		Circulo circulo = new Circulo(5);
		assertEquals(5, circulo.obtenerRadio(), precision);
	}
	
	@Test
	public void crearUnCirculoConRadio10Punto9() {
		Circulo circulo = new Circulo(10.9);
		assertEquals(10.9, circulo.obtenerRadio(), precision);
	}
	
	@Test
	public void queElPerimetroDeUnCirculoConRadio9Punto8Es61Punto57() {
		Circulo circulo = new Circulo(9.8);
		circulo.obtenerPerimetro();		
		assertEquals(61.57, circulo.obtenerPerimetro(), precision);
	}
	
	@Test
	public void queElPerimetroDeUnCirculoConRadio16Punto6Es104Punto30() {
		Circulo circulo = new Circulo(16.6);
		circulo.obtenerPerimetro();		
		assertEquals(104.30, circulo.obtenerPerimetro(), precision);
	}
	
	@Test
	public void queElAreaDeUnCirculoConRadio9Punto8Es301Punto71() {
		Circulo circulo = new Circulo(9.8);		
		circulo.obtenerArea();		
		assertEquals(301.71, circulo.obtenerArea(), precision);
	}
	
	@Test
	public void queElAreaDeUnCirculoConRadio16Punto6Es865Punto69() {
		Circulo circulo = new Circulo(16.6);
		circulo.obtenerArea();		
		assertEquals(865.69, circulo.obtenerArea(), precision);
	}
	
	@Test
	public void queElTipDeAyudaDeVerde(){ // :)
		
		Double esperado = 1.10;
		Double actual = 1.10;
		
	
		assertEquals(esperado.doubleValue(), actual.doubleValue(),0.01);
	}
}