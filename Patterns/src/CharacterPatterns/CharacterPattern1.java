package CharacterPatterns;

import java.util.Scanner;

public class CharacterPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
				System.out.print((char)('A'+j-1));
				j++;
			}
			System.out.println("");
			i++;
		}
		//output:
//		ABCD
//		ABCD
//		ABCD
//		ABCD
	}

}
