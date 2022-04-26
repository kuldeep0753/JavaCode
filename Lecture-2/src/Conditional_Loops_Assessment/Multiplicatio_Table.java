package Conditional_Loops_Assessment;
import java.util.Scanner;
public class Multiplicatio_Table {
	
public static void main(String[] args) {
			// Write your code here
		Scanner s=new Scanner(System.in);
	        int n=s.nextInt(),i=1,table;
	        while(i<=10){
	            table=i*n;
	            i++;
	            System.out.println(table);
	        }
	        
		}
	}
/* 
 * Requirements:
 
 * Sample Input 1 :
2
Sample Output 1 :
2
4
6
8
10
12
14
16
18
20*/
