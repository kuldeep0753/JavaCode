package while_loop;
import java.util.Scanner;
public class CheckPrime {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int div=2,num=s.nextInt();
		while(div<num) {
			if(num%div==0) {
				System.out.println("Not Prime");
				return;
			}
			div++;
		}
		System.out.println("Prime");
		
//----------interesting question----------
//		int x=5;
//	    int y=5;
//	    while((x=5)==y)
//	    {
//	        System.out.println("Hello1");
//	        System.out.println(x);
//	        System.out.println(y);
//	        x++;
//	        y++;
//	        System.out.println("Hello2");
//	        System.out.println(x);
//	        System.out.println(y);
//	    }
//
//	    System.out.println("Hello2");
//        System.out.println(x);
//        System.out.println(y);
	}

}
