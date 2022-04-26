package Conditional_Loops_Assessment;
import java.util.Scanner;
import java.lang.Math;
public class Total_Salary {
public static void main(String[] args) {
			// Write your code here
		Scanner s=new Scanner(System.in);
	        int basic=s.nextInt(),allow;
	        
	        char a=s.next().charAt(0);
	        double hra=0.2*basic,da=0.5*basic,pf=.11*basic,total,sum,totalSalary;
	       sum=(hra+da-pf);
	    
	        
		if(a=='A'){
		  
		    allow=1700;
	    }
		 else if(a=='B'){
		    
		     allow=1500;
		   }
		 else{
		    allow=1300;
	         
		}
	          totalSalary=(double)basic+allow+sum;
	        total=totalSalary-(int)totalSalary;
	         if(total<0.5)
	               System.out.println((int)totalSalary);
	           else 
	               System.out.println((int)totalSalary+1);
	       
		}
	}



/*Requirements:
 * Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -
    totalSalary = basic + hra + da + allow – pf
where :
hra   = 20% of basic
da    = 50% of basic
allow = 1700 if grade = ‘A’
allow = 1500 if grade = ‘B’
allow = 1300 if grade = ‘C' or any other character
pf    = 11% of basic.
Round off the total salary and then print the integral part only.
Note: Try finding out a function on the internet to do so 

Input format :
Basic salary & Grade (separated by space)

Output Format :
Total Salary
Constraints :
0 <= Basic Salary <= 7,500,000

Sample Input 1 :
10000 A

Sample Output 1 :
17600*/
 