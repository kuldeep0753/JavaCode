package Conditional_Loops_Assessment;
import java.util.Scanner;
public class Power_Of_Number {
 public static void main(String[] args) {
	        // Write your code here
	        Scanner s=new Scanner(System.in);
	        int x=s.nextInt(),n=s.nextInt(),pow=1,i=1;
	        while(i<=n){
	            pow=x*pow;
	            i++;
	        }
	        System.out.println(pow);
	        
	    }
	}


/*Requirements:
 * Write a program to find x to the power n (i.e. x^n). Take x and n from the user.
 *  You need to print the answer.*/
 