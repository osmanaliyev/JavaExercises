
public class MiniProject5 {

	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 2, 5, 7, 8, 9, 10 };
		int aranacak = 12;

		boolean varMi = false;
		for (int number : numbers) {

			if (number == aranacak) {
				varMi = true;
				break;
			}
		}
		if (varMi) {
			System.out.println("Aranan numara var!!");

		} else {
			System.out.println("Aranan numara yok!!");
		}
	}

}
