/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;

/**
 *
 * @author Mikel
 */
public class Department {
    
      public enum Type {
        PRODUCT_INNOVATION(1),
        CLOUD_SOLUTIONS(2),
        IT_SUPPORT(3),
        OPERATING_SYSTEMS(4),
        AI(5);

        private final int value;

        Type(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static Type fromValue(int value) {
            for (Type option : Type.values()) {
                if (option.getValue() == value) {
                    return option;
                }
            }

            throw new IllegalArgumentException("Invalid option. Please try to select a valid option");
        }

    }
    
    private final Type departmentType;
    
//   Constructor
    public Department(Type departmentType){
        this.departmentType = departmentType;
    }
    
//  Getter for departmentType
    public Type getDepartmentType(){
        return departmentType;
    }
    
      @Override
    public String toString(){
        return departmentType.toString();
    }
    
}
