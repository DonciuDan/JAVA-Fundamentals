package OOP.Classes;


import OOP.Books.Book;

public class MainClasses {
    public static void main(String[] args) {
        Movie oppenheimer = new Movie();
        oppenheimer.setTitle("Oppenheimer");
        oppenheimer.setDurationInMinute(180);

        //asta era initial
//        oppenheimer.title = "Oppenheimer";
//        oppenheimer.durationInMinute = 180;

        oppenheimer.play();
        oppenheimer.stop();

//        System.out.println(oppenheimer.durationInMinute);

        System.out.println(oppenheimer.getDurationInMinute());
        System.out.println(oppenheimer.getTitle());

        System.out.println("------------------------------------------------------");

        Car car1 = new Car("red","VW",200);
        car1.printAllCarParameters();
        car1.setColor("blue");
        car1.printAllCarParameters();
        System.out.println("Marca masinii este " + car1.getBrand());

        Car car2 = new Car("Dacia",180);
        car2.setColor("white");

        Car car3 = new Car();

        car2.printAllCarParameters();
        car3.printAllCarParameters();


        System.out.println("---------------------------------------------");

        Book book1 = new Book(); //daca apare cu rosul s-ar putea sa nu fie importat obiectul s
        // i ca sa il importi selectezi clasa si dai alt+enter
        book1.author = "Eminescu";
        book1.setNumberOfPages(50);

        System.out.println("Autorul cartii este " + book1.author + ", numarul de pagini este " + book1.getNumberOfPages());

        OOP.AnotherBooks.Book bookFromAnother = new OOP.AnotherBooks.Book(); //asa poti face 2 importuri din pachete diferite




    }
}
