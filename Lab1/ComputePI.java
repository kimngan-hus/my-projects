public class ComputePI {
    public static void main(String[] args) {
        int MAX_TERM = 10000;
        double pi;
        double sum = 0.0;
        double percentsOfMathPi;
        for (int term = 1; term <= MAX_TERM; term++) {
            if (term % 2 == 1) {
                sum += 1.0 / (term * 2 - 1);
            } else {
                sum -= 1.0 / (term * 2 - 1);
            }
        }
        pi = 4 * sum;
        percentsOfMathPi = (pi / Math.PI) * 100;
        System.out.println(sum);
        System.out.println(pi);
        System.out.println(percentsOfMathPi);
    }
}
