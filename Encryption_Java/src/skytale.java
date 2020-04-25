import java.util.Scanner;

public class skytale {
    public static String skytale_encode (String text, Integer key){
        //http://www.mathe.tu-freiberg.de/~hebisch/cafe/kryptographie/skytale.html
        String encoded = "";
        String spalte;
        Character current_char;

        //Hier wird regex genutzt um alle Leerzeichen zu entfernen
        text = text.replaceAll("\\s","");

        /*
        Hier wird für die Dicke der Skytale also für jede spalte ein String
        erstellt. Diese Strings werden dann zusammengefügt und der 
        verschlüsselte text zurückgegeben.
        */
        for (int i = 0; i < key; i++){
            spalte = "";
			for (int j = i; j < text.length(); j += key){
                current_char = text.charAt(j);
                spalte += current_char;
            }
            encoded += spalte;
		}
        return encoded;
    }

    //main function
    public static void main(String[]args){
        String encoded;
        String text;
        Integer key;

        Scanner input = new Scanner(System.in);

        System.out.print("Gib einen Text ein: ");
        text = input.nextLine();

        System.out.print("Gib nun die dicke der Skytale an: ");
        key = input.nextInt();

        input.close();
        
        encoded = skytale_encode(text, key);
        System.out.println(encoded);

    }
}