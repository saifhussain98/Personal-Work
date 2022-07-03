package ClassMembers;

public class Classmates {
    private String firstName;
    private String surname;

    public Classmates(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
     
    }
    

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}