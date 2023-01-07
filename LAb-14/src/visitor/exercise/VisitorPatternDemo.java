package visitor.exercise;

public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer(new ComputerPart[] {new Mouse(),new Keyboard(), new Monitor()}) ;
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
