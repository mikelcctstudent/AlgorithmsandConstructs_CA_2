/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author Mikel
 */
public class Employee {

    private final String id;
    private final String name;
    private final LocalDate dob;
    private final String address;
    private final BigDecimal salary;
    private final String departmentId;
    private final String positionId;

    public Employee(String id, String name, LocalDate dob, String address, BigDecimal salary, String departmentId, String positionId) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.salary = salary;
        this.departmentId = departmentId;
        this.positionId = positionId;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String getAddress() {
        return address;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public String getDepartmentId() {
        return positionId;
    }

    public String getPositionId() {
        return positionId;
    }

}
