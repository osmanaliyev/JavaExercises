
public class ReCapDemo1 {

	public static void main(String[] args) {
		
		int value1 = 15;
		int value2 = 30;
		int value3 = 25;
		int biggestValue = value1;
		
		if (biggestValue<value2) {
			biggestValue=value2;
		}
		if (biggestValue<value3) {
			biggestValue=value3;
		}
		System.out.println("Bigger value is " + biggestValue);
	}

}
