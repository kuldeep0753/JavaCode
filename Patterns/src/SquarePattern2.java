import java.util.Scanner;
public class SquarePattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=1;
		//1-Way
//		while(i<=n) {
//			int j=n;
//			while(j>=1) {
//				System.out.print(j+" ");
//				j--;
//			}
//			System.out.println("");
//			i++;
//		}
		//2-Way
		while(i<=n) {
			int j=1;
			while(j<=n) {
				System.out.print(n-j+1+" ");
				j++;
			}
			System.out.println("");
			i++;
		}
	}
	//output:
//	4 3 2 1 
//	4 3 2 1 
//	4 3 2 1 
//	4 3 2 1

}
