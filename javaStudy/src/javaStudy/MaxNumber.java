package javaStudy;

import java.util.Scanner;

public class MaxNumber {
// Kullan�c� istedigi kadar say� girsin. Diziye at en b�y�g� bul.
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Ka� Say� Gireceksiniz");
		int sayiAdet = scn.nextInt();
		int sayilar[]= new int[sayiAdet]; 
		int enBuyukSayi=0;
		
		for(int i=0;i<sayiAdet;i++)
		{
			System.out.println("Say�y� girin");
			int b = scn.nextInt();
			sayilar[i]=b;
		}
		
		
		for(int i=0;i<sayilar.length;i++) 
		{
			for(int j=1;j<sayilar.length;j++) 
			{
				if(sayilar[i]>sayilar[j]) 
				{
					enBuyukSayi=sayilar[i];
				}else 
				{
					enBuyukSayi=sayilar[j];
				}
			}
		}
		System.out.println("Girilen en b�y�k sayi"+ enBuyukSayi);
	}

}
