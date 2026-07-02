public class App {
    public static void main(String[] args) {
        LoginController login = new LoginController();

if (login.login()) {
    EmployeeController emp = new EmployeeController();
    emp.menu();
}  
// TODO: imptove error handling for Login failure
    }
}  
