package JavaFundamentalsTema3;

public class Apartment {

    private String colorOfTheWalls;
    private int rooms;
    private int bathroom;
    protected int hall;
    public int balcony;
    private int kitchen;
    int dimensionOfApartment;
    String positionOfTheApartment;
    public String colorOfTheOutsideDoor;
    protected String colorOfTheInsideDoors;
    private String colorOfTheFurniture;
    private int yearOfTheBuilding;
    private int floorTheApartmentIsSituated;

    public Apartment(int rooms, int balcony, int bathroom, int hall, int kitchen, int dimensionOfApartment, int yearOfTheBuilding, String colorOfTheFurniture, String colorOfTheInsideDoors, String colorOfTheOutsideDoor, String colorOfTheWalls) {
        this.balcony = balcony;
        this.rooms = rooms;
        this.dimensionOfApartment = dimensionOfApartment;
        this.hall = hall;
        this.kitchen = kitchen;
        this.bathroom = bathroom;
        this.yearOfTheBuilding = yearOfTheBuilding;
        this.colorOfTheInsideDoors = colorOfTheInsideDoors;
        this.colorOfTheOutsideDoor = colorOfTheOutsideDoor;
        this.colorOfTheWalls = colorOfTheWalls;
        this.colorOfTheFurniture = colorOfTheFurniture;

    }

    public void setPositionOfTheApartment (String positionOfTheApartment) {
        this.positionOfTheApartment = positionOfTheApartment;

    }

    public int getYearOfTheBuilding () {
        return yearOfTheBuilding;
    }

    public void setFloorTheApartmentIsSituated (int floorTheApartmentIsSituated){
        this.floorTheApartmentIsSituated = floorTheApartmentIsSituated;
    }

//    public Apartment (String colorOfTheFurniture, String colorOfTheInsideDoors, String colorOfTheOutsideDoor, String colorOfTheWalls) {
//        this.colorOfTheInsideDoors = colorOfTheInsideDoors;
//        this.colorOfTheOutsideDoor = colorOfTheOutsideDoor;
//        this.colorOfTheWalls = colorOfTheWalls;
//        this.colorOfTheFurniture = colorOfTheFurniture;

//    }

    public void printAllApartmentParameters() {
        System.out.println(String.format("%s rooms\n%s kitcken\n%s bathrooms\n%s halls\n%s balconies\nhas %s square meters\nthe year of the building is %s\nand is situated at %s floor\nand the colors of the walls are %s\nthe color of the inside doors are %s\nthe color of the outside door is %s\nthe color of the furniture is %s\nand the position of the apartment is %s",rooms,kitchen,bathroom,hall,balcony,dimensionOfApartment,yearOfTheBuilding,floorTheApartmentIsSituated,colorOfTheWalls,colorOfTheInsideDoors,colorOfTheOutsideDoor,colorOfTheFurniture,positionOfTheApartment));
                //"%s rooms \n %s kitcken \n %s bathrooms \n %s halls \n %s balconies \n has %s square meters \n the year of the building is %s \n and is situated at %s floor \n and the colors of the walls are %s \n the color of the inside doors are %s \n the color of the outside door is %s \n the color of the furniture is %s \n and the position of the apartment is %s",rooms,bathroom,hall,balcony,dimensionOfApartment,yearOfTheBuilding,floorTheApartmentIsSituated,colorOfTheWalls,colorOfTheInsideDoors,colorOfTheOutsideDoor,colorOfTheFurniture,positionOfTheApartment));
    }


}
