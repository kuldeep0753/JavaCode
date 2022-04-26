package Pattern_Assessment;
import java.util.Scanner;
public class Character_Pattern {
public static void main(String[] args) {
			
	        Scanner s=new Scanner(System.in);
	        int n=s.nextInt(),i=1;
	        char p='A';
	        while(i<=n){
	            int j=1;
	            while(j<=i){
	                System.out.print((char)(p+j-1));
	                j++;
	               
	            }
	             p++;
	            
	            System.out.println();
	                i++;
	        }

			
		}

	}

//input:5
//output:
//A
//BC
//CDE
//DEFG
//EFGHI

