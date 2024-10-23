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

    private MenuOptions.ManagerType managerType;

    public Manager(String name, MenuOptions.ManagerType managerType) {
        super(name);
        this.managerType = managerType;
    }
    
    public MenuOptions.ManagerType getManagerType(){
        return managerType;
    }
    
    @Override
    public String toString(){
        return managerType.toString();
    }

}
