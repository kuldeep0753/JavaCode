/*Requirement
 * Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), 
 * you need to convert all Fahrenheit values from Start to End at the gap of W, into their 
 * corresponding Celsius values and print the table.
Input: 3 integers - S, E and W respectively .
Output Format :
Fahrenheit to Celsius conversion table. One line for every Fahrenheit and corresponding Celsius 
value. The Fahrenheit value and its corresponding Celsius value should be separate by single space.

Sample Input 1:
0 
100 
20
Sample Output 1:
0   -17
20  -6
40  4
60  15
80  26
100 37
 */
//Solution:
package Conditional_Loops_Assessment;
import java.util.Scanner;
public class Fahrenheit_To_Celsicus {

		public static void main(String[] args) {
	        Scanner s=new Scanner(System.in);
	        int S=s.nextInt(),E=s.nextInt(),W=s.nextInt(),C;
	        while(S<=E){
	            C=(5*(S-32))/9;
	            System.out.println(S+" "+C);
	            S+=W;
	        }	
		}

	}
