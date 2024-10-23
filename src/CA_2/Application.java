/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Mikel
 */
public class Application {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Employee> employees = new ArrayList<>();
            boolean fileLoaded = false;

            while (!fileLoaded) {
                System.out.println("Please enter the filename to read:");
                String fileName = scanner.nextLine().trim().toLowerCase();

                try {
                    employees = FileHandler.readFile(fileName);
                    System.out.println("File read successfully");
                    fileLoaded = true;
                } catch (IOException e) {
                    System.out.println("Error reading file: " + e.getMessage());
                    System.out.println("Please try again");
                }
            }

            boolean exit = false;

            while (!exit) {
//        main menu using enum
                Menu.MainOptions mainOption = Menu.getMainOptions(scanner);

                switch (mainOption) {
                    case SORT:
                        System.out.println("SORT Selected: ");
                        break;
                    case SEARCH:
                        System.out.println("SEARCH selected");
                        break;
                    case ADD_EMPLOYEE:
                        System.out.println("SEARCH selected");
                        break;
                    case GENERATE_EMPLOYEE:
                        System.out.println("SEARCH selected");
                        break;
                    case EXIT:
                        System.out.println("SEARCH selected");
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid option. Please try again");
                }
                scanner.close();
            }
        }
    }
}
