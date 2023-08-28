package JAVAFundamentals.Variables;

public class DataTypes {

    public static void main(String[] args) {
        //toate de mai jos ai cele 8 date primitive care sunt folosite in interiorul clasei
        //le folosesti in functie de memoria pe care vrei sa o folosesti, poate lucrezi pt o platforma care are limitata capacitatea de memorie
        byte byteNumber = 126;              //capacitatea maxima la acest tip de variabila este 127
        byteNumber = (byte) (byteNumber + 1);        //nu merge sa depasesc variabila de 127 si apare eroare si apare provided: int

        short shortNumber = 12500;

        short shortNumber1 = (short) (byteNumber + 1); //trebuie sa faci un cast pentru a functiona

        int intNumber = 1;

        long longNumber = Integer.MAX_VALUE + 1; // 2147483647 + 1
        //long number este –9,223,372,036,854,775,808 si 9,223,372,036,854,775,807

        int anotherIntNumber = (int) (156L + intNumber);

        System.out.println(anotherIntNumber);

        byte byteNumberTwo = (byte) (shortNumber + 10); //trebuie sa punem parantezele la tot rezultatul ca sa transforme tot in byte
        System.out.println(byteNumberTwo);

        float floatNumber = 12.25f;
        double doubleNumer = 12.25; //toate numerele cu virgula le vede double si daca vrem float trebuie sa scriem f la final
        // putem trece D sau d mare la double daca vrem sa fie mai vizibile

        float anotherFloatNumber = (float) 50.5 + floatNumber; // tot timpul ca si mai sus, o sa ia in considerare numarul cel mai mare de ex: double sau daca ai byte cu int o sa ia int
        //diferenta intre float si double ca si mai sus este vorba de capacitatea de memorie, foloseste intervale mai mari sau mai mici

        boolean value = true;
        boolean anotherValue = value && false; // && este si; cand e si tot timpul va da false cand e si un false
        boolean anotherValue1 = value || false; // || este pt sau; si da tot timpul adev cand e adev

        System.out.println(anotherValue); //sout comanda rapida pt a printa
        System.out.println(anotherValue1);

        //char, aici ai doar caractere (cifre,litere,orice), se pune doar un singur caracter si se pun intre aprostof, dar cu o singrua '
        char firstCharacter = 'h';
        char newLine = '\n'; //pune o linie noua cand printezi
        System.out.print(newLine); //pui fara ln la print ca sa fie doar spatiu de la \n
        System.out.println(firstCharacter);
        System.out.println(newLine);//aici o sa am 2 linii pt ce am scris mai sus
        System.out.println(firstCharacter);

        //numele de la clase,variabile samd nu le putem folosi ca nume de variabile de ex: int int
        //caracterul e doar 1 singur
        //





    }





}
