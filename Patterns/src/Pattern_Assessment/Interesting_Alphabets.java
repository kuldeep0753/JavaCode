package Pattern_Assessment;
import java.util.Scanner;
public class Interesting_Alphabets {
public static void main(String[] args) {
			//Your code goes here
	         Scanner s=new Scanner(System.in);
	        int n=s.nextInt(),i=1;
	        char p='A';
	        
	        while(i<=n){
	            int j=1;
	            char startingChar=(char)(p+n-i),m;
	            while(j<=i){
	            	 m=(char)(startingChar+j-1);
	                System.out.print(m);
	                j++;
	               }
	            System.out.println();
	                i++;
	        }
		
	}
}
