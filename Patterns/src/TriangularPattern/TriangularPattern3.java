package TriangularPattern;

import java.util.Scanner;

public class TriangularPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=1,p=1;
		while(i<=n) {
			int j=1, gap=0;
			while(j<=i) {
				System.out.print(p+" ");
				
				p++;
				j++;
			}
			System.out.println();
			i++;
		}
		//output:
//		1 
//		2 3 
//		4 5 6 
//		7 8 9 10 

	}

}
