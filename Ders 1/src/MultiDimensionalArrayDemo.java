
public class MultiDimensionalArrayDemo {

	public static void main(String[] args) {

		String[][] countries = new String[2][3];

		countries[0][0] = "Turkey";
		countries[1][0] = "Azerbaijan";
		countries[0][2] = "Russia";
		countries[0][1] = "England";
		countries[1][1] = "Norway";
		countries[1][2] = "Ireland";

		for (int i = 0; i < 2; i++)

		{
			System.out.println("-------------");
			for (int j = 0; j <= 2; j++) {

				System.out.println(countries[i][j]);

			}

		}

	}

}
