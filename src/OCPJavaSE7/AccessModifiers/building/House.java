package OCPJavaSE7.AccessModifiers.building;

import OCPJavaSE7.AccessModifiers.library.Book;

public class House {
    public static void main(String[] args) {


        Book book = new Book();
        String value = book.isbn;
        book.printBook();

    }
}
