import java.util.Scanner;

public class ceasar_Code {
	public static String verschluesseln(String input) {
		return input;
	}
	public static void main(String[]args) {
		System.out.println("Hello World");
		System.out.print("Gib einen unverschlüsselten String ein: ");

		Scanner Scanner = new Scanner(System.in);
		String input = Scanner.nextLine();

		String v = verschluesseln(input);
		System.out.println(v);
	}
}
