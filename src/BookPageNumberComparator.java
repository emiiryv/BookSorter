import java.util.Comparator;

public class BookPageNumberComparator implements Comparator <Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.book_pageNumber().compareTo(o2.book_pageNumber());
    }
}
