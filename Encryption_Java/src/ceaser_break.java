import java.util.Scanner;

public class ceaser_break {
    public static String shift(String text, Integer key) {
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
			new_key_pos = (pos + key) % 26;

			//hinzufügen des verschobenen Characters zum entschlüsselten String
			decoded += (alphabet.charAt(new_key_pos));
		}
		return decoded;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Gib einen verschlüsselten String ein: ");
		String text = (input.nextLine()).toLowerCase();

        input.close();

        //verschieben des textes für jeden Buchstaben
        for (int i = 1; i <= 26; i++){
            String shifted = shift(text,i);
            System.out.println("shifted by "+i+": "+shifted);
        }
        /* 
        input: 
        bfkdxkwklojxiboabrqpzeboqbuq

        output:
        shifted by 1: cgleylxlmpkyjcpbcsrqafcprcvr
        shifted by 2: dhmfzmymnqlzkdqcdtsrbgdqsdws
        shifted by 3: einganznormalerdeutschertext
        shifted by 4: fjohboaopsnbmfsefvutdifsufyu
        shifted by 5: gkpicpbpqtocngtfgwvuejgtvgzv
        shifted by 6: hlqjdqcqrupdohughxwvfkhuwhaw
        shifted by 7: imrkerdrsvqepivhiyxwglivxibx
        shifted by 8: jnslfsestwrfqjwijzyxhmjwyjcy
        shifted by 9: kotmgtftuxsgrkxjkazyinkxzkdz
        shifted by 10: lpunhuguvythslyklbazjolyalea
        shifted by 11: mqvoivhvwzuitmzlmcbakpmzbmfb
        shifted by 12: nrwpjwiwxavjunamndcblqnacngc
        shifted by 13: osxqkxjxybwkvobnoedcmrobdohd
        shifted by 14: ptyrlykyzcxlwpcopfednspcepie
        shifted by 15: quzsmzlzadymxqdpqgfeotqdfqjf
        shifted by 16: rvatnamabeznyreqrhgfpuregrkg
        shifted by 17: swbuobnbcfaozsfrsihgqvsfhslh
        shifted by 18: txcvpcocdgbpatgstjihrwtgitmi
        shifted by 19: uydwqdpdehcqbuhtukjisxuhjunj
        shifted by 20: vzexreqefidrcviuvlkjtyvikvok
        shifted by 21: wafysfrfgjesdwjvwmlkuzwjlwpl
        shifted by 22: xbgztgsghkftexkwxnmlvaxkmxqm
        shifted by 23: ychauhthilgufylxyonmwbylnyrn
        shifted by 24: zdibviuijmhvgzmyzponxczmozso
        shifted by 25: aejcwjvjkniwhanzaqpoydanpatp
        shifted by 26: bfkdxkwklojxiboabrqpzeboqbuq

        lesbarer Text:
        shifted by 3: einganznormalerdeutschertext
        */
    }
}
