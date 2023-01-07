public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        double average;
        int sumSquares = 0;
        int sumOdd = 0;
        int sumEven = 0;
        int absDiff;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        for (int number = LOWERBOUND; number <= UPPERBOUND; number++) {
            sum += number;
            sumSquares += number * number;
            count++;
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }
        if (sumOdd > sumEven) {
            absDiff = sumOdd - sumEven;
        } else {
            absDiff = sumEven - sumOdd;
        }
        average = sum / count;
        System.out.println(sum);
        System.out.println(average);
        System.out.println(sumSquares);
        System.out.println(sumOdd);
        System.out.println(sumEven);
        System.out.println(absDiff);
    }
}
