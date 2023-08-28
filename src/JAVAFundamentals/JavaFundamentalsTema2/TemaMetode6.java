package JAVAFundamentals.JavaFundamentalsTema2;

public class TemaMetode6 {
    public static void main(String[] args) {
        TemaMetode6 object = new TemaMetode6();
        object.nameTagText("Dan");
    }

    public String nameTagText (String name) {
        System.out.println("Hello, my name is " + name);
        return name;
    }
}
