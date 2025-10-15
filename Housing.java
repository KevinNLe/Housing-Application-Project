public class housing extends application {
    public housing(String firstName, String lastName, String password, String birthday, int zipcode) {
        super(firstName, lastName, password, birthday, zipcode);
    }

    @Override
    public void setPassword(String password) {
        if (password.length() <= 6 || password.length() >= 15 || !password.matches(".*[A-Z].*") || !password.matches(".*[a-z].*")) {
            throw new IllegalArgumentException("Password must be between 6 and 15 characters long and contain both uppercase and lowercase letters");
        } else {
            super.setPassword(password);
        }
    }
}
