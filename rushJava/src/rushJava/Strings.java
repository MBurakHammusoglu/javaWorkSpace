package rushJava;

public class Strings {

	public static void main(String[] args) {
		
		String greetings = "Hello";
		String txt="mehmet burak hammusoglu asdasdsadsadasd aadsfsdf";
		
		// Length (Uzunlugu)
		System.out.println("String Length:"+ txt.length());
		
		
		// toUpperCase and toLowerCase (Hepsini b�y�k ya da k���k harf yapma)
		System.out.println("UpperCase:"+ txt.toUpperCase());
		System.out.println("LowerCase:"+txt.toLowerCase());
		
		// Finding: indexOf (String dizide bir metinin ilk ge�ti�i yerin indexini d�nd�r�r)
		System.out.println("�ndex:"+txt.indexOf("a"));
		
		// String Concatenation (iki stringi birle�tirme)
		System.out.println(greetings + "" + txt ); // ya da concat metodu ile yap�labilir.
		System.out.println(greetings.concat(txt));

	}

}