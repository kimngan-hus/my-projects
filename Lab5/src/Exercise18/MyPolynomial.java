package Exercise18;

public class MyPolynomial {
    private double[] coeffs;
    public MyPolynomial(double... coeffs){
        this.coeffs = coeffs;
    }
    public int getDegree(){
        return this.coeffs.length-1;
    }

}
