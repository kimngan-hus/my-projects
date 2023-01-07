import java.util.Scanner;
public class Exponent {
    public static void main(String[] args){
        int base;
        int exp;
        Scanner sc= new Scanner(System.in);
        System.out.print(" enter the base: ");
        base = sc.nextInt();
        System.out.print(" enter the exp: ");
        exp = sc.nextInt();
        System.out.println(base + "raise to the power of " + exp +" is "+ exponent(base,exp));
    }
    public static int exponent(int base, int exp){
        int product = 1;
        for (int i = 0; i < exp ; i++) {
            product *= base;
        }
        return product;
    }
}
