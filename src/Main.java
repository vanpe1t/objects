public class Main {
    public static void main(String[] args) {

        Author arthurConanDoyle = new Author("Arthur", "Conan Doyle");
        Author rudyardKipling = new Author("Rudyard", "Kipling");

        Book theSignOfTheFour = new Book("The Sign of the Four", arthurConanDoyle);
        theSignOfTheFour.setYearOfPublication(1900);

        Book jungleBook = new Book("Jungle Book", rudyardKipling);
        jungleBook.setYearOfPublication(1894);

    }
}