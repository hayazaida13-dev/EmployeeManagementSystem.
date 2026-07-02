package service;

import model.Division;
import java.util.ArrayList;

public class DivisionService {

    private ArrayList<Division> divisions = new ArrayList<>();
    private int idCounter = 1;

    // CREATE
    public void addDivision(String name) {
        divisions.add(new Division(idCounter++, name));
        System.out.println("Division berhasil ditambahkan");
    }

    // READ
    public void showDivisions() {
        if (divisions.isEmpty()) {
            System.out.println("Data kosong");
            return;
        }

        for (Division d : divisions) {
            System.out.println(d.id + " | " + d.name);
        }
    }

    // UPDATE
    public void updateDivision(int id, String name) {
        for (Division d : divisions) {
            if (d.id == id) {
                d.name = name;
                System.out.println("Division berhasil diupdate");
                return;
            }
        }
        System.out.println("Division tidak ditemukan");
    }

    // DELETE
    public void deleteDivision(int id) {
        divisions.removeIf(d -> d.id == id);
        System.out.println("Division dihapus (jika ada)");
    }
}
