package JavaFundamentalsTema1;

public class TemaVariabileQ6 {
    public static void main(String[] args) {
        String firstName = "Dan";
        String lastName = "Donciu";
        String fullname = firstName.concat(" ").concat(lastName);

        System.out.println("Hello, my name is " + fullname);
        System.out.println("There are " + fullname.length() + " letters in my name.");

    }
}
