package if_else;
import java.util.Scanner;

public class largestOfThree {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt(),b=scan.nextInt(),c=scan.nextInt();
		if(a>=b && a>=c)
		{
			System.out.println(a+" is greater");
			return;
		}
		else if(b>=c) {
			System.out.println(b+" is greater");
			return;
		}
		System.out.println(c+" is greater");
	}

}
