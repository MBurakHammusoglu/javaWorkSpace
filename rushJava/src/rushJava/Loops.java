package rushJava;

public class Loops {

	public static void main(String[] args) {
		// While d�ng�s� ko�ul sa�lanana kadar �al���r.
		int i = 0;
		while (i < 5) {
		  System.out.println(i);
		  i++;
		}
		
		/* Do-while d�ng�s�:Bu d�ng�, ko�ulun do�ru olup olmad���n� kontrol 
		 * etmeden �nce kod blo�unu bir kez �al��t�r�r, ard�ndan ko�ul do�ru
		 * oldu�u s�rece d�ng�y� tekrarlar.
		 * */
		int y = 0;
		do {
		  System.out.println(y);
		  y++;
		}
		while (y < 5);
		
		
		// For d�ng�s�:
		for (int x = 0; x < 5; x++) {
			  System.out.println(x);
			}
		
		// For each d�ng�s�:
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String u : cars) {
		  System.out.println(u);
		}

	}

}
