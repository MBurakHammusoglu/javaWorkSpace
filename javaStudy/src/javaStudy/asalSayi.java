package javaStudy;

public class asalSayi {
	// 1'den 1000'e kadar olan asal sayýlarý bulma
	// Asal sadece 1'e ve kendine bölünen sayýlar
	
	public static void asalMý() {
		
		int kontrol=0;
		
		for(int i=1000;i>1;i--) {
			for(int j=2;j<i;j++) {
					if(i%j==0) {
						kontrol=1;
					}
			
			}
			if(kontrol==0) {
				System.out.println(i);
			}
			else {
				kontrol=0;
			}
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		asalMý();
		
	}
	


}
