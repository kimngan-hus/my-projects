package exercise1_2;

public class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        if ((0 <= hour && hour <= 23) && (0 <= minute && minute <= 59) && (0 <= second && second <= 59)) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            throw new IllegalArgumentException("Invalid hour, minute or second!");
        }
    }

    public void setTime(int hour, int minute, int second) {
        if ((hour >= 0 && hour <= 23) && (minute >= 0 && minute <= 59) && (second >= 0 && second <= 59)) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            System.out.println("Invalid hour, minute, or second!");
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        if (0 <= hour && hour <= 23) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Invalid hour!");
        }
    }

    public void setMinute(int minute) {
        if (0 <= minute && minute <= 59) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Invalid minute!");
        }
    }

    public void setSecond(int second) {
        if (0 <= second && second <= 59) {
            this.second = second;
        } else {
            throw new IllegalArgumentException("Invalid second!");
        }
    }

    @Override
    public String toString() {
        String Hour = String.format("%02d", hour);
        String Minute = String.format("%02d", minute);
        String Second = String.format("%02d", second);
        return Hour + ":" + Minute + ":" + Second;
    }

    public MyTime nextSecond() {
        if (second == 59) {
            second = 0;
            if (minute == 59) {
                minute = 0;
                if (hour == 23) {
                    hour = 0;
                } else {
                    hour++;
                }
            } else {
                minute++;
            }
        } else {
            second++;
        }
        return new MyTime(hour, minute, second);
    }

    public MyTime nextMinute() {
        if (minute == 59) {
            minute = 0;
            if (hour == 23) {
                hour = 0;
            } else {
                hour++;
            }
        } else {
            minute++;
        }
        return new MyTime(hour, minute, second);
    }

    public MyTime nextHour() {
        if (hour == 23) {
            hour = 0;
        } else {
            hour++;
        }
        return new MyTime(hour, minute, second);
    }

    public MyTime previousSecond() {
        if (second == 00) {
            second = 59;
            if (minute == 00) {
                minute = 59;
                if (hour == 00) {
                    hour = 23;
                } else {
                    hour--;
                }
            } else {
                minute--;
            }
        } else {
            second--;
        }
        return new MyTime(hour, minute, second);
    }

    public MyTime previousMinute() {
        if (minute == 00) {
            minute = 59;
            if (hour == 00) {
                hour = 23;
            } else {
                hour--;
            }
        } else {
            hour--;
        }
        return new MyTime(hour, minute, second);
    }

    public MyTime previousHour() {
        if (hour == 00) {
            hour = 23;
        } else {
            hour--;
        }
        return new MyTime(hour, minute, second);
    }
}
