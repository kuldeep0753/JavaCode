package Pattern_Assessment;
import java.util.Scanner;
public class Reverse_Number_Pattern {
public static void main(String[] args) {

	        Scanner s=new Scanner(System.in);
	        int n=s.nextInt(),i=1;
	        while(i<=n){
	            int j=1,reverse=i;
	            while(j<=i){
	                System.out.print(reverse);
	                j++;
	                reverse--;
	            }
	            System.out.println();
	                i++;
	        }
	}
}

//input:4
//output:
//1
//21
//321
//4321
