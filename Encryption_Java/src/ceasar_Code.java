import java.util.Scanner;

public class ceasar_Code {
	public static String verschluesseln(String text, Integer key) {
		final String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encoded = "";

		char current;

		Integer pos; // position 
		Integer new_key_pos;
		
		//Schleife um alle Character des eingegebenen Strings durchzugehen 
		for (int i = 0; i < text.length(); i++){
			current = text.charAt(i);
			pos = alphabet.indexOf(current);

			//weitergeben der Strings, welche kein teil des alphabets sind
			if(pos == -1){
				encoded += current;
				continue;
			}

			//verschieben des alphabets
			new_key_pos = (pos + key) % 26;

			//hinzufügen des verschobenen Characters zum verschlüsselten String
			encoded += (alphabet.charAt(new_key_pos));
		}
		return encoded;
	}

	public static String entschluesseln(String text, Integer key) {
		final String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String decoded = "";

		char current;

		Integer pos; // position 
		Integer new_key_pos;
		
		//Schleife um alle Character des eingegebenen Strings durchzugehen 
		for (int i = 0; i < text.length(); i++){
			current = text.charAt(i);
			pos = alphabet.indexOf(current);

			//weitergeben der Strings, welche kein teil des alphabets sind
			if(pos == -1){
				decoded += current;
				continue;
			}

			//verschieben des alphabets
			new_key_pos = (pos - key) % 26;

			//hinzufügen des verschobenen Characters zum entschlüsselten String
			decoded += (alphabet.charAt(new_key_pos));
		}
		return decoded;
	}

	//main function
	public static void main(String[]args) {
		//Scanner für den Input fer verschluesseln function
		Scanner encode_input = new Scanner(System.in);

		System.out.print("Gib einen unverschlüsselten String ein: ");
		String text = (encode_input.nextLine()).toLowerCase();

		System.out.print("Gib nun einen Schlüssel an: ");
		Integer key = encode_input.nextInt();

		//schließen des Scanners
		encode_input.close();

		/*Aufruf der verschluesseln Methode und Ausgeben 
		des verschlüsselten Texts*/
		String encoded = verschluesseln(text, key);
		System.out.println(encoded);

		//Scanner für den Input fer verschluesseln function
		Scanner decode_input = new Scanner(System.in); 

		System.out.print("Gib einen verschlüsselten String ein: ");
		String text_2 = (decode_input.nextLine()).toLowerCase();

		System.out.print("Gib nun den Schlüssel an: ");
		Integer key_2 = decode_input.nextInt();

		//schließen des Scanners
		decode_input.close();

		/*Aufruf der entschluesseln Methode und Ausgeben 
		des entschlüsselten Texts*/
		String decoded = entschluesseln(text_2, key_2);
		System.out.println(decoded);
	}
}
