package inheritance;
 //@date Oct 28, 2016
 //@author Artsiom_Berazavik

public class Person {
    
    protected String firstName;
    protected String lastName;
    
    //Constructor
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    //Getter FirstName
    public String getFirstName() {
        return firstName;
    }
    
    //Setter FirstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    //Getter LastName
    public String getLastName() {
        return lastName;
    }
    
    //Setter LastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getInfo() {
        return "First name: " + this.firstName + "Last name: " + this.lastName;
    }
}
