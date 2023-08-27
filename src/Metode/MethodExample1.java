package Metode;

public class MethodExample1 {
    public static void main(String[] args) {
        prinName("Dan");
        System.out.println(createFullName("Dan","Donciu"));
    }

    static void prinName (String name) {
        System.out.println(name);
    }

    static String createFullName (String prenume, String name) { // ca sa avem mai multi parametri de intrare si ii punem cu virgula
        //Toate metodele care au String, int, samd, va returna doar aia
        String fullName = name.concat(" ").concat(prenume);
        //String fullName1 = name + prenume;
        return fullName;
        //return fullName1;
    }
}
