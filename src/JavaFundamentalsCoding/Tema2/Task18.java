package JavaFundamentalsCoding.Tema2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task18 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("acho+!");
        Scanner scanner = new Scanner(System.in);
        Matcher matcher = pattern.matcher(scanner.nextLine());
        while(!matcher.matches()){
            matcher = pattern.matcher(scanner.nextLine());

//        if (matcher.matches()) {
//            System.out.println("Bless you!");
        }
            System.out.println("Bless you!");
    }
}
