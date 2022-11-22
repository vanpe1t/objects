public class Book {
    String name;
    Author author;
    int yearOfPublication;

    public Book(String name, Author author){
        this.name = name;
        this.author = author;
        this.yearOfPublication = 0;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}
