
public class LoopDemo {

	public static void main(String[] args) {
		// For
		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);

			}

		}
		System.out.println("Loop with for is end");

		// while
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("Loop with while is end");

	}
		
}
