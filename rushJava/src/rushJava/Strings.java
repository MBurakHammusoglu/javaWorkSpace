package rushJava;

public class Strings {

	public static void main(String[] args) {
		
		String greetings = "Hello";
		String txt="mehmet burak hammusoglu asdasdsadsadasd aadsfsdf";
		
		// Length (Uzunlugu)
		System.out.println("String Length:"+ txt.length());
		
		
		// toUpperCase and toLowerCase (Hepsini büyük ya da küçük harf yapma)
		System.out.println("UpperCase:"+ txt.toUpperCase());
		System.out.println("LowerCase:"+txt.toLowerCase());
		
		// Finding: indexOf (String dizide bir metinin ilk geçtiði yerin indexini döndürür)
		System.out.println("Ýndex:"+txt.indexOf("a"));
		
		// String Concatenation (iki stringi birleþtirme)
		System.out.println(greetings + "" + txt ); // ya da concat metodu ile yapýlabilir.
		System.out.println(greetings.concat(txt));

	}

}