package test;

import org.junit.Test;

import static org.junit.Assert.*;


import logic.Calcolatrice;


public class TestMolDiv {

	Calcolatrice c = new Calcolatrice();
	private double ris;
	
	private double num1 = 5;
	private double num2 = 0;
	private double risDiv = Double.POSITIVE_INFINITY;
	private double risMol = 0;
	
	@Test
	public void testDiv(){
		ris = c.divisione(num1, num2);
		assertEquals(risDiv, ris, 0.1);
	}
	
	@Test
	public void testMol(){
		ris = c.moltiplicazione(num1, num2);
		assertEquals(risMol, ris, 0.1);
	}

}
