package rushJava;

public class Conditions {

	public static void main(String[] args) {
		// Boolean
		
		boolean logic1=true;
		boolean logic2=false;
		 if(logic1=true) {
			 System.out.print(logic2);
		 }
		
		
		// Ýf-else
		int time = 22;
		if (time < 10) { // 1. Koþul
		  System.out.println("Good morning.");
		} else if (time < 20) { // 2. Koþul, 1. koþul saðlanmadýðý zaman çalýþýr
		  System.out.println("Good day.");
		} else { // hiçbir koþul saðlanmadýðýnda çalýþýr
		  System.out.println("Good evening.");
		}
		
		
		// switch-case
		// break istenilen kosul saglandýgýnda donguden cýkmaya yarar
		// default kosullar saglanmadýgýnda calýsýr
		int day = 4;
		switch (day) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		  default:
			    System.out.println("Looking forward to the Weekend");
		}

	}

}
