package CharacterPatterns;

import java.util.Scanner;

public class CharacterPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=1;
		char p='A';
		while(i<=n) {
			int j=1;
			while(j<=n) {
				
				System.out.print((char)(p+j-1));
				j++;
			}
			System.out.println("");
			i++;
			p++;
			
		}
		//output:
//		ABCD
//		BCDE
//		CDEF
//		DEFG

	}

}
