package Conditional_Loops_Assessment;
import java.util.Scanner;
public class Sum_of_Even_Odd {
	
	
		public static void main(String[] args) {
			// Write your code here
		Scanner s=new Scanner(System.in);
	        int num= s.nextInt(),E=0,O=0,d;
	        while(num!=0){
	            d=num%10;
	            num=num/10;
	            if(d%2==0){
	                E+=d;
	            }
	            else{
	                O+=d;
	            }
	        }
	        System.out.println(E+" "+O);
		}
	}


/*Requirements:
 * Digits mean numbers, not the places! That is, if the given integer is "13245", 
 * even digits are 2 & 4 and odd digits are 1, 3 & 5.
 Sample Input :
1234
Sample Output :
6 4
*/
 