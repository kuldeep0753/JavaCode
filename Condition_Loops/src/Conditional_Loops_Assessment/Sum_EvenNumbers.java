package Conditional_Loops_Assessment;
import java.util.Scanner;
public class Sum_EvenNumbers {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
        int sum=0,i=1, num=s.nextInt();
        while(i<=num){
            if(i%2==0){
                sum+=i;
            }
            i++;
        }
        System.out.println(sum);

	}

}
/*Requirements:
 * Given a number N, print sum of all even numbers from 1 to N.
Sample Input 1 :
 6
Sample Output 1 :
12
*/
