package rushJava;

public class TypeCasting {

	public static void main(String[] args) {
	
	/* Javada iki tip, tip d�n���m� vard�r.
	 * 1-Widening Casting(Geni�leterek B�y�tme)(K���kten B�y��e):Geni�leterek b�y�tme java
	 * taraf�ndan otomatik yap�l�r.
	 * 2-Narrowing Casting(Daraltarak B�y�tme)(B�y�kten K�c��e):Burada tip d�n���m�
	 * yapabilmemiz i�in d�n��t�recegimiz degerin �n�ne parantez i�inde tipini
	 * yazmam�z gerekiyor.
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
