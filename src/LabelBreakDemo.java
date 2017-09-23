
public class LabelBreakDemo {

	public static void main(String[] args) {

		int x=20;
		
		System.out.println("Before Block");
		
		block1: {
			
			System.out.println("Entered Block");
			
			if(x==20) {
				break block1;
			}
			
			System.out.println("Exited Block");
			
		}
		
		System.out.println("After Block");
		
	}

}
