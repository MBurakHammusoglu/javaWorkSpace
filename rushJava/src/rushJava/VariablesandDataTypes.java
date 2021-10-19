package rushJava;

public class VariablesandDataTypes {

	public static void main(String[] args) {
/* 2 Çeþit veri tipi var. Primitive ve Primitive olmayan
* Primitive:
byte	1 byte	Stores whole numbers from -128 to 127
short	2 bytes	Stores whole numbers from -32,768 to 32,767
int		4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
boolean	1 bit	Stores true or false values
char	2 bytes	Stores a single character/letter or ASCII values

*/
		String name="Burak";
		int sayi=3;
		float sayi2=2.4f;
		char character='c';
		boolean bool=true;
		final int sayi3=10; // final ile tanýmlanan degisken degistirilemez.
		// int sayi3=5; bu kodu actgýmýzda calýsmaz hata verir.
		System.out.println(name);
		System.out.println(sayi);
		System.out.println(sayi2);
		System.out.println(character);
		System.out.println(bool);
		System.out.println(sayi3);
		// println metodu içinde + op. ile birleþimler yapýlabilir.
		
		System.out.println("Selam ben" + name); // gibi
		System.out.println(sayi + sayi2); // gibi iþlemlerde yapýlabilir.
		
		

	}

}
