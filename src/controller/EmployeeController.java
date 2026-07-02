package controller;

import service.EmployeeService;
import java.util.Scanner;

public class EmployeeController {

    private EmployeeService service = new EmployeeService();
    private Scanner sc = new Scanner(System.in);

    public void menu() {

        while (true) {
            System.out.println("\n=== EMPLOYEE MENU ===");
            System.out.println("1. Tambah Employee");
            System.out.println("2. Lihat Employee");
            System.out.println("3. Hapus Employee");
            System.out.println("0. Kembali");

            System.out.print("Pilih: ");
            int pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    add();
                    break;
                case 2:
                    service.showEmployees();
                    break;
                case 3:
                    delete();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Pilihan salah");
            }
        }
    }

    private void add() {
        System.out.print("Nama: ");
        String name = sc.nextLine();

        System.out.print("Divisi: ");
        String division = sc.nextLine();

        System.out.print("Jabatan: ");
        String position = sc.nextLine();

        service.addEmployee(name, division, position);
    }

    private void delete() {
        System.out.print("ID yang mau dihapus: ");
        int id = sc.nextInt();

        service.deleteEmployee(id);
    }
}
