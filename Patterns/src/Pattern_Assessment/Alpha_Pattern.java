package Pattern_Assessment;
import java.util.Scanner;
public class Alpha_Pattern {
	
	

		public static void main(String[] args) {
			
			/* Your class should be named Solution.
		 	* Read input as specified in the question.
		 	* Print output as specified in the question.
			*/
	        Scanner s=new Scanner(System.in);
	        int n=s.nextInt(),i=1;
	        char p='A';
	        while(i<=n){
	            int j=1;
	            while(j<=i){
	                System.out.print((char)p);
	                j++;
	            }
	            p++;
	            System.out.println();
	                i++;
	        }

			
		}

	}

//input:4
//output:
//A
//BB
//CCC
//DDDD
