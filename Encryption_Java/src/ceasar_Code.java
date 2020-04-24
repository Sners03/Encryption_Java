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

	public static void main(final String[]args) {
		Scanner Scanner = new Scanner(System.in);
		System.out.print("Gib einen unverschlüsselten String ein: ");
		String text = (Scanner.nextLine()).toLowerCase();

		System.out.print("Gib nun einen Schlüssel an: ");
		Integer key = Scanner.nextInt();

		String encoded = verschluesseln(text, key);
		System.out.println(encoded);

		Scanner Scanner_2 = new Scanner(System.in); 

		System.out.print("Gib einen verschlüsselten String ein: ");
		String text_2 = (Scanner_2.nextLine()).toLowerCase();

		System.out.print("Gib nun den Schlüssel an: ");
		Integer key_2 = Scanner_2.nextInt();

		String decoded = entschluesseln(text_2, key_2);
		System.out.println(decoded);
	}
}
