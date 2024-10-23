/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Mikel
 *
 * This class is for all enums for the menu
 */
public class Menu {

// This enum will its for show the options for the main menu
    public enum MainOptions {
        SORT(1),
        SEARCH(2),
        ADD_EMPLOYEE(3),
        GENERATE_EMPLOYEE(4),
        EXIT(5);

        private final int value;

        MainOptions(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static MainOptions fromValue(int value) {
            for (MainOptions option : MainOptions.values()) {
                if (option.getValue() == value) {
                    return option;
                }
            }
            throw new IllegalArgumentException("Invalid option. Please try to select a valid option");
        }

    }
    
    public static Department getDepartment(Scanner scanner, List<Department> departments){
        
        for(int i = 0; i < departments.size() - 1; i++){
            System.out.println(i + " -> " + departments.get(i).getName());
        }
        return departments.get(scanner.nextInt());
    }
    
    

    public static MainOptions getMainOptions(Scanner scanner) {
        while (true) {
            System.out.println("Options: ");
            System.out.println("SORT(1)");
            System.out.println("SEARCH(2)");
            System.out.println("ADD EMPLOYEE(3)");
            System.out.println("GENERATE EMPLOYEE(4)");
            System.out.println("EXIT(5)");
            
            int option = scanner.nextInt();

            try {
                return MainOptions.fromValue(option);

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } 
        }

    }
    
    
    
}

