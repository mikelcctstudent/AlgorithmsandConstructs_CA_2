/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mikel
 */
public class FileHandler {

    public static List<Employee> readFile(String fileName) throws IOException {
//      This list will store the employees read from the file
        List<Employee> employees = new ArrayList<>();
//        I use try for make sure the rader will close when read
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) { // read each line from the file until the end
                String[] parts = line.split(","); //divide the lines in parts using the commam as delimitador
                String id = parts[0].trim();
                String name = parts[1].trim();
                String dobString = parts[2].trim();
                String address = parts[3].trim();
                String salaryString = parts[4].trim();
                String departmentId = parts[5].trim();
                String positionId = parts[6].trim();
                employees.add(new Employee(id, name, LocalDate.parse(dobString), address, new BigDecimal(salaryString), departmentId, positionId));
            }
        }
            return employees;
    }
}
