package while_loop;
import java.util.Scanner;
public class print1ToN {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int i=1,n=s.nextInt();
		
		while(i<=n) {
			System.out.println(i);
			i++;
		}
	}

}
