package rushJava;

public class Loops {

	public static void main(String[] args) {
		// While döngüsü koþul saðlanana kadar çalýþýr.
		int i = 0;
		while (i < 5) {
		  System.out.println(i);
		  i++;
		}
		
		/* Do-while döngüsü:Bu döngü, koþulun doðru olup olmadýðýný kontrol 
		 * etmeden önce kod bloðunu bir kez çalýþtýrýr, ardýndan koþul doðru
		 * olduðu sürece döngüyü tekrarlar.
		 * */
		int y = 0;
		do {
		  System.out.println(y);
		  y++;
		}
		while (y < 5);
		
		
		// For döngüsü:
		for (int x = 0; x < 5; x++) {
			  System.out.println(x);
			}
		
		// For each döngüsü:
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String u : cars) {
		  System.out.println(u);
		}

	}

}
