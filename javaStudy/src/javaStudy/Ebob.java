package javaStudy;

public class Ebob {

	public static void main(String[] args) {
		// 2 say�n�n ebobunu bul
		ebob(18);
		
	}
	
	public static void ebob(int a) {
		int dizi�ndex=0;
		int dizi[]=new int[10];
		
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
					dizi[dizi�ndex]=i;
					dizi�ndex++;
				}
				
			}
		for(int i=0;i<dizi.length;i++) {
			System.out.println(dizi[i]);
		}
		
		}
		
		
		
		
	}


