import java.util.Scanner;
public class simpleInterestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     int p=1000,t=2;
//     double SI,r=5.6;
//     SI=(p*r*t)/100;
//     System.out.println(SI);
//--------------------taking input by user---------
		Scanner scan= new Scanner(System.in);
//		int p=scan.nextInt(), t=scan.nextInt();
//		double SI, r=scan.nextDouble();
//		
//		SI=(p*r*t)/100*t;
//		System.out.println(SI);
//---------------------------------------------------
		//--------we are not able to write input for character...for that we are using string then we take one character using index------>
		
//		String str=scan.nextLine();//here "nextLine" take all in one string even space also.
//		System.out.println(str);
		
		String str=scan.next();//here "next" take only before space character.
		System.out.println(str);
		//to print single character use index
		char c=str.charAt(0);
		System.out.println(c);
		
	}

}
