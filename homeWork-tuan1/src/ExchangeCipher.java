import java.util.Scanner;

public class ExchangeCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a plantext string: ");
        String plaintext = sc.next().toLowerCase();
        char alphabet;
        String cirphertext = " ";
        for (int i = 0; i < plaintext.length(); i++) {
            alphabet = plaintext.charAt(i);
            char alphabet1 = (char) ('a' + 'z' - alphabet);
            cirphertext = cirphertext + alphabet1;
        }
        System.out.println("cirphertext is: " + cirphertext.toUpperCase());
    }
}