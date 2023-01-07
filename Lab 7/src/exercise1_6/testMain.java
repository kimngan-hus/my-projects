package exercise1_6;

import java.util.concurrent.Callable;

public class testMain {
    public static void main(String[] args) {
        Animal a1 = new Cat("lili");
        a1.greets();

       Cat c1 = (Cat) a1;
       c1.greets();

       Animal a2 = new Dog("Bond") ;
       a2.greets();

       Dog d1 = (Dog) a2;
       d1.greets();

       BigDog b1 = new BigDog("Lor");
       BigDog b2 = new BigDog("Yor");
       b1.greets();
       b1.greets(d1);
       b1.greets(b2);
    }
}
