package practiceAdvanced.practice06.library;

public class Library {

    String bookName;
    String authorName;
    int pageOfBook;
    String productId;
    static int numberOfBook;

    public Library(String bookName, String authorName, int pageOfBook) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.pageOfBook = pageOfBook;
        numberOfBook++;
        this.productId = authorName.substring(0, 2) + numberOfBook + bookName.substring(0, 1) + pageOfBook;
    }

    public void informationOfTheBook(){

        System.out.println("Book Name: " + bookName + "\nAuthor Name: " + authorName + "\nThe page of the book: " + pageOfBook + "\nProductId: " + productId);
        System.out.println("==================================================");

    }



}
