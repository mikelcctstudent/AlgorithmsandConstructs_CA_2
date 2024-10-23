/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;

import java.util.Scanner;

/**
 *
 * @author Mikel
 *
 * This class is for all enums for the menu
 */
public class MenuOptions {

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

    public enum ManagerType {
        CTO(1),
        CIO(2),
        TEAM_LEAD(3);

        private final int value;

        ManagerType(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static ManagerType fromValue(int value) {
            for (ManagerType option : ManagerType.values()) {
                if (option.getValue() == value) {
                    return option;
                }
            }
            throw new IllegalArgumentException("Invalid option. Please try to select a valid option");
        }
    }

    public enum DepartmentType {
        SOFTWARE_DEVELPMENT(1),
        DATA_SCIENCE(2),
        IT_SUPPORT(3);

        private final int value;

        DepartmentType(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static DepartmentType fromValue(int value) {
            for (DepartmentType option : DepartmentType.values()) {
                if (option.getValue() == value) {
                    return option;
                }
            }

            throw new IllegalArgumentException("Invalid option. Please try to select a valid option");
        }

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

