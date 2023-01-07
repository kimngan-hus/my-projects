package exercise1_3;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {
    private static final int MIN_YEAR = 1;
    private static final int MAX_YEAR = 9999;
    private int year;
    private int month;
    private int day;
    private String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    private String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    private int[] DayInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] nonLeapYearMonthNumbers = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};

    private static final int[] leapYearMonthNumbers = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) | (year % 400 == 0))
            return true;
        return false;
    }

    public boolean isValidDate(int year, int month, int day) {

        int DaysInAMonth = DayInMonths[month - 1] + (month == 2 && isLeapYear(year) ? 1 : 0);
        return (MIN_YEAR <= year && year <= MAX_YEAR)
                && (1 <= month && month <= 12)
                && (1 <= day && day <= DaysInAMonth);
    }

    public static int getDayOfWeek(int year, int month, int day) {
        int magicCenturyNumber = 6 - 2 * ((year / 100) % 4);
        int lastTwoDigitsOfYear = year % 100;
        int magicYearNumber = lastTwoDigitsOfYear / 4;
        int magicMonthNumber = isLeapYear(year) ? leapYearMonthNumbers[month - 1] : nonLeapYearMonthNumbers[month - 1];
        int magicDayNumber = day;
        return (magicCenturyNumber + lastTwoDigitsOfYear
                + magicYearNumber + magicMonthNumber + magicDayNumber) % 7;
    }

    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    public void setDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid year, month, or day!");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < MIN_YEAR || year > MAX_YEAR) {
            throw new IllegalArgumentException("Invalid year!");
        }
        this.year = year;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month!");
        }
        this.month = month;
    }

    public void setDay(int day) {
        int DaysInAMonth = DayInMonths[month - 1] + (month == 2 && isLeapYear(year) ? 1 : 0);
        if (1 > day || day > DaysInAMonth) {
            throw new IllegalArgumentException("Invalid day!");
        }
        this.day = day;
    }

    @Override
    public String toString() {
        return DAYS[getDayOfWeek(year, month, day)] + " " + day + " " + MONTHS[month - 1] + " " + year;
    }

    public MyDate nextDay() {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day < 31)
                    setDate(year, month, day + 1);
                if (day == 31)
                    setDate(year, month + 1, 1);
                return this;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day < 30)
                    setDate(year, month, day + 1);
                if (day == 30)
                    setDate(year, month + 1, 1);
                return this;
            case 2:
                if (day < 28)
                    setDate(year, month, day + 1);
                if (day == 28) {
                    if (isLeapYear(year))
                        setDate(year, month, 29);
                    else
                        setDate(year, month + 1, 1);
                    return this;
                }
            case 12:
                if (day == 31)
                    setDate(year + 1, 1, 1);
                if (day < 31)
                    setDate(year, month + 1, 1);
                return this;
        }
        return this;
    }

    public MyDate nextMonth() {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day == 31)
                    setDate(year, month + 1, 30);
                else
                    setDate(year, month + 1, day);
                return this;
            case 4:
            case 6:
            case 9:
            case 11:
                setDate(year, month + 1, day);
                return this;
            case 2:
                if (day == 28) {
                    if (isLeapYear(year))
                        setDate(year, month + 1, 29);
                    else
                        setDate(year, month + 1, 28);
                } else
                    setDate(year, month + 1, day);
                return this;
        }
        return this;
    }

    public MyDate nextYear() {
        if (year > MAX_YEAR) {
            throw new IllegalArgumentException("Year out of range!");
        }
        switch (month) {
            case 2:
                if (isLeapYear(year)) {
                    if (day == 29)
                        setDate(year + 1, 2, 28);
                }
            default:
                return new MyDate(year + 1, month, day);
        }
    }

    public MyDate previousDay() {
        switch (month) {
            case 5:
            case 7:
            case 10:
            case 12:
                if (day == 1)
                    setDate(year, month - 1, 30);
                else
                    setDate(year, month, day - 1);
                return this;
            case 2:
            case 4:
            case 6:
            case 8:
            case 9:
            case 11:
                if (day == 1)
                    setDate(year, month - 1, 31);
                else
                    setDate(year, month, day - 1);
                return this;
            case 3:
                if (day == 1) {
                    if (isLeapYear(year))
                        setDate(year, month - 1, 29);
                    else
                        setDate(year, month - 1, 28);
                    return this;
                }
            case 1:
                if (day == 1)
                    setDate(year - 1, 12, 31);
                else
                    setDate(year, month, day - 1);
                return this;
        }
        return this;
    }

    public MyDate previousMonth() {
        switch (month) {
            case 5:
            case 7:
            case 10:
            case 12:
            case 2:
            case 1:
                if (day == 31)
                    setDate(year, month - 1, 30);
                else
                    setDate(year, month - 1, day);
                return this;
            case 4:
            case 6:
            case 9:
            case 11:
                setDate(year, month - 1, day);
                return this;
            case 3:
                if (day >= 28) {
                    if (isLeapYear(year))
                        setDate(year, month - 1, 29);
                    else
                        setDate(year, month - 1, 28);
                } else
                    setDate(year, month - 1, day);
                return this;
        }
        return this;
    }

    public MyDate previousYear() {
        if (month == 2) {
            if (isLeapYear(year)) {
                if (day == 29)
                    setDate(year - 1, 2, 28);
                else
                    setDate(year - 1, 2, day);
            } else
                setDate(year - 1, month, day);

        } else {
            setDate(year - 1, month, day);
        }
        return this;
    }
}