package exercise1_2;

 class Circle implements GeometricObject {
     private double radius;
     public Circle(double radius){
         this.radius=radius;
     }

     @Override
     public String toString() {
         return "Circle[radius=" + radius +
                 "]";
     }

     @Override
     public double getArea() {
         return (this.radius*this.radius*Math.PI);
     }

     @Override
     public double getPerimeter() {
         return (2*Math.PI*this.radius);
     }
 }
