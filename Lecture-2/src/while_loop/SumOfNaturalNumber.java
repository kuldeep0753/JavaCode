package while_loop;
import java.util.Scanner;
public class SumOfNaturalNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=1,sum=0,num=s.nextInt();
		while(i<=num) {
			sum+=i;
			i++;
		}
		System.out.println("Sum of 1 to "+num+" is: "+sum);
	}

}
