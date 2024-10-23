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
    
    private MenuOptions.DepartmentType departmentType;
    
    public Department(MenuOptions.DepartmentType departmentType){
        this.departmentType = departmentType;
    }
    
    public MenuOptions.DepartmentType getDepartmentType(){
        return departmentType;
    }
    
    public String toString(){
        return departmentType.toString();
    }
    
}
