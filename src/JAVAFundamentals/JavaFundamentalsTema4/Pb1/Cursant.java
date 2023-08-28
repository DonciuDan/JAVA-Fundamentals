package JAVAFundamentals.JavaFundamentalsTema4.Pb1;

public class Cursant {
    private int iq;
    private String hairColor;
    private String eyesColor;
    private int age;
    private int height;
    private String name;

    public int getAge() {
        return age;
    }

    public int getiq() {
        return iq;
    }

    public int getHeight() {
        return height;
    }

    public String getHairColor(){
        return hairColor;
    }

    public String getEyesColor(){
        return eyesColor;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setiq(int iq) {
        this.iq= iq;
    }

    public void setHairColor(String hairColor){
        this.hairColor = hairColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public void setHeight (int height){
        this.height = height;
    }

    public void setName (String name){
        this.name = name;
    }

    public Cursant (String name, String eyesColor, int height, String hairColor, int iq) {
        this.name =name;
        this.eyesColor=eyesColor;
        this.height=height;
        this.hairColor=hairColor;
        this.iq=iq;

    }
    public void printAllInformation(){
        System.out.printf("%s\n%s\n%s\n%s\n%s",iq,name,eyesColor,height,hairColor);

    }
}
