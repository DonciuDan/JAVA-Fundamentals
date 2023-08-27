package Loop;

import java.util.Scanner;

public class BlocksCountWithScanner {

    public static void main(String[] args) {
        //pb cu cuburile cu scanner
        int result = 0; //aici e suma cuburilor
        Scanner scan = new Scanner(System.in);
        System.out.println("Introdu numarul de cate randuri de cuburi vrei sa fie:");
        int levels = scan.nextInt();

        for (int i = 1 ; i <= levels ; i++ ) {
            result = result + i * i;
        }
        System.out.println("Ca sa construiesti piramida ai nevoie de:");
        System.out.println(result);
    }
}
