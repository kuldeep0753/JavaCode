package if_else;
import java.util.Scanner;

public class evenOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		if(num%2==0)
		{
			System.out.println(num+" is Even");
			return;
		}
//		else {
//			System.out.println(num+" is Odd");
//		}
		System.out.println(num+" is Odd");
	}

}
