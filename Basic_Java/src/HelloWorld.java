import java.util.Scanner;
public class HelloWorld {
	//start block:code execute from here
	public static void main(String args[]) {
		//if you use println , java will put a newline at the end.
//		System.out.print("Hello World!!");
//		System.out.println("Hello World!!");
//		System.out.println("Hello World!!");
		
//		Scanner s = new Scanner(System.in);
//		int a = s.nextInt();
//		String str = s.next();
//		System.out.print(a);
//		System.out.println(str);
		
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int a = s.nextInt();
		System.out.print(str + " " + a);
	}
}
