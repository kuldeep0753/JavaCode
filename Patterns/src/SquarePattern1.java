import java.util.Scanner;
public class SquarePattern1 {

	public static void main(String[] args) {
		
				Scanner s=new Scanner(System.in);
				int n=s.nextInt(),i=1;
				while(i<=n) {
					int j=1;
					while(j<=n) {
						System.out.print(j+" ");
						j++;
					}
					System.out.println("");
					i++;
				} 
				//output:
//				1 2 3 4 
//				1 2 3 4 
//				1 2 3 4 
//				1 2 3 4 
	}

}
