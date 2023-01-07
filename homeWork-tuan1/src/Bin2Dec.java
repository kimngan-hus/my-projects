import java.util.Scanner;

public class Bin2Dec {
    public static boolean isBinary(int binary) {
        int copyOfInput = binary;

        while (copyOfInput != 0) {
            if (copyOfInput % 10 > 1) {
                return false;
            }
            copyOfInput = copyOfInput / 10;
        }
        return true;
    }
    public static void convertBin2Dec(String str){
        int decimaValue = Integer.parseInt(String.valueOf(str.charAt(0)))
        for (int idx = 1 ; idx < str.length();idx++){
           decimaValue = decimaValue * 2 + Integer.parseInt(String.valueOf(str.charAt(idx)));
        }
       return decimaValue;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary string: ");
        int binary = sc.nextInt();
        if(!isBinary(binary)) {
            System.out.printf("error: invalid binary string \u0027%d\u0027", binary);
        } else {
            System.out.printf("The equivalent decimal number for binary \u0027%d\u0027 is: %d", binary, bin2Dec(binary));
        }

        sc.close();
    }
}