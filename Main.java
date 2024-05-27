import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    // constructor for the employee class
    public Employee(int emp_id, String emp_name, String emp_department, double emp_salary) {
        id = emp_id;
        name = emp_name;
        department = emp_department;
        salary = emp_salary;
    }

    // get id getter
    public int getId() {
        return id;
    }

    // set id setter
    public void setId(int new_id) {
        this.id = new_id;
    }

    // get name
    public String getName() {
        return name;
    }

    // set name
    public void setName(String new_name) {
        this.name = new_name;
    }

    // get department
    public String getDepartment() {
        return department;
    }

    // set department
    public void setDepartment(String new_department) {
        this.department = new_department;
    }

    // get Salary
    public double getSalary() {
        return salary;
    }

    // set salary
    public void setSalary(double new_salary) {
        this.salary = new_salary;
    }
}

class EmployeeManager {

    private ArrayList<Employee> employees = new ArrayList<Employee>();

    void addEmployee(Employee employee) {
        employees.add(employee);
    }

    void removeEmployee(int index) {
        // check if the user has entered invalid index
        if (index >= 0 && index < employees.size()) {
            employees.remove(index);
        } else {
            System.out.println("No employee to remove");
        }

    }

    ArrayList<Employee> getAllEmployee() {
        return employees;
    }

    Employee getEmployee(int index) {
        return getAllEmployee().get(index);
    }

    void displayAllEmployees() {
        // displaying the list of employee
        // check if there are employees
        System.out.println();
        if (getAllEmployee().isEmpty()) {
            System.out.println("There are " + getAllEmployee().size() + " employees");
            System.out.println("We have nothing to show");
            System.out.println();
        } else {
            System.out.println("There are " + getAllEmployee().size() + " employees");
            System.out.println("The following is the list of employees");
            System.out.println("No | ID | Name | Department | Salary ");
            for (int i = 0; i < getAllEmployee().size(); i++) {
                System.out.println((i + 1) + "   " + getEmployee(i).getId() + "    "
                        + getEmployee(i).getName()
                        + "      " + getEmployee(i).getDepartment() + "      "
                        + getEmployee(i).getSalary());

            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Indicate the user if the application has started
        System.out.println("Your application started");
        // gives explanation on the commands
        System.out.println("Welcome to the Employee registering application");
        System.out.println("Use the following commands:");
        System.out.println();
        System.out.println("1. display - display the list of employees");
        System.out.println("2. add - add employee");
        System.out.println("3. remove - removes employee");
        System.out.println("4. quit - exit the application");
        System.out.println();

        // create an array list for storing Employee object this is to store the
        // employee details
        // ArrayList<Employee> employees = new ArrayList<Employee>();
        // scanner object for user input
        Scanner userinput = new Scanner(System.in);

        // an empty string that holds command for the application
        String command = "";

        // calling the Employee manager class
        EmployeeManager employeemanager = new EmployeeManager();

        while ("quit".equals(command) == false) {
            // listen for user command
            System.out.print("Enter your command: ");
            command = userinput.nextLine();
            // logic of the application here

            if ("display".equals(command) == true) {
                // displaying the list of employee
                // check if there are employees
                // System.out.println();
                // if (employees.isEmpty()) {
                // System.out.println("There are " + employees.size() + " employees");
                // System.out.println("We have nothing to show");
                // System.out.println();
                // } else {
                // System.out.println("There are " + employees.size() + " employees");
                // System.out.println("The following is the list of employees");
                // System.out.println("No | ID | Name | Department | Salary ");
                // for (int i = 0; i < employees.size(); i++) {
                // System.out
                // .println(
                // (i + 1) + " " + employees.get(i).getId() + " " + employees.get(i).getName()
                // + " " + employees.get(i).getDepartment() + " "
                // + employees.get(i).getSalary());

                // }
                // System.out.println();
                // }
                employeemanager.displayAllEmployees();
            } else if ("add".equals(command) == true) {
                // adding employees to the array
                System.out.println("Adding a new employee");
                System.out.println();
                System.out.print("Employee ID (number only): ");
                int emp_id = userinput.nextInt();
                // clear buffer which might lead to unexpected behaviour
                userinput.nextLine();
                System.out.println();
                System.out.print("Employee Name: ");
                String emp_name = userinput.nextLine();
                // no need to clear buffer after nextLine
                System.out.println();
                System.out.print("Employee Salary: ");
                double emp_salary = userinput.nextDouble();
                userinput.nextLine(); // clear buffer
                System.out.println();
                System.out.print("Employee Department: ");
                String emp_department = userinput.nextLine();
                // no need to clear buffer
                Employee employee = new Employee(emp_id, emp_name, emp_department, emp_salary);
                employeemanager.addEmployee(employee);
                // employees.add(employee);
                System.out.println("Successfully added a new employee");

            } else if ("remove".equals(command) == true) {
                // command to remove employees
                System.out.println();
                System.out.println("Removing an employee!");
                // if (employees.isEmpty()) {
                // System.out.println("There are " + employees.size() + " employees");
                // System.out.println("Add employee before removing");
                // System.out.println();
                // } else {
                // System.out.println("There are " + employees.size() + " employees");
                // System.out.println("The following is the list of employees");
                // System.out.println("No | ID | Name | Department | Salary ");
                // for (int i = 0; i < employees.size(); i++) {
                // System.out
                // .println(
                // (i + 1) + " " + employees.get(i).getId() + " " + employees.get(i).getName()
                // + " " + employees.get(i).getDepartment() + " "
                // + employees.get(i).getSalary());
                // System.out.println();
                // }
                employeemanager.displayAllEmployees();
                System.out.println();
                System.out.print("Select Employee by no to remove (number only) ");
                int removeindex = userinput.nextInt();
                userinput.nextLine();
                // subtract 1 to ensure the indexing is followed
                removeindex -= 1;
                // employees.remove(removeindex);
                employeemanager.removeEmployee(removeindex);

                System.out.println("Successfully removed the employee number " + (removeindex + 1));
            } else if ("quit".equals(command) == true) {
                System.out.println();
                System.out.println("Exiting the application...");
            } else {
                System.out.println("Command '" + command + "' not found.");
            }
        }
        System.out.println("You have successfully exit the application");
        // closing the scanner object
        userinput.close();

    }
}
