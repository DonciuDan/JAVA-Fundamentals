package JavaFundamentalsTema2;

public class TemaLoops5 {
    public static void main(String[] args) {
        String [] StringArray1 = {"Luni","Marti","Miercuri","Joi","Vineri"};
        TemaLoops5 obiect = new TemaLoops5();
        obiect.printInReverse(StringArray1);
    }
    public void printInReverse(String[] stringArray) {
        for (int i = 0; i<stringArray.length; i++) {
            int index = stringArray.length - 1 - i;
            System.out.println(stringArray[index]);
        }
//        for (int i = stringArray.length -1 ; i >= 0; i--) {
//            System.out.println(stringArray[i]);
//        }
    }
}
