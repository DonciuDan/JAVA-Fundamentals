package JavaFundamentalsTema4.Pb1;

public class CosDeCumparaturi {

    private int dimensions;
    private String howYouCanHandleIt;
    private String color;
    private String material;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHowYouCanHandleIt() {
        return howYouCanHandleIt;
    }

    public void setHowYouCanHandleIt(String howYouCanHandleIt) {
        this.howYouCanHandleIt = howYouCanHandleIt;
    }

    public int getDimensions() {
        return dimensions;
    }

    public void setDimensions(int dimensions) {
        this.dimensions = dimensions;
    }

    public CosDeCumparaturi(int dimension,String howYouCanHandleIt, String color, String material) {
        this.dimensions = dimension;
        this.howYouCanHandleIt = howYouCanHandleIt;
        this.color = color;
        this.material = material;
    }

    public void printAllInformation (){
        System.out.println(dimensions + "\n" + howYouCanHandleIt + "\n" + color + "\n" + material);
    }

}


