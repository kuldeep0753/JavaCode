package TriangularPattern;

import java.util.Scanner;

public class TriangularPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=1;
		while(i<=n) {
			int j=1;
			while(j<=i) { 
				System.out.print(j+" ");
				j++;
			}
			i++;
			System.out.println();
		}
		//output:
//		1 
//		1 2 
//		1 2 3 
//		1 2 3 4 
	}

}
