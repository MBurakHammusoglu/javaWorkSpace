package atmApp;

import java.util.Scanner;

public class Atm {
	public void �slemler() {
		
		int yapilacak�slem;
		System.out.println("L�tfen yapmak istedi�iniz i�lemi se�in.");
		System.out.println(" 1- Para Yat�rmak"
				+ "\n 2- Para �ekmek"
				+ "\n 3- Harc �de"
				+ "\n 4- Para Gonder"
				);
		Scanner scn=new Scanner(System.in);
		yapilacak�slem=scn.nextInt();
		System.out.println("Miktar� Girin");
		int girilenMiktar=scn.nextInt();
		Hesap hesap�slemleri = new Hesap();
		
		
		
		
		if(yapilacak�slem==1) {
			hesap�slemleri.paraYatir(girilenMiktar);
		}else if(yapilacak�slem==2) {
			hesap�slemleri.paraCek(girilenMiktar);
		}else if(yapilacak�slem==3) {
			hesap�slemleri.harcOde(girilenMiktar);
		}else if(yapilacak�slem==4) {
			hesap�slemleri.paraGonder(girilenMiktar);
		}else {
			System.exit(0);
		}
		
		
	}

}