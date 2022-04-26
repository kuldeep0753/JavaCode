
import java.util.Scanner;
public class totalSalary {
	
	public static void main(String[] args) {
		// Write your code here
	Scanner s=new Scanner(System.in);
        int basic=s.nextInt();
        float f,totalSalary; 
        
        char a=s.next().charAt(0);
        
        if(a=='A'){
            totalSalary=basic+((20*basic)/100)+((50*basic)/100)+1700-((11*basic)/100);
            System.out.println(totalSalary);
        }
         else if(a=='B'){
            totalSalary=basic+((20*basic)/100)+((50*basic)/100)+1500-((11*basic)/100);
            System.out.println(totalSalary);
        }
         else{
            totalSalary=basic+((20*basic)/100)+((50*basic)/100)+1300-((11*basic)/100);
            System.out.println(totalSalary);
        }
	}
}
