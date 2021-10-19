package javaStudy;

import java.util.Scanner;

public class MaxNumber {
// Kullanýcý istedigi kadar sayý girsin. Diziye at en büyügü bul.
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Kaç Sayý Gireceksiniz");
		int sayiAdet = scn.nextInt();
		int sayilar[]= new int[sayiAdet]; 
		int enBuyukSayi=0;
		
		for(int i=0;i<sayiAdet;i++)
		{
			System.out.println("Sayýyý girin");
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
		System.out.println("Girilen en büyük sayi"+ enBuyukSayi);
	}

}
