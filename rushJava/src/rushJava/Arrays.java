package rushJava;

public class Arrays {

	public static void main(String[] args) {
		// Arrays
		
		String [] cars= {"volvo","ford","mercedes"};
		int [] myNum= {10,20,30};
		
		System.out.println(cars[0]);
		System.out.println(myNum[1]);
		
		// Change array
		cars[0]="opel";
		
		// Length
		System.out.println(cars.length);
		
		// Writing array with for loop
		
		for(int i=0;i<cars.length;i++) {
			System.out.println(cars[i]);
		}
		
		// Writing array with for-each
		
		for(String i : cars) {
			System.out.println(i);
		}
		
		// Multidimensional Arrays :
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		int x = myNumbers[1][2]; 
		System.out.println(x);
		 // Writing 
		for (int i = 0; i < myNumbers.length; ++i) // genel dizi boyutu {
		      for(int j = 0; j < myNumbers[i].length; ++j) //iç dizi boyutu 
		    	  {
		        System.out.println(myNumbers[i][j]);
		      }
		

	}

}
