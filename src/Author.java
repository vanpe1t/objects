public class Author {
    private String name;
    private String lastName;

    public Author(String name, String lastName) {
        this.lastName = lastName;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}
