package exercise1_7;

import java.util.concurrent.Callable;

public class testMain {
    public static void main(String[] args) {
        //Using the subclasses
        Cat cat1 = new Cat();
        cat1.greeting();//Meow!
        Dog dog1 = new Dog();
        dog1.greeting();//Woof!
        BigDog bigdog1 = new BigDog();
        bigdog1.greeting();//Woow!
        // Using Polymorphism
        Animal animal1 = new Cat();
        animal1.greeting();//Meow!
        Animal animal2 = new Dog();
        animal2.greeting();//Woof!
        Animal animal3 = new BigDog();
        animal3.greeting();//Woow!
      //  Animal animal4 = new Animal() ;class Animal là abstract class nên phải có phương thức greeting()
        //Downcast
        Dog dog2 = (Dog) animal2;
        BigDog bigDog2 = (BigDog) animal3;
        Dog dog3 = (Dog) animal3;//Wooooooowwwww
        Cat cat2 = (Cat) animal2;
        dog2.greeting(dog3);//Woooooooof!
        dog3.greeting(dog2);//
        dog2.greeting(bigDog2);//Woooooooof!
        bigDog2.greeting(dog2);//Wooooooooowwwww
        bigDog2.greeting(bigdog1);//Woooooooowwwww
    }
}
