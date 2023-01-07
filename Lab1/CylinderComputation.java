import java.sql.SQLOutput;
import java.util.Scanner;

public class CylinderComputation {
    public static void main(String[] args) {
        double radius;
        double height;
        double baseArea;
        double surfaceArea;
        double volume;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius: ");
        radius = in.nextDouble();
        System.out.println("Enter height: ");
        height = in.nextDouble();
        baseArea = Math.PI * radius * radius;
        surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;
        volume = baseArea * height;
        System.out.println(surfaceArea);
        System.out.println(volume);
    }

}
