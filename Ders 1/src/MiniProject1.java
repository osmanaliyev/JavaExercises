//Asal sayı bulma


public class MiniProject1 {

	public static void main(String[] args) {
		int value = 3;

		boolean isPrime = true;
		if (value<1) {
			System.out.println("Invalid number");
			return;
		} 
		if (value == 1) {
			System.out.println("Asal sayı ");
			return;
		}
		
		for (int i = 2; i < value; i++) {

			if (value % i == 0) {
				isPrime = false;
			}

		}
		if (isPrime) {
			System.out.println("Asal");

		} else {
			System.out.println("no asal");
		}

	}

}
