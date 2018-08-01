package introduction;

public class Operatorings {
	public static void doingOperations(int a, int b, int c) {
		//various operators exist and frankly it is up to you to learn most of them but here are some common ones
		//basic arithmatic +, -, / (division), * (multiplication)
		System.out.println("a + b = " +a+b + ". It is sooo magical.");
		// % operator finds the remainder of a division between the two variables 
		System.out.println("Remainder between divsion of a/c = " + a%c);
		// Adding an = to the end of an operator will cause the first variable to equal the result
		System.out.println("a = " + a);
		System.out.println("c = " + c);
		a+=c;
		System.out.println("a after c has been added to it = "+ a);
		
		if(a> c && b<c && a ==(c*b) ) {
			System.out.println("These parameters are all true");
		}else if(a<c || b>a) {
			System.out.println("Either of the parameters is true");
		}else {
			System.out.println("None of the previous conditions where true");
		}
		
	}
}
