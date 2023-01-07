import java.util.Scanner;

public class GradesStatistics {
    private final int GRADE_MINIMUN = 0;
    private final int GRADE_MAXIMUN = 100;
    private int[] grades;

    public static void main(String[] args) {
        GradesStatistics aGradeStatistics = new GradesStatistics();
        aGradeStatistics.readGrades();
        System.out.printf("The average is: %1$.2f\n ", aGradeStatistics.averageGrade());
        System.out.printf("The min is : %1$d\n", aGradeStatistics.minGrade());
        System.out.printf("The max is: %1$d\n", aGradeStatistics.maxGrade());
    }

    private void readGrades() {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter the number of students: ");
        int numberStudent = sc.nextInt();
        grades = new int[numberStudent];
        int i = 0;
        while (i < numberStudent) {
            System.out.printf("enter the grade for student %1$d: ", (i + 1));
            int grade = sc.nextInt();
            if (GRADE_MAXIMUN >= grade && GRADE_MINIMUN <= grade) {
                grades[i] = grade;
                i++;
            } else {
                System.out.println("error! numberStudent must be integer between 0 and 100");
            }
        }
    }

    private int minGrade() {
        if (grades.length == 0) {
            return 0;
        }
        int min = grades[0];
        for (int i = 0; i < grades.length; i++) {
            if (min > grades[i]) {
                min = grades[i];
            }
        }
        return min;
    }
    private int maxGrade(){
        if (grades.length == 0){
            return 0;
        }
        int max = grades[0];
        for (int i = 0; i < grades.length; i++) {
            if (max < grades[i]){
                max = grades[i];
            }
        }
        return max;
    }
    private double averageGrade(){
        int sum = 0;
        if (grades.length == 0){
            return 0;
        }
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        int average = sum / grades.length;
        return average;
    }

}
