package rushJava;

public class TypeCasting {

	public static void main(String[] args) {
	
	/* Javada iki tip, tip dönüþümü vardýr.
	 * 1-Widening Casting(Geniþleterek Büyütme)(Küçükten Büyüðe):Geniþleterek büyütme java
	 * tarafýndan otomatik yapýlýr.
	 * 2-Narrowing Casting(Daraltarak Büyütme)(Büyükten Kücüðe):Burada tip dönüþümü
	 * yapabilmemiz için dönüþtürecegimiz degerin önüne parantez içinde tipini
	 * yazmamýz gerekiyor.
	 * 
	 * */
	
	
		
		// Widening Casting
		int myInt = 9;
	    double myDouble = myInt; // Automatic casting: int to double

	    System.out.println(myInt);      // Outputs 9
	    System.out.println(myDouble);   // Outputs 9.0
	
	
	// Narrowing Casting
	    double myDouble2 = 9.78d;
	    int myInt2 = (int) myDouble2; // Manual casting: double to int

	    System.out.println(myDouble2);   // Outputs 9.78
	    System.out.println(myInt2);      // Outputs 9

	
	
	
	
	
	}

}
