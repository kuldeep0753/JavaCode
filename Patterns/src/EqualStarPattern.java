import java.util.Scanner;
public class EqualStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0;
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				System.out.print("* ");
//			}
//			System.out.println("");
//		}
		
		while(i<n) {
			int j=0;
			while(j<n) {
				System.out.print("* ");
				j++;
			}
			i++;
			System.out.println("");
			
		}
		//output:
//		* * * * 
//		* * * * 
//		* * * * 
//		* * * * 
	}

}
