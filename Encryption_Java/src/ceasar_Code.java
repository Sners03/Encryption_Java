import java.util.Scanner;

public class ceasar_Code {
	public static String verschluesseln(String text, Integer key) {
		final String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encoded = "";

		char current;

		Integer pos; // position 
		Integer new_key_pos;
		

		for (int i = 0; i < text.length(); i++){
			current = text.charAt(i);
			pos = alphabet.indexOf(current);
			if(pos == -1){
				encoded += current;
				continue;
			}

			new_key_pos = (pos + key) % 26;

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
		

		for (int i = 0; i < text.length(); i++){
			current = text.charAt(i);
			pos = alphabet.indexOf(current);
			if(pos == -1){
				decoded += current;
				continue;
			}

			new_key_pos = (pos - key) % 26;

			decoded += (alphabet.charAt(new_key_pos));
		}
		return decoded;
	}

	public static void main(String[]args) {
		Scanner encode_input = new Scanner(System.in);
		System.out.print("Gib einen unverschlüsselten String ein: ");
		String text = (encode_input.nextLine()).toLowerCase();

		System.out.print("Gib nun einen Schlüssel an: ");
		Integer key = encode_input.nextInt();

		encode_input.close();

		String encoded = verschluesseln(text, key);
		System.out.println(encoded);

		Scanner decode_input = new Scanner(System.in); 

		System.out.print("Gib einen verschlüsselten String ein: ");
		String text_2 = (decode_input.nextLine()).toLowerCase();

		System.out.print("Gib nun den Schlüssel an: ");
		Integer key_2 = decode_input.nextInt();

		decode_input.close();

		String decoded = entschluesseln(text_2, key_2);
		System.out.println(decoded);
	}
}
