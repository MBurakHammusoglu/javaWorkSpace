package atmApp;

public class Login {
	
	private String ad;
	private String soyad;
	private String sifre;
	//private String dogumTarih;
	private int bakiye;
	
	public Login(String ad, String soyad, String sifre, int bakiye) {
		this.ad=ad;
		this.soyad=soyad;
		this.sifre=sifre;
		//this.dogumTarih=dogumTarih;
		this.bakiye=bakiye;
	}
	public Login() {
		
	}
	/*public Login(int bakiye) {
		this.bakiye=bakiye;
	}*/
	
	public void bilgiKontrol(String girilenAd, String girilensoyAd, String girilenSifre) {
		if(ad.equals(girilenAd)==true && soyad.equals(girilensoyAd)==true && sifre.equals(girilenSifre)) {
			System.out.println("Bilgi kontrol edildi.");
			Atm atm�slemler=new Atm();
			atm�slemler.�slemler();
			
		}
		else {
			System.out.println("Yanl�� bilgi girdiniz");
			System.exit(0);
		}
		
	}
	
	
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public String getSifre() {
		return sifre;
	}
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}	
	public int getBakiye() {
		return bakiye;
	}
	public void setBakiye(int bakiye) {
		this.bakiye = bakiye;
	}
	

}
