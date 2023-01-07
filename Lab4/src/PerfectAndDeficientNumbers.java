import java.util.Scanner;
public class PerfectAndDeficientNumbers {
    public static boolean isPerfect(int n){
        int sum=0;
        for (int i = 1; i <= n/2; i++) {
            if (n%i==0){
                sum+=i;
            }
        }
        return sum==n;
    }
    public static boolean isDeficient(int n){
        int sum =0;
        for (int i = 1; i <= n/2; i++) {
            if (n%i==0){
                sum+=i;
            }
        }
       return sum < n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the upper bound:");
        int n = sc.nextInt();
        int countPerfect = 0;
        int count =0;
        System.out.print("these numbers are perfect  : ");
        for (int i = 1; i <= n; i++) {
            if (isPerfect(i)){
                System.out.print(i + " ");
                countPerfect++;
            }
        }
        System.out.printf("\n%d perfect numbers found (%.2f%c)", countPerfect, (double) countPerfect  / n * 100, '%');

        System.out.println("\n");
        System.out.print("these numbers are neither deficient nor perfect:");
        for (int i = 1; i <=n ; i++) {
            if (!isDeficient(i) && !isPerfect(i)){
                System.out.print(i +" ");
                count++;
            }
        }
        System.out.printf("\n%d perfect numbers found (%.2f%c)", count, (double) count / n * 100, '%');
    }
}
