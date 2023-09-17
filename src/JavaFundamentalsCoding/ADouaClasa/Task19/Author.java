package JavaFundamentalsCoding.ADouaClasa.Task19;

public class Author {
    private String surname;
    private String nationality;

    public Author () {

    }
    public Author(String surname, String nationality){
        this.nationality = nationality;
        this.surname = surname;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getNationality() {
        return this.nationality;
    }

    public void setSurname(String surname){
        this.surname=surname;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }


}
