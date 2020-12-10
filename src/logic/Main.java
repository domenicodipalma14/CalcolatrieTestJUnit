package logic;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calcolatrice c = new Calcolatrice();
		double ris; 
		
		ris = c.somma(5.23, 32.5);
		System.out.println("Somma: "+ris);
		
		ris = c.differenza(5.23, 32.5);
		System.out.println("Differenza: "+ris);
		
		ris = c.moltiplicazione(5.23, 32.5);
		System.out.println("Moltiplicazione: "+ris);
		
		ris = c.divisione(5.23, 32.5);
		System.out.println("Divisione: "+ris);
	}

}
