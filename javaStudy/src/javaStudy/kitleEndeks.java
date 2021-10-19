package javaStudy;

import java.util.Scanner;

public class kitleEndeks {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		
		// Kilo/Boy * Boy
		
		System.out.println("Kilo:");
		float kilo=scn.nextFloat();
		System.out.println("Boy");
		float boy=scn.nextFloat();
		
		float kitleEndeks= kilo/(boy*boy);
		System.out.println("Vücut kitle endeksi:"+kitleEndeks);
		
		

	}

}
