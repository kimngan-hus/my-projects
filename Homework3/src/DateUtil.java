import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateUtil {

    private static final int MIN_YEAR = 1;
    private static final int MAX_YEAR = 9999;
    private static final String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    private static final String[] strDays   = {"Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"};
    private static final int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private static final int[] nonLeapYearMonthNumbers = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};

    private static final int[] leapYearMonthNumbers    = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};


    public static void main(String[] args) {


        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2011));
        System.out.println(isLeapYear(2012));

        System.out.println(isValidDate(2012, 2, 29));
        System.out.println(isValidDate(2011, 2, 29));
        System.out.println(isValidDate(2099, 12, 31));
        System.out.println(isValidDate(2099, 12, 32));

        System.out.println(getDayOfWeek(1982, 4, 24));
        System.out.println(getDayOfWeek(2000, 1, 1));
        System.out.println(getDayOfWeek(2054, 6, 19));
        System.out.println(getDayOfWeek(2012, 2, 17));


        getDayOfWeekTest(1982, 4, 24);
        getDayOfWeekTest(2000, 1, 1);
        getDayOfWeekTest(2054, 6, 19);
        getDayOfWeekTest(2012, 2, 17);


        System.out.println(toString(2012, 2, 14));
        System.out.println(toString(2014, 2, 26));
    }
    private static boolean isLeapYear(int year) {
        return (year%4 == 0 && year%100 != 0) || (year%400 == 0);
    }
    private static boolean isValidDate(int year, int month, int day)
    {
        if (year < MIN_YEAR || year > MAX_YEAR) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        int monthDays = daysInMonths[month-1] + (month == 2 && isLeapYear(year) ? 1 : 0);
        return 1 <= day && day <= monthDays;
    }

    private static int getDayOfWeek(int year, int month, int day)
    {
        int magicCenturyNumber = 6 - 2*((year / 100) % 4);
        int lastTwoDigitsOfYear = year % 100;
        int magicYearNumber = lastTwoDigitsOfYear / 4;
        int magicMonthNumber = isLeapYear(year) ? leapYearMonthNumbers[month-1] : nonLeapYearMonthNumbers[month-1];
        int magicDayNumber = day;
        return (  magicCenturyNumber + lastTwoDigitsOfYear
                + magicYearNumber    + magicMonthNumber + magicDayNumber) % 7;
    }
    private static void getDayOfWeekTest(int year, int month, int day) {
        Calendar cal = new GregorianCalendar(year, month - 1, day);
        int dayNumber = cal.get(Calendar.DAY_OF_WEEK);
        String[] calendarDays = { "Sunday", "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday" };
        System.out.println("It is " + calendarDays[dayNumber - 1]);
    }

    private static String toString(int year, int month, int day) {
        if ( ! isValidDate(year, month, day)) {
            return "Not a valid date!";
        }
        int d = getDayOfWeek(year, month, day);
        return strDays[d] + " " + day + " " + strMonths[month-1] + " " + year;
    }
}