package exercise2_7;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;
    public MyLine (MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end   = end;
    }
    public MyLine(int X1, int Y1, int X2, int Y2) {
        begin = new MyPoint(X1, Y1);
        end   = new MyPoint(X2, Y2);
    }

    @Override
    public String toString() {
        return "MyLine[begin=" + begin + ",end= " + end + " ]";
    }

    public MyPoint getBegin() {
        return begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public int getBeginY() {
        return begin.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }
    public int[] getBeginXY(){
        int[] results1 = new int[2];
        results1[0]=begin.getX();
        results1[1]=begin.getY();
        return results1;
    }
    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public void setEndY(int y) {
        end.setY(y);
    }
    public int[] getEndXY(){
        int[] results2 = new int[2];
        results2[0]=end.getX();
        results2[1]=end.getY();
        return results2;
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    public int getLength() {
        int xDiff = getEndX() - getBeginX();
        int yDiff = getEndY() - getBeginY();
        return (int)  Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double getGradient() {
        int xDiff = getEndX() - getBeginX();
        int yDiff = getEndY() - getBeginY();
        return Math.atan2(yDiff, xDiff);
    }
}
