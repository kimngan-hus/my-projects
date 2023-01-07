public class HarmonicSum {
    public static void main(String[] args) {
        final int MAX_DENOMINATOR = 50000;
        final int MIN_DENOMINATOR = 1;
        double sumL2R = 0.0;
        double sumR2L = 0.0;
        double absDiff;
        for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator++) {
            sumL2R += 1.0 / denominator;
        }
        for (int denominator = 50000; denominator >= MIN_DENOMINATOR; denominator--) {
            sumR2L += 1.0 / denominator;
        }
        if (sumL2R > sumR2L) {
            absDiff = sumL2R - sumR2L;
        } else {
            absDiff = sumR2L - sumL2R;
        }
        System.out.println(sumL2R);
        System.out.println(sumR2L);
        System.out.println(absDiff);
    }
}
