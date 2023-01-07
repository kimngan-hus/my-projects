package exercise28;

public class MyCircle {
    private MyPoint center;
    private int radius = 1;

    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return this.center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX() {
        return this.center.getX();
    }
    public void setCenterX(int x){
        center.getX();
    }

    public int getCenterY() {
        return this.center.getY();
    }
    public void setCenterY(int y){
        center.getY();
    }
    public void setCenterXY(int x, int y) {
        this.center.setXY(x, y);
    }
    public int[] getCenterXY(){
        int[] results = new int[2];
        results[0] = center.getX();
        results[1] = center.getY();
        return results;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double distance(MyCircle another){
        int xDiff = this.getCenterX() - another.getCenterX();
        int yDiff = this.getCenterY() - another.getCenterY();
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    @Override
    public String toString() {
        return "MyCircle[" +
                "center=" + center +
                ", radius=" + radius +
                "]";
    }
}
