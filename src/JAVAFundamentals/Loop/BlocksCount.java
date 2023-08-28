package JAVAFundamentals.Loop;

public class BlocksCount {
    public static void main(String[] args) {
        //pb cu cuburile
        int result = 0; //aici e suma cuburilor
        int level = 3; //punctul de plecare a nivelului

        for (int i = 1 ; i <= level ; i++ ) {
            result = result + i * i;
        }
        System.out.println(result);
    }
}
