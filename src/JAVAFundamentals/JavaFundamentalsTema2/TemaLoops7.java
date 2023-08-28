package JAVAFundamentals.JavaFundamentalsTema2;

public class TemaLoops7 {
    public static void main(String[] args) {
        int rows = 3;
        for (int i = 1; i <= rows; i++) {
            String thisRow = "";
            for (int j = 0; j < i; j++) {
                thisRow = thisRow + "#";
            }
            System.out.println(thisRow);
        }
    }
}
