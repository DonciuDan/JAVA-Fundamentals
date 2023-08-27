package Regex;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        Pattern pattern1 = Pattern.compile("alo+"); //alo, alooo, aloooooo..
        System.out.println("Te rog introdu un text care sa fie verificat daca indeplineste sau nu patternul");
        Scanner scanner = new Scanner(System.in);
        Matcher matcher = pattern1.matcher(scanner.nextLine());
        System.out.println(matcher.matches());
        System.out.println("----------------------------------------------------");

        Pattern pattern2 = Pattern.compile("[a-zA-Z 0-9]*"); // asa acepta litere mici, litere mari, spatiu si cifre
        System.out.println("Introdu litere mici:");
        Matcher matcher2 = pattern2.matcher((scanner.nextLine()));
        System.out.println("Textul introdus verifica patternul: " + matcher2.matches());

        System.out.println("----------------------------------------------------");
        Pattern pattern3 = Pattern.compile("[a-zA-Z]*"); // asa acepta litere mici, litere mari, spatiu si cifre
        System.out.println("Introdu litere mici:");
        Matcher matcher3 = pattern3.matcher((scanner.nextLine()));
        System.out.println("Textul introdus verifica patternul: " + matcher3.find());
        scanner.close();
    }
}
