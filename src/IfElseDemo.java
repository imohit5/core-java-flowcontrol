
public class IfElseDemo {

	public static void main(String[] args) {

		int pass=35;
		
		int marks=35;
		
		if(marks>pass) {
			System.out.println("passed exam");
		} else if(marks<pass) {
			System.out.println("failed exam");
		}else {
			System.out.println("just passed");
		}
		
		
		
		int target=85, a=75, b=65, c=55;
		
		//In this case a will be not executed, so if condition order matters
		if(target>=c) {
			System.out.println("In c");
		}else if(target>=b) {
			System.out.println("In b");
		}else if(target>=a) {
			System.out.println("In a");
		}
		
		//In this case a will be executed
		if(target>=a) {
			System.out.println("In a");
		}else if(target>=b) {
			System.out.println("In b");
		}else if(target>=c) {
			System.out.println("In c");
		}

		
		
		
	}

}
