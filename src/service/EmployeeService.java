package service;

import model.Employee;
import java.util.ArrayList;

public class EmployeeService {

    private ArrayList<Employee> employees = new ArrayList<>();
    private int idCounter = 1;

    // CREATE
    public void addEmployee(String name, String division, String position) {
        Employee emp = new Employee(idCounter++, name, division, position);
        employees.add(emp);
        System.out.println("Employee berhasil ditambahkan");
    }

    // READ
    public void showEmployees() {
        if (employees.isEmpty()) {
            System.out.println("Data kosong");
            return;
        }

        for (Employee e : employees) {
            System.out.println(e.id + " | " + e.name + " | " + e.division + " | " + e.position);
        }
    }

    // UPDATE
    public void updateEmployee(int id, String name, String division, String position) {
        for (Employee e : employees) {
            if (e.id == id) {
                e.name = name;
                e.division = division;
                e.position = position;
                System.out.println("Employee berhasil diupdate");
                return;
            }
        }
        System.out.println("Employee tidak ditemukan");
    }

    // DELETE
    public void deleteEmployee(int id) {
        employees.removeIf(e -> e.id == id);
        System.out.println("Employee dihapus (jika ada)");
    }
}