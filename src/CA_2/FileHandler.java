/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Mikel
 */
public class FileHandler {
    
    public static List<Employee> readFile(String fileName) throws IOException{
//      This list will store the employees read from the file
        List<Employee> employees = new ArrayList<>();
//        I use try for make sure the rader will close when read
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;
            while ((line = br.readLine()) != null){ // read each line from the file until the end
            String[] parts = line.split(","); //divide the lines in parts using the commam as delimitador
            String name = parts[0].trim(); // the first part will be the name of employee
            employees.add(new Employee(name));
            }
        }
        return employees;
    }
    
}
