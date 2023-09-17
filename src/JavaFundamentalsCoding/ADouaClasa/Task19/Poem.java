package JavaFundamentalsCoding.ADouaClasa.Task19;

public class Poem {
    private Author author;
    private int stropheNumbers;

    public Poem (Author author, int stropheNumbers){
        this.author = author;
        this.stropheNumbers = stropheNumbers;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setStropheNumbers(int stropheNumbers) {
        this.stropheNumbers = stropheNumbers;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getStropheNumbers() {
        return this.stropheNumbers;
    }
}
