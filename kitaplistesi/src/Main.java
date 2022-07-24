import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Book book1=new Book("Aforizmalar", 215, "Schopenhauer", "1790");
        Book book2=new Book("Labirent", 375, "Arthur Rush", "2009");
        Book book3=new Book("Yilki Ati",95,"Peyami Safa","1977");
        Book book4=new Book("Hobbit", 375, "J.R.R. Tolkien", "2008");
        Book book5=new Book("Yildiz Gemisi",125,"Brian Aldiss","1954");
        Book book6=new Book("Yabanci",90,"Albert Camus","2004");
        Book book7=new Book("Duvar", 354, "Ahmet Sik", "2022");
        Book book8=new Book("Siyah Inci",150,"Anna Sewell","2014");
        Book book9=new Book("Ejderhalarin Dansi",700,"George R. R. Martin","2013");
        Book book10=new Book("Aclik Oyunlari 1", 374, "Suzanne Collins", "2011");

        ArrayList<Book> books=new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        books.add(book8);
        books.add(book9);
        books.add(book10);

        Map<String,String> booksAndAuthors=new HashMap<>();
        books.stream().forEach(p-> booksAndAuthors.put(p.getName(), p.getAuthor()));

        for (String b:booksAndAuthors.keySet()){
            System.out.println("Kitap : "+ b+", Yazar : "+booksAndAuthors.get(b));
        }


        List<Book> newList=books.stream().filter(p->p.getPage()>100).toList();
        System.out.println("\nSayfa Sayisi 100'den fazla olan kitaplar :");
        for(Book b:newList){
            System.out.println("Kitap Adi : "+b.getName()+" | " +
                    "Sayfa Sayisi : "+b.getPage()+" | "+
                    "Yazar : "+b.getAuthor()+" | "+
                    "Yayin Tarihi : "+b.getReleaseDate());
        }

    }
}