import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class PetCareScheduler {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<String, Pet> pets = new HashMap<>();

    public static void main(String[] args) {
        boolean isRunning = true;
        int choice;
        while (isRunning) {
            System.out.println("1. Register pet");
            System.out.println("2. Schedule appointments");
            System.out.println("3. Store data");
            System.out.println("4. Display records");
            System.out.println("5. Generate reports");
            System.out.println("6. Save and exit");
            System.out.print("Please choose an option: ");
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid choice (1 - 6)");
                continue;
            }
            switch (choice) {
                case 1 -> registerPet();
                case 2 -> scheduleAppointment();
                case 3 -> storeData();
                case 4 -> displayRecord();
                case 5 -> generateReport();
                case 6 -> saveToFile();
            }
        }
    }

    private static void registerPet() {
        // to do
    }

    private static void scheduleAppointment() {
        // to do
    }

    private static void storeData() {
        // to do
    }

    private static void displayRecord() {
        // to do
    }

    private static void generateReport() {
        // to do
    }

    private static void saveToFile() {
        // to do
    }
}
