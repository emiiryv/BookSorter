import java.util.Comparator;
import java.util.TreeSet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        TreeSet<Book> books = new TreeSet<>(new BookNameComparator());

        books.add(new Book("Matematik Kitabi",123,"Ahmet","23.11.2005"));
        books.add(new Book("Ingilizce Kitabi",435,"Murat","01.03.2019"));
        books.add(new Book("Masal Kitabi",23,"Esma","12.12.2018"));
        books.add(new Book("Roman Kitabi",764,"Melis","03.06.2011"));
        books.add(new Book("Bilim Kitabi",345,"Özgür","07.05.2014"));

        System.out.println("Kitap isimlerinin alfabetik olarak sırası şu şekildedir: ");
        System.out.println();
        for (Book bks : books){
            System.out.println(bks.getBook_name() + " - " +bks.getBook_author()+ " - " + bks.getBook_pageNumber() + " Sayfa");
        }

        System.out.println();
        System.out.println("#######################################################");
        System.out.println();

        TreeSet<Book> books2 = new TreeSet<>(new BookPageNumberComparator());

        books2.add(new Book("Matematik Kitabi",123,"Ahmet","23.11.2005"));
        books2.add(new Book("Ingilizce Kitabi",435,"Murat","01.03.2019"));
        books2.add(new Book("Masal Kitabi",23,"Esma","12.12.2018"));
        books2.add(new Book("Roman Kitabi",764,"Melis","03.06.2011"));
        books2.add(new Book("Bilim Kitabi",345,"Özgür","07.05.2014"));

        System.out.println("Kitapların sayfa sırasına göre sırası şu şekildedir: ");
        System.out.println();
        for (Book bks : books2){
            System.out.println(bks.getBook_name() + " - " +bks.getBook_author()+ " - " + bks.getBook_pageNumber() + " Sayfa");
        }

    }
}