import java.util.Scanner;

public class PensionContributionCalculatorWithSentinel {
    public static void main(String[] args) {
        final int SALARY_CEILING = 6000;
        final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
        final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
        final double EMPLOYEE_RATE_55_TO_60 = 0.13;
        final double EMPLOYER_RATE_55_TO_60 = 0.13;
        final double EMPLOYEE_RATE_60_TO_65 = 0.075;
        final double EMPLOYER_RATE_60_TO_65 = 0.09;
        final double EMPLOYEE_RATE_65_ABOVE = 0.05;
        final double EMPLOYER_RATE_65_ABOVE = 0.13;
        int age;
        int salary;
        final int SENTINEL = -1;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the monthly salary (or -1 to end):$ ");
        salary = in.nextInt();
        while (salary != SENTINEL) {

            System.out.print("Enter the age: ");
            age = in.nextInt();
            int contributableSalary;
            double employerContribution;
            double employeeContribution;
            double totalContribution;
            if (salary > SALARY_CEILING) {
                contributableSalary = SALARY_CEILING;
            } else {
                contributableSalary = salary;
            }
            if (age <= 55) {
                employeeContribution = EMPLOYEE_RATE_55_AND_BELOW * contributableSalary;
                employerContribution = EMPLOYER_RATE_55_AND_BELOW * contributableSalary;
            } else if (age <= 60) {
                employeeContribution = EMPLOYEE_RATE_55_TO_60 * contributableSalary;
                employerContribution = EMPLOYER_RATE_55_TO_60 * contributableSalary;
            } else if (age <= 65) {
                employeeContribution = EMPLOYEE_RATE_60_TO_65 * contributableSalary;
                employerContribution = EMPLOYER_RATE_60_TO_65 * contributableSalary;
            } else {
                employeeContribution = EMPLOYEE_RATE_65_ABOVE * contributableSalary;
                employerContribution = EMPLOYER_RATE_65_ABOVE * contributableSalary;
            }
            System.out.print("The employer's contribution is: ");
            System.out.println(employerContribution);
            System.out.print("The employee's contribution is: ");
            System.out.println(employeeContribution);
            System.out.print("Enter the monthly salary (or -1 to end):$ ");
            salary = in.nextInt();
        }
        System.out.println("Bye!");
    }

}
