package JavaFundamentalsTema3;


import java.time.LocalDate;
import java.time.LocalTime;

public class MainJavaFundamentalsTema3 {
    public static void main(String[] args) {

        System.out.println("I'm looking for a new apartment and today " + LocalDate.now() +" I visited 3 apartments");
        System.out.println("I visited the first apartment at " + LocalTime.of(10, 30) + " and it had the next characteristics: ");
        Apartment firstApartment = new Apartment(2,1,1,1,1,60,1990, "beige","beige","brown","white");

        firstApartment.setPositionOfTheApartment("N-N-E");
        firstApartment.setFloorTheApartmentIsSituated(1);
        firstApartment.printAllApartmentParameters();

        System.out.println();


    }
}
