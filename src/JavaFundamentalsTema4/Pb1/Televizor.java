package JavaFundamentalsTema4.Pb1;

public class Televizor {
    private int sizeOfTheTelevision;
    private String colorOfTheTelevision;
    private int howManyChannels;
    private String brand;
    private int howMuchDoesItCosts;

    public void setHowMuchDoesItCosts(int howMuchDoesItCosts) {
        this.howMuchDoesItCosts= howMuchDoesItCosts;
    }

    public int getHowMuchDoesItCosts() {
        return howMuchDoesItCosts;
    }

    public void setBrand (String brand) {
        this.brand = brand;
    }

    public String getBrand (){
        return brand;
    }

    public void setHowManyChannels(int howManyChannels){
        this.howManyChannels = howManyChannels;
    }

    public int getHowManyChannels (){
        return howManyChannels;
    }

    public void setColorOfTheTelevision (String colorOfTheTelevision) {
        this.colorOfTheTelevision = colorOfTheTelevision;
    }

    public String getColorOfTheTelevision (){
        return colorOfTheTelevision;
    }

    public int getSizeOfTheTelevision(){
        return sizeOfTheTelevision;
    }

    public void setSizeOfTheTelevision(int sizeOfTheTelevision){
        this.sizeOfTheTelevision = sizeOfTheTelevision;
    }

    public Televizor(int sizeOfTheTelevision, int howManyChannels, int howMuchDoesItCosts, String colorOfTheTelevisionm, String brand) {
        this.sizeOfTheTelevision = sizeOfTheTelevision;
        this.brand=brand;
        this.colorOfTheTelevision=colorOfTheTelevisionm;
        this.howManyChannels = howManyChannels;
        this.howMuchDoesItCosts=howMuchDoesItCosts;
    }

    public void printAllInformation () {
        System.out.printf("Televizorul are urmatoarele dimensiuni: %s\nMarca televizorului este: %s\nTelevizorul are o culoare %s\nTe poti uita la %s canale pe el\nSi costa doar %s",sizeOfTheTelevision,brand,colorOfTheTelevision,howManyChannels,howMuchDoesItCosts);

    }
}
