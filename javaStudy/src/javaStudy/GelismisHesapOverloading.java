package javaStudy;

public class GelismisHesapOverloading {
	
	public static int Topla( int a,int b) {
		
		return a+b;
	}
	public static int Topla(int a,int b,int c) {
		
		return a+b+c;
	}
	public static int Carpma(int a,int b) {
		return a*b;
	}
	public static int Carpma(int a,int b,int c) {
		
		return a*b*c;
	}
	
	

	public static void main(String[] args) {
		
		System.out.println(Topla(2,5));
		System.out.println(Topla(2,5,6));
		System.out.println(Carpma(2,5));
		System.out.println(Carpma(2,5,6));
	}

}
