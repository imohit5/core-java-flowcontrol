
public class ContinueDemo {

	public static void main(String[] args) {

		int a=10;
		
		for (int i = 0; i <= a; i++) {
			if(i%2!=0) {
				continue;
			}
			System.out.println(i);
		}
		
	}

}
