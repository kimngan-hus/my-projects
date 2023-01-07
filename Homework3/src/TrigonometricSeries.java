import java.util.Scanner;

public class TrigonometricSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of terms: ");
        int numterm = sc.nextInt();
        System.out.print("enter the number of theta: ");
        int theta = sc.nextInt();
        double radians = Math.toRadians(theta);
        System.out.println("sin1= "+Math.sin(radians));
        System.out.println("sin2= "+sin(radians,numterm));
        System.out.println("cos1= "+ Math.cos(radians));
        System.out.println("cos2= "+ cos(radians,numterm));
    }

    public static double sin(double x, int numterms) {
        int power = 1;
        double sinx = 0.0;
        for (int i = 0; i < numterms; i++) {
            double currentTerm = 0.0;
            if (i % 2 == 0) {
                currentTerm = Math.pow(x,power) / getFact(power);
            }else {
                currentTerm = -Math.pow(x,power)/getFact(power);
            }
            sinx = sinx + currentTerm;
            power = power+2;
        }
        return sinx;
    }
    public static double cos(double x, int numterms){
        int power=0;
        double cos = 0.0;
        for (int i = 0; i < numterms; i++) {
            double currentTerm = 0.0;
            if (i % 2 == 0){
                currentTerm = Math.pow(x, power)/ getFact(power);
            }else {
                currentTerm = -Math.pow(x,power) / getFact(power);
            }
            cos = cos + currentTerm;
            power = power +2;
        }
        return cos;
    }
        public static long getFact ( int n){
            long fact = 1;
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            return fact;
        }
    }

