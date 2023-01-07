import java.util.Scanner;

public class SphereComputation {
    public static void main(String[] args) {
        double radius;
        double volume;
        double surfaceArea;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        radius = in.nextDouble();
        surfaceArea = 4 * Math.PI * radius * radius;
        volume = (4 / 3) * Math.PI * radius * radius;
        System.out.println(surfaceArea);
        System.out.println(volume);
    }

}
