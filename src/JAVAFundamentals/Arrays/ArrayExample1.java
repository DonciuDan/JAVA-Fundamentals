package JAVAFundamentals.Arrays;

public class ArrayExample1 {
    public static void main(String[] args) {

        ArrayExample1 object = new ArrayExample1();
        String[] arrayOfString = {"Dan","ANA","Maria","Marcel"};
        System.out.println(object.findTheLongestText(arrayOfString));
    }

    String findTheLongestText(String[] arrayOfText) {
        String longestText = arrayOfText[0];
        for (String myText : arrayOfText) {
            // ":" inseamna din
            if (longestText.length() < myText.length()){ // daca vrem sa fie primul pastrat ca sa fie comparat cu urmatorul punem doar mai mic fara egal
                longestText = myText;
            }


        }
        return longestText;
    }



}
