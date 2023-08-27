package OOP.StaticClasses;

public class Main {
    public static void main(String[] args) {
        ExternalClass objectFromExternalClass = new ExternalClass();
        ExternalClass.InternalClass objectFromInternalClass = objectFromExternalClass.init();
        ExternalClass.InternalClass otherObjectFromInternalClass = new ExternalClass.InternalClass();
        objectFromInternalClass.print("Some text");
        otherObjectFromInternalClass.print("Another Text");

        //daca e static nu poti face obiect ca sa folosesti acea metoda, trebuie sa faci
    }
}
