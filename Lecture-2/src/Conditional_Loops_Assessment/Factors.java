package Conditional_Loops_Assessment;
import java.util.Scanner;
public class Factors {
 public static void main(String[] args) {
	        // Write your code here
	        Scanner s=new Scanner(System.in);
	        int num=s.nextInt(),i=2;
	        while(i<num){
	            if(num%i==0)
	                System.out.print(i+" ");
	            i++;
	        }
	    }
	}


/*
 * Requirements:
 
 * Write a program to print all the factors of a number other than 1 and the number itself.
 Sample Input :
8
Sample Output :
2 4 
*/
