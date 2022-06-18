package recursiveUsAlma;

import java.util.Scanner;

public class recursiveUsSayi {
	
	static int usalma (int a, int b) {
		int result = 1;
		for (int i =1; i <=b ; i++) {
			result*=a ;
		}
		
		return result ;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lütfen taban değerini giriniz ");
		int a = scan.nextInt();
		System.out.println("lütfen üs değerini giriniz ");
		int b = scan.nextInt();
		
		
		System.out.println("işlem Sonucu :  " + usalma (a,b));
	}

}
