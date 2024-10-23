/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;

/**
 *
 * @author Microsoft
 */
public class Employee {
    private String name;
    private MenuOptions.ManagerType managerType;
    private MenuOptions.DepartmentType departmentType;
    
    
    public Employee(String name, MenuOptions.ManagerType managerType, MenuOptions.DepartmentType departmentType){
        
        this.name = name;
        this.managerType = managerType;
        this.departmentType = departmentType;
    }
    
    public String getName(){
        return name;
    }
    
    public MenuOptions.ManagerType getManagerType(){
        return managerType;
    }
    
    public MenuOptions.DepartmentType getDepartmentType(){
        return departmentType;
    }
    
    public String toString(){
        return name + ", " + managerType + ", " + departmentType;
    }
    
}
