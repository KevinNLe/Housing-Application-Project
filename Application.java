public class Application {
    private String firstName;
    private String lastName;
    private String password;
    private String birthday; 
    private int zipcode; 

    public Application(String firstName, String lastName, String password, String birthday, int zipcode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password; 
        this.birthday = birthday;
        this.zipcode = zipcode;
    }

    public void setFirstName(String firstName) {
        if (firstName.isEmpty()) {
            throw new IllegalArgumentException("First name cannot be empty");
        } 
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        if (lastName.isEmpty()) {
            throw new IllegalArgumentException("Last name cannot be empty");
        } 
        this.lastName = lastName;
    }
    
    public String getLastname() {
        return lastName;
    }

    public void setPassword(String password) {
        if (password.length() <= 6 || password.length() >= 15 || !password.matches(".*[A-Z].*") || !password.matches(".*[a-z].*")) {
            throw new IllegalArgumentException("Password must be between 6 and 15 characters long and contain both uppercase and lowercase letters");
        } else {
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday; 
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode; 
    }

}