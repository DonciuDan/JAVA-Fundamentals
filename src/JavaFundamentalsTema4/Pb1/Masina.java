package JavaFundamentalsTema4.Pb1;

public class Masina {
    private String colorOfTheCar;
    private float engineCapacity;
    private int sizeOfTheCar;
    private int sizeOfThewheels;
    private int rezervoirCapacity;

    public int getRezervoirCapacity(){
        return rezervoirCapacity;
    }

    public void setRezervoirCapacity(int rezervoirCapacity){
        this.rezervoirCapacity = rezervoirCapacity;
    }

    public int getSizeOfTheCar (){
        return sizeOfTheCar;
    }

    public void setSizeOfTheCar (int sizeOfTheCar){
        this.sizeOfTheCar = sizeOfTheCar;
    }

    public int getSizeOfThewheels() {
        return sizeOfThewheels;
    }

    public void setSizeOfThewheels(int sizeOfThewheels) {
        this.sizeOfThewheels = sizeOfThewheels;
    }

    public float getEngineCapacity(){
        return engineCapacity;
    }

    public void setEngineCapacity(float engineCapacity){
        this.engineCapacity = engineCapacity;
    }

    public String getColorOfTheCar(){
        return colorOfTheCar;
    }

    public void setColorOfTheCar(String colorOfTheCar){
        this.colorOfTheCar = colorOfTheCar;
    }

    public Masina(int sizeOfTheCar, int sizeOfThewheels, String colorOfTheCar, float engineCapacity, int rezervoirCapacity) {
        this.colorOfTheCar = colorOfTheCar;
        this.sizeOfTheCar = sizeOfTheCar;
        this.sizeOfThewheels = sizeOfThewheels;
        this.rezervoirCapacity = rezervoirCapacity;
        this.engineCapacity=engineCapacity;

    }

    public void printAllInformation(){
        System.out.printf("%s\n%s\n%s\n%s\n%s",colorOfTheCar,sizeOfThewheels,sizeOfTheCar,rezervoirCapacity,engineCapacity);

    }
}
