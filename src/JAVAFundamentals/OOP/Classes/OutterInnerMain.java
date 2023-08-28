package JAVAFundamentals.OOP.Classes;

public class OutterInnerMain {
    public static void main(String[] args) {
        OuterClass objectFromOuterClass = new OuterClass();
        objectFromOuterClass.setNumber(5);


        OuterClass anotheObjectFromOuterClass = new OuterClass();
        OuterClass.InnerClass objectFromInnerClass = objectFromOuterClass.init(); //daca aveam static la public InnerClass init puteam sa o apelez fara crearea obiectului
        OuterClass.InnerClass anotherObjectFromInnerClass = objectFromOuterClass.new InnerClass();

        objectFromInnerClass.printNumber();
        anotherObjectFromInnerClass.printNumber();
    }
}
