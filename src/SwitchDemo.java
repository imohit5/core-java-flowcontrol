
public class SwitchDemo {

	public static void main(String[] args) {

		//int x=5;
		//int x=8;
		int x=3;
		
		switch(x) {
		
		case 1:
			System.out.println("case 1");
			break;
		case 2:
		case 3:
			System.out.println("case 2 and 3");
			break;
		case 4:
			System.out.println("case 4");
			break;
		case 5:
			System.out.println("case 5");
			break;
		default:
			System.out.println("out of range");
		
		}
	}

}
