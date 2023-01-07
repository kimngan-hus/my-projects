public class LengthNumberSequence {
    public static int NumOfDigits(int n){
        int count =0;
        while(n!=0){
            n = n/ 10;
            count++;
        }
        return count;
    }
    public static int length(int n){
        if( n==1)
            return 1;
        else
            return length(n-1) + NumOfDigits(n);
    }
    public static void main(String[] args){
        System.out.print("S(12)=");
        for (int i = 1; i <= 12; i++) {
            System.out.print(i);
        }
        System.out.println("\n");
        System.out.println("length is "+length(12));
    }
}
