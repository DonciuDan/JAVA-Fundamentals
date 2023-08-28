package JAVAFundamentals.JavaFundamentalsTema2;

public class TemaLoops3 {
    public static void main(String[] args) {

    }
    public static int indexOfFirstOccurrence(String[] stringArray, String target) {
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
}


