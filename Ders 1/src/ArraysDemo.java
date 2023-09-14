
public class ArraysDemo {

	public static void main(String[] args) {
		String[] animals = {"Goat","Cow","Lama","Chicken"};
		
		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);
		}
		//animal-dan animal olarak isimleri teker teker çekmeye yarar 
		for (String animal:animals) {
			System.out.println(animal);
		}
	}	

}
