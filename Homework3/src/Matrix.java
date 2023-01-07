public class Matrix {
    public static void createRandomMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random(10);
            }
        }
    }
    public static int random(int n){
        double r = Math.random();
        return (int) (r * n);
    }
    public static int[][] createRandomMatrix(int rows, int cols){
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[rows][cols]= random(10);
            }
        }
        return matrix;
    }
    public static void print(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j] +" ");
            }
        }
    }
    public static void print(double[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j] + " ");
            }
        }
    }
    public static boolean haveSameDimension(int[][] matrix1,int[][] matrix2){
        if ((matrix1.length == matrix2.length)&&(matrix1[0].length==matrix2[0].length))
            return true;
        return false;
    }
    public static boolean haveSameDimension(double[][] matrix1,double[][] matrix2){
        if ((matrix1.length == matrix2.length)&&(matrix1[0].length==matrix2[0].length))
            return true;
        return false;
    }
    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        int[][] sum = new int[matrix1.length][matrix1[0].length];
        if (haveSameDimension(matrix1, matrix2)) {
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[0].length; j++) {
                    sum[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
        }else {
            System.out.println("error!");
        }
        return sum;
    }
    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        int[][] sub = new int[matrix1.length][matrix1[0].length];
        if (haveSameDimension(matrix1, matrix2)) {
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[0].length; j++) {
                    sub[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
        }else {
            System.out.println("error!");
        }
        return sub;
    }
    public static int[][] multiply(int[][] matrix1, int[][] matrix2){
        int[][] mul = new int[matrix1.length][matrix2[0].length];
        if (matrix1[0].length!= matrix2.length){
            System.out.println("error!");
        } else  {
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    mul[i][j] = 0;
                    for (int k = 0; k < matrix1[0].length; k++) {
                        mul[i][j] = mul[i][j] + matrix1[i][k]*matrix2[k][j];
                    }
                }
            }
            }
        return mul;
        }
    }

