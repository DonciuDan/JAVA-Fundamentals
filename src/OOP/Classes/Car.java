package OOP.Classes;

public class Car {

    private String color;
    private String brand;
    private int maxSpeed;

    public Car(String color, String brand, int maxSpeed) {
        this(brand,maxSpeed); //constructor overloading, practic folosesti alt constructor in constructorul asta
        this.color = color;

    //ex original:
//    public Car(String color, String brand, int maxSpeed) { //constructor, seamana cu metoda, diferenta este ca nu exista tipul de returnare (void,int,etc) intre public si numele
//        //numele constructorului trebuie sa aiba acelasi nume precum clasa
//        this.color = color;
//        this.brand = brand;
//        this.maxSpeed = maxSpeed;

    }

    public void setColor(String color) { //la metoda ai (), la set trebuie sa treci si tipul si numele variabilei ca sa o poti seta
        this.color = color;
    }

    public String getBrand() { // la get nu trebuie sa treci in () tipul si numele ca vrei sa il iei
        return brand;
    }

    public Car() { //daca vrem sa il avem si pe cel default si am deja un constructor trebuie sa il creez si pe cel default
        //in general e bine sa iti faci constructorul tau, si ca sa nu schimbi in multe linii create de altcineva, poti crea default

    }

    public void printAllCarParameters() {
        System.out.println(String.format("The car color is %s, the brand is %s and the maxSpeed is %s", color, brand, maxSpeed)); //sa nu mai fac cu
        //   System.out.printf("The car color is %s, the brand is %s and the maxSpeed is %s \n",color,brand,maxSpeed);
        //\n ca sa lase spatiu pe urmatorul rand
    }

    public Car(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;

    }

    /*nu poti sa declari acelasi constructor cu tipul parametrilor sa fie acelasi in aceeasi ordine
    EX:
    public Car(String brand, String color, int maxSpeed) { /
        this.brand = brand;
        this.color = color;
                this.maxSpeed = maxSpeed;

     */
}


