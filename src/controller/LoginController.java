package controller;

import java.util.Scanner;

public class LoginController {

    public boolean login() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Username: ");
        String username = sc.nextLine();

        System.out.print("Password: ");
        String password = sc.nextLine();

        if (username.equals("admin") && password.equals("123")) {
            System.out.println("Login berhasil");
            return true;
        } else {
            System.out.println("Login gagal");
            return false;
        }
    }
}