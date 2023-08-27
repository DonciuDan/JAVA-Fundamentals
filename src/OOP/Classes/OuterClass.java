package OOP.Classes;

public class OuterClass {
    private int number;

    public class InnerClass {
        public void printNumber () {
            System.out.println(number);
        }
    }
    public InnerClass init(){ // este in OuterClass in cazul asta
        //InnerClass object = new InnerClass();
        return new InnerClass(); //obiectul din innerclass poti face direct asa ca sa nu mai creezi obiectul cum am facut mai sus


    }
    public void setNumber(int number){
        this.number = number;
    }
}
