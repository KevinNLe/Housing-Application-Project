import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Application newApplication = new Application("", "", "", "", 0);

        String csvfile = "user_information.csv";

        boolean isValid = true;
        while (isValid) {
            try {
                System.out.println("Please enter the your first name: ");
                String fname = scnr.nextLine();
                newApplication.setFirstName(fname);
                isValid = false;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        isValid = true;
        while (isValid) {
            try {
                System.out.println("Please enter the your last name:");
                String lname = scnr.nextLine();
                newApplication.setLastName(lname);
                isValid = false;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        isValid = true;
        while (isValid) {
            try {
                System.out.println("Please enter the your birthday (mm/dd/yyyy:)");
                String bday = scnr.nextLine();
                newApplication.setBirthday(bday);
                isValid = false;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        isValid = true;
        while (isValid) {
            try {
                System.out.println("Please enter the your password (must be between 6 and 15 characters long):");
                String psw = scnr.nextLine();
                newApplication.setPassword(psw);
                isValid = false;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        isValid = true;
        while (isValid) {
            try {
                System.out.println("Please enter the your zipcode:");
                int zip = scnr.nextInt();
                scnr.nextLine(); 
                newApplication.setZipcode(zip);
                isValid = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scnr.nextLine(); 
            }
        }

        writeUserInfoToCSV(newApplication, csvfile);

        System.out.println("User information saved:");
        System.out.println("First name: " + newApplication.getFirstName());
        System.out.println("Last name: " + newApplication.getLastName());
        System.out.println("Birthday: " + newApplication.getBirthday());
        System.out.println("Zipcode: " + newApplication.getZipcode());

        scnr.close();
    }

    public static void writeUserInfoToCSV(Application app, String csvFile) {
        try (FileWriter writer = new FileWriter(csvFile)) {
            writer.append("First Name,Last Name,Birthday,Zipcode\n");
            writer.append(String.format("%s,%s,%s,%d\n",
                                         app.getFirstName(),
                                         app.getLastName(),
                                         app.getBirthday(),
                                         app.getZipcode()));
            System.out.println("User information saved to " + csvFile);
        } catch (IOException e) {
            System.out.println("Error writing to CSV file: " + e.getMessage());
        }
    }
}