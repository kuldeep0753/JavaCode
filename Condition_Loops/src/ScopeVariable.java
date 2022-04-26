
public class ScopeVariable {

	public static void main(String[] args) {
		int i=10;
		System.out.println(i);
		i=12;//acceptable
		
//		int i=2;//we are not re initialize the value---giving error
		System.out.println(i);

	}

}
