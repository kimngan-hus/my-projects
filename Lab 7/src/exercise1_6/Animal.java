package exercise1_6;

abstract public class Animal {
    private String name;
    public Animal(String name){
        this.name=name;
    }
    public abstract void greets();
}
