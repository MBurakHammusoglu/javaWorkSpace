package atmApp;

import java.util.Scanner;

public class Atm {
	public void İslemler() {
		
		int yapilacakİslem;
		System.out.println("Lütfen yapmak istediğiniz işlemi seçin.");
		System.out.println(" 1- Para Yatırmak"
				+ "\n 2- Para Çekmek"
				+ "\n 3- Harc Öde"
				+ "\n 4- Para Gonder"
				);
		Scanner scn=new Scanner(System.in);
		yapilacakİslem=scn.nextInt();
		System.out.println("Miktarı Girin");
		int girilenMiktar=scn.nextInt();
		Hesap hesapİslemleri = new Hesap();
		
		
		
		
		if(yapilacakİslem==1) {
			hesapİslemleri.paraYatir(girilenMiktar);
		}else if(yapilacakİslem==2) {
			hesapİslemleri.paraCek(girilenMiktar);
		}else if(yapilacakİslem==3) {
			hesapİslemleri.harcOde(girilenMiktar);
		}else if(yapilacakİslem==4) {
			hesapİslemleri.paraGonder(girilenMiktar);
		}else {
			System.exit(0);
		}
		
		
	}

}
