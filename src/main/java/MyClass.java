public class MyClass {
    private String firstName;
    private String lastName;

    public MyClass() {
        System.out.println("This line is the only instruction in the constructor");
    }

    public MyClass(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
