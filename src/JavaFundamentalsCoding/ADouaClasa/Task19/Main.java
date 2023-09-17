package JavaFundamentalsCoding.ADouaClasa.Task19;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Eminescu", "Romana");
        Poem poem1 = new Poem(author1, 5);

        Author author2 = new Author("Blaga", "Romana");
        Poem poem2 = new Poem(author2, 7);

        Author author3 = new Author("Bacovia", "Romana");
        Poem poem3 = new Poem(author3, 14);

        Poem[] poems = {poem1, poem2, poem3};
        Author longestPoemAuthor = new Author(); //Folosim o semnatura de constructor definita de autor de JAVA
        int longestStropheNumbers = 0;
        for (Poem singlepoem : poems) {
            if (singlepoem.getStropheNumbers() > longestStropheNumbers) {
                longestPoemAuthor = singlepoem.getAuthor();
                longestStropheNumbers = singlepoem.getStropheNumbers();
            }


            //  System.out.println(singlepoem.getStropheNumbers() + " " + singlepoem.getAuthor().getSurname());

        }
        if (longestStropheNumbers > 0) {
            System.out.println("Surname of an author, that wrote the longest poem: " + longestPoemAuthor.getSurname());

        }

    }


}
