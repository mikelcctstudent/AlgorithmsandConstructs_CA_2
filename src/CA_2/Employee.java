/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;

import java.time.LocalDate;

/**
 *
 * @author Mikel
 */
public class Employee{

    private String name;
    private LocalDate dob;
    private String address;
  

    public Employee(String name) {
        this.name = name;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

}
