public class Book {
    private final String name;
    private final Author author;
    private int yearOfPublication;
    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", author=" + author +
                ", yearOfPublication=" + yearOfPublication +
                '}';
    }

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
