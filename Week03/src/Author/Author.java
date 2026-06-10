package Author;

public class Author {
    private String name;
    private String email;


    //constructors with default args null, null
    public Author() {

    }
    //constructor with args: name, email
    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    //Setter for name
    public void setName(String name) {
        this.name = name;
    }
    //Setter for email
    public void setEmail(String email){
        this.email = email;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getEmail()   {
        return email;
    }
}
