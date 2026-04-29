import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {

    static ArrayList<String> tasks = new ArrayList<>();
    static Scanner scnr = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n---Task Manager---");
            System.out.println("1. Show Tasks");
            System.out.println("2. Add Tasks");
            System.out.println("3. Delete Tasks");
            System.out.println("4. Quit");

            System.out.println("Choose option: ");
            String choice = scnr.nextLine();

            switch (choice){
                case "1":
                    showTasks();
                    break;
                case "2":
                    addTask();
                    break;
                case "3":
                    deleteTask();
                    break;
                case "4":
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Error, invalide choice.");
            }
        }
        
    }
}