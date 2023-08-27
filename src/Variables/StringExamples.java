package Variables;

public class StringExamples {
    public static void main(String[] args) {
        String text = "This is a text";  // daca nu e unul dintre cele 8 primitive si e scris cu alb/negru este un obiect este o clasa
        System.out.println(text);
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

        text = text.toLowerCase();
        System.out.println(text);

        System.out.println(text.length());

        int lengthOfText = text.length();
        System.out.println("Lungimea textului este: " + lengthOfText); //se numeste concatenare

        text.concat(String.valueOf(lengthOfText));
        System.out.println(text.concat(" ").concat("alt text"));

        System.out.println(text.indexOf("text")); // ultima actualizare este la linia 12

        String anotherText = "This is a text";
        System.out.println(text.equals(anotherText));
        System.out.println(text.equalsIgnoreCase(anotherText));
        System.out.println(anotherText.replaceAll(" ",","));
        System.out.println(anotherText.contains("is"));

        System.out.println(text + "\n" + anotherText);


        //daca ai o eroare in alta clasa o sa deschida pag respectiva si nu poti sa rulezi altceva


    }


}
