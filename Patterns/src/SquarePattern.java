import java.util.Scanner;
public class SquarePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
				System.out.print(i+" ");
				j++;
			}
			System.out.println("");
			i++;
		}
		//output:
//		1 1 1 1 
//		2 2 2 2 
//		3 3 3 3 
//		4 4 4 4 

	}

}
