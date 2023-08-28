package JAVAFundamentals.OOP.Books;

public class Book {
    String title; //este modificatorul default
    public String author;
    private int numberOfPages;

    public void setNumberOfPages(int numberOfPages) {
        if (isNumberOfPagesValid(numberOfPages)) {
            this.numberOfPages = numberOfPages;
        } else {
            System.out.println("The number of pages is incorrect");
        }

    }
// prima varianta, inainte de ultima metoda
//    public void setNumberOfPages(int numberOfPages) {
//        if (numberOfPages > 0) {
//            this.numberOfPages = numberOfPages;
//        } else {
//            System.out.println("The number of pages is incorrect");
//        }
//
//    }

    public int getNumberOfPages(){
        return numberOfPages;
    }


    private boolean isNumberOfPagesValid(int noOfPages){
        return noOfPages > 0;
    }

}