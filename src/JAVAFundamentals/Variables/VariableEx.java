package JAVAFundamentals.Variables;

public class VariableEx {
    public static void main(String[] args) {
        //Variabilele sunt compuse din 2 lucruri type si name;
        int passengers; //Declararea variabilei
        passengers = 0; // Initializarea variabilei
        passengers = passengers + 5; // Actualizarea variabilei
        passengers = passengers - 2 + 3;
        passengers = passengers + 2;
        System.out.println(passengers); // Afisarea valorii din variabila


        int stops;
        int fare;
        stops = 0;
        fare = 0;
        stops = stops + 1;
        fare = fare + 5;
        stops = stops + 1;
        fare = fare + 3;
        stops = stops + 1;
        fare = fare + 7;
        System.out.println(stops);
        System.out.println(fare);

        int _numeDau;

        int name = 10; // Declarare si initializarea

        final int MINUTES_IN_AN_HOUR = 60;
        int minutesInADay = 24 * MINUTES_IN_AN_HOUR;
        System.out.println(minutesInADay);         // ambele variante sunt corecte
        System.out.println(MINUTES_IN_AN_HOUR * 24);

        // sa fii atent la ordine si la toate aspectele
        //declarare + initializare + actualizare
    }


}
