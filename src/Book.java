import java.util.Comparator;

public class Book  {
    private String book_name;
    private Integer book_pageNumber;
    private String book_author;
    private String book_publishDate;

    public Book(String book_name, Integer book_pageNumber, String book_author, String book_publishDate) {
        this.book_name = book_name;
        this.book_pageNumber = book_pageNumber;
        this.book_author = book_author;
        this.book_publishDate = book_publishDate;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public Integer book_pageNumber() {
        return book_pageNumber;
    }


    public Integer getBook_pageNumber() {
        return book_pageNumber;
    }

    public void setBook_pageNumber(Integer book_pageNumber) {
        this.book_pageNumber = book_pageNumber;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public String getBook_publishDate() {
        return book_publishDate;
    }

    public void setBook_publishDate(String book_publishDate) {
        this.book_publishDate = book_publishDate;
    }
}
