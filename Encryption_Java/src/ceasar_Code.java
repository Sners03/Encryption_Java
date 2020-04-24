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

	public static void main(final String[]args) {
		final Scanner Scanner = new Scanner(System.in);
		System.out.print("Gib einen unverschlüsselten String ein: ");
		String text = (Scanner.nextLine()).toLowerCase();

		System.out.print("Gib nun einen Schlüssel an: ");
		Integer key = Scanner.nextInt();

		String v = verschluesseln(text, key);
		System.out.println(v);
	}
}
