package Pattern_Assessment;
import java.util.Scanner;
public class Square_Pattern {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print(n);
                j++;
            }
           System.out.println("");
            i++;
        }

		
	}

}

//input:4
//output:
//4444
//4444
//4444
//4444

