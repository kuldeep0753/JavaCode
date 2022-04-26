package TriangularPattern;

import java.util.Scanner;

public class TraingularPattern2 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=1;
		//1-Method
//		while(i<=n) {
//			int j=1;
//			while(j<=i) {
//				System.out.print(i+j-1 +" ");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		//2-Method
		while(i<=n) {
			int j=1, startingNumber=i;
			while(j<=i) {
				System.out.print(startingNumber +" ");
				
				startingNumber++;
				j++;
			}
			System.out.println();
			i++;
		}
		//output:
//		1 
//		2 3 
//		3 4 5 
//		4 5 6 7 
	}
	
	
}
