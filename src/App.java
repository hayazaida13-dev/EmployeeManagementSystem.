LoginController login = new LoginController();

if (login.login()) {
    EmployeeController emp = new EmployeeController();
    emp.menu();
}    
