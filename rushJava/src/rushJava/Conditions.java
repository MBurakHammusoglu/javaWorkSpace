package rushJava;

public class Conditions {

	public static void main(String[] args) {
		// Boolean
		
		boolean logic1=true;
		boolean logic2=false;
		 if(logic1=true) {
			 System.out.print(logic2);
		 }
		
		
		// �f-else
		int time = 22;
		if (time < 10) { // 1. Ko�ul
		  System.out.println("Good morning.");
		} else if (time < 20) { // 2. Ko�ul, 1. ko�ul sa�lanmad��� zaman �al���r
		  System.out.println("Good day.");
		} else { // hi�bir ko�ul sa�lanmad���nda �al���r
		  System.out.println("Good evening.");
		}
		
		
		// switch-case
		// break istenilen kosul sagland�g�nda donguden c�kmaya yarar
		// default kosullar saglanmad�g�nda cal�s�r
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
