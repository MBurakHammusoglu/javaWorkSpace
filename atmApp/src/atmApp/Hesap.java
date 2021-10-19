package atmApp;
import java.util.Scanner;

public class Hesap extends Login{
	private int yeniBakiye=0;
	
	public Hesap(String ad, String soyad, String sifre,int bakiye,int yeniBakiye) {
		super(ad,soyad,sifre,bakiye);
		this.yeniBakiye=super.getBakiye();
	}
	
	
	public Hesap() {
		
	}
	
	public int getYeniBakiye() {
		return yeniBakiye;
	}
	
	public void setYeniBakiye(int yeniBakiye) {
		this.yeniBakiye = yeniBakiye;
	}
	Scanner scn = new Scanner(System.in);
	
	
	
	public void paraYatir(int girilenMiktar) {
		System.out.println("Para yatirildi");
		System.out.println("Bakiye"+yeniBakiye);
		yeniBakiye+=girilenMiktar;
		System.out.println("Bakiye"+yeniBakiye);
	}
	
	
	
	public void paraCek(int girilenMiktar) {
		System.out.println("Para Çekildi");
		super.setBakiye() = super.getBakiye()-girilenMiktar;
		System.out.println("Bakiye"+ super.getBakiye());
		System.out.println("Yeni Bakiye"+yeniBakiye);
	}
	
	
	
	public void harcOde(int girilenMiktar) {
		System.out.println("Harc ödendi");
	}
	public void paraGonder(int girilenMiktar) {
		System.out.println("Para Gönderildi");
		
		
		
	}
	
	
	
	
}
