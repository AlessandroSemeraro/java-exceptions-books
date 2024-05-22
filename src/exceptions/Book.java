package exceptions;

public class Book {

    // ATTRIBUTI
    protected String title;
    protected int pages;
    protected String author;
    protected String publisher;

    // COSTRUTTORE
    public Book(String title, int pages, String author, String publisher) {
        setTitle(title) ;
        setPages(pages);
        setAuthor(author);
        setPublisher(publisher);
    }

    //GETTERS E SETTERS
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.isEmpty()) {
            throw new RuntimeException("Inserisci il titolo!");
        }
        this.title = title;
    }


    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages <= 0) {
            throw new RuntimeException("Il numero di pagine minimo deve essere superiore allo zero!");
        }
        this.pages = pages;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author == null || author.isEmpty()) {
            throw new RuntimeException("Inserisci l'autore!");
        }
        this.author = author;
    }


    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        if (publisher == null || publisher.isEmpty()) {
            throw new RuntimeException("Inserisci la casa editrice");
        }
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Titolo: " + title + "\n: " + pages + "\nAuthor: " + author + "\nEditor: " + publisher + "\n";
    }
}
