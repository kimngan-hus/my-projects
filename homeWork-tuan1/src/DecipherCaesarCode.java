import java.util.Scanner;

public class DecipherCaesarCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a ciphertext string: ");
        String ciphertext = sc.nextLine().toLowerCase();
        System.out.println("");
        int n = sc.nextInt();
        char alphabet;
        String plaintext = " ";
        for (int i =0 ; i < ciphertext.length(); i++){
            alphabet = ciphertext.charAt(i);
            if (alphabet >= 'a' && alphabet <= 'z'){
                alphabet = (char) (alphabet - n);
                if (alphabet < 'a'){
                    alphabet = (char)(alphabet + 'z' - 'a' +1);
                }
                plaintext = plaintext + alphabet;
            }else {
                plaintext = plaintext + alphabet;
            }
        }
        System.out.println("plaintext is: "+ plaintext.toUpperCase());
    }
}