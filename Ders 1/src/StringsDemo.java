
public class StringsDemo {

	public static void main(String[] args) {
		String message = "Today weather is great";

		System.out.println(message);
        
		// uzunluğu
		System.out.println("Eleman sayısı : " + message.length());
		
		//girilən indexə görə cavab çıxır
		System.out.println("6. eleman : " + message.charAt(6));
		
		//girilən string ə bir dəfəlik söz əlavə edir 
		System.out.println(message.concat(" yeeey")); 
		
		//girilən hərf ilə başladığını mı göstərir (boolean)
		System.out.println(message.startsWith("T"));

		//characters array-i 0-10 index aralıqla doldu
		char[] characters = new char[10];
		message.getChars(0, 10, characters, 0);
		System.out.println(characters);
		
		//Başdan başlayaraq ilk a elementinin neçənci indexdə oludğunu göstərir
		System.out.println(message.indexOf('a'));
		System.out.println(message.lastIndexOf('t'));

		// replace girilən simvolu istənilən simvolla dəyişir
		System.out.println(message.replace("a", "-"));

		// substring girilən indexə qədər götürür
		System.out.println(message.substring(4));
		System.out.println(message.substring(0, 8));
		System.out.println(message.substring(4, 8));

		// split verilən texti girilən simvol ardıcıllığına görə ayırır
		for (String kelime : message.split("  ")) {

			System.out.println(kelime);

			System.out.println(message.toLowerCase());
			System.out.println(message.toUpperCase());

			String message1 = "    Today weather is great   ";
			System.out.println(message1);
			//Lazımsız boşluqları aradan qaldırır
			System.out.println(message1.trim());

		}

	}

}
