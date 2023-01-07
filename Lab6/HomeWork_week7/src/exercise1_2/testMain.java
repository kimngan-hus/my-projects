package exercise1_2;

public class testMain {
    public static void main(String[] args) {
        MyTime m1 = new MyTime();
        System.out.println(m1);
        m1.setHour(18);
        m1.setMinute(34);
        m1.setSecond(55);
        System.out.println("hour is:"+m1.getHour());
        System.out.println("minute is:"+m1.getMinute());
        System.out.println("second is:" +m1.getSecond());
        MyTime m2 = new MyTime(23,59,59);
        MyTime m3 = new MyTime(0,0,0);
        System.out.println("next second of m2 is:"+m2.nextSecond());
        System.out.println("next minute of m2 is:"+m2.nextMinute());
        System.out.println("next hour of m2 is:"+m2.nextHour());
        System.out.println("previous second of m3 is:"+m3.previousSecond());
        System.out.println("previous minute of m3 is:"+m3.previousMinute());
        System.out.println("previous hour of m3 is:"+m3.previousHour());
    }
}
