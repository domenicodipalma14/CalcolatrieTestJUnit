package test;

import org.junit.Test;
import static org.junit.Assert.*;

import logic.Calcolatrice;

public class TestSommDiff {

	private Calcolatrice c = new Calcolatrice();
	private double ris;
	private double num1 = 10.0;
	private double num2 = 5.0;
	
	
	private double risSum = 15.0;
	private double risDiff = 5.0;
	
	@Test
	public void testSomma() {
		ris = c.somma(num1, num2);
		assertEquals(risSum, ris, 0);
	}
	
	@Test
	public void testDiff(){
		ris = c.differenza(num1, num2);
		assertEquals(risDiff, ris, 0);
	}
}
