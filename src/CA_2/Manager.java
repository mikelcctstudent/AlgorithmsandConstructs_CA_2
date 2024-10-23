/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;

/**
 *
 * @author Mikel
 */
public class Manager extends Employee{
    
    public enum Type {
        SOFTWARE_ENGINEER(1),
        EXECUTIVE_ASSISTANT(2),
        PROJECT_MANAGER(3),
        CTO(4),
        COO(5);

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

    private final Type managerType;

    public Manager(String name, Type managerType) {
        super(name);
        this.managerType = managerType;
    }
    
    public Type getManagerType(){
        return managerType;
    }
    
    @Override
    public String toString(){
        return managerType.toString();
    }

}
