
package Multithreading;
import java.util.Scanner;

class DrivingLicense {
    private boolean medicalHealthPassed;
    private boolean drivingTestPassed;
    private boolean officerSigned;

    // Constructor
    public DrivingLicense() {
        medicalHealthPassed = false;
        drivingTestPassed = false;
        officerSigned = false;
    }

    // Method to simulate passing medical health examination
    public void passMedicalHealth() {
        medicalHealthPassed = true;
        System.out.println("Medical health examination passed.");
    }

    // Method to simulate passing driving test
    public void passDrivingTest() {
        drivingTestPassed = true;
        System.out.println("Driving test passed.");
    }

    // Method to simulate officer signing the license
    public void officerSign() {
        officerSigned = true;
        System.out.println("Officer signed the license.");
    }

    // Method to check if all requirements for the license are met
    public boolean isLicenseIssued() {
        return medicalHealthPassed && drivingTestPassed && officerSigned;
    }
}

public class DrivingLicence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a new DrivingLyicense object
        DrivingLicense license = new DrivingLicense();

        // Simulate the process of obtaining a driving license
        System.out.println("Welcome to the driving license issuing system.");
        System.out.println("Please follow the steps:");

        System.out.println("1. Pass the medical health examination? (yes/no)");
        String medicalHealth = scanner.nextLine();
        if (medicalHealth.equalsIgnoreCase("yes")) {
            license.passMedicalHealth();
        }

        System.out.println("2. Pass the driving test? (yes/no)");
        String drivingTest = scanner.nextLine();
        if (drivingTest.equalsIgnoreCase("yes")) {
            license.passDrivingTest();
        }

        System.out.println("3. Officer sign the license? (yes/no)");
        String officerSign = scanner.nextLine();
        if (officerSign.equalsIgnoreCase("yes")) {
            license.officerSign();
        }

        // Check if the license can be issued
        if (license.isLicenseIssued()) {
            System.out.println("Congratulations! Your driving license is issued.");
        } else {
            System.out.println("Sorry, you have not met all the requirements for the driving license.");
        }

        scanner.close();
    }
}
