package controller;

import service.DivisionService;
import java.util.Scanner;

public class DivisionController {

    private DivisionService service = new DivisionService();
    private Scanner sc = new Scanner(System.in);

    public void menu() {

        while (true) {
            System.out.println("\n=== DIVISION MENU ===");
            System.out.println("1. Tambah Division");
            System.out.println("2. Lihat Division");
            System.out.println("3. Update Division");
            System.out.println("4. Hapus Division");
            System.out.println("0. Kembali");

            System.out.print("Pilih: ");
            int pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    add();
                    break;
                case 2:
                    service.showDivisions();
                    break;
                case 3:
                    update();
                    break;
                case 4:
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
        System.out.print("Nama Division: ");
        String name = sc.nextLine();

        service.addDivision(name);
    }

    private void update() {
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Nama baru: ");
        String name = sc.nextLine();

        service.updateDivision(id, name);
    }

    private void delete() {
        System.out.print("ID: ");
        int id = sc.nextInt();

        service.deleteDivision(id);
    }
}
