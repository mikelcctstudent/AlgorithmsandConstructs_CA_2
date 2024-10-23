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
    private final String id;
    private final String name;
    private final int costCenter;
    private final int numberOfEmployees;
    
    public Department(String id, String name, int costCenter, int numberOfEmployees){
        
        this.id = id;
        this.name = name;
        this.costCenter = costCenter;
        this.numberOfEmployees = numberOfEmployees;
    }
    
    public String getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public int getCostCenter(){
        return costCenter;
    }
    
    public int getNumberOfEmployees(){
        return numberOfEmployees;
    }
}