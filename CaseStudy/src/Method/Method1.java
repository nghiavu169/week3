package Method;

import Entities.Employee;
import Entities.EmployeeManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Method1 {
    int id;
    String name;
    float salary;
    long phone;
    String email_id;
    Scanner sc = new Scanner(System.in);
    ArrayList<Employee> al = new ArrayList<>();
    public void add() {
        System.out.println("\nEnter the following details to ADD list:\n");
        System.out.println("Enter ID :");
        id = sc.nextInt();
        System.out.println("Enter Name :");
        name = sc.next();
        System.out.println("Enter Salary :");
        salary = sc.nextFloat();
        System.out.println("Enter Phone :");
        phone = sc.nextLong();
        System.out.println("Enter Email-ID :");
        email_id = sc.next();
        al.add(new Employee(id, name, salary, phone, email_id));
        EmployeeManagement.display(al);
    }

    public void search() {
        System.out.println("Enter the Employee ID to search :");
        id = sc.nextInt();
        int i = 0;
        for (Employee e : al) {
            if (id == e.getId()) {
                System.out.println(e + "\n");
                i++;
            }
        }
        if (i == 0) {
            System.out.println("\nEmployee Details are not available, Please enter a valid ID!!");
        }
    }

    public void edit() {
        System.out.println("\nEnter the Employee ID to EDIT the details");
        id = sc.nextInt();
        int j = 0;
        for (Employee e : al) {
            if (id == e.getId()) {
                j++;
                do {
                    String ch1;
                    System.out.println("\nEDIT Employee Details :\n" +
                            "1). Employee ID\n" +
                            "2). Name\n" +
                            "3). Salary\n" +
                            "4). Contact No.\n" +
                            "5). Email-ID\n" +
                            "6). GO BACK\n");
                    System.out.println("Enter your choice : ");
                    do{
                        try {
                            ch1 = sc.nextLine();
                            break;
                        }catch (Exception ec){
                            System.out.println("Wrong input");
                        }
                    }while (true);

                    switch (ch1) {
                        case "1" -> {
                            System.out.println("\nEnter new Employee ID:");
                            e.setId(sc.nextInt());
                            System.out.println(e + "\n");
                        }
                        case "2" -> {
                            System.out.println("Enter new Employee Name:");
                            name = sc.nextLine();
                            e.setName(name);
                            System.out.println(e + "\n");
                        }
                        case "3" -> {
                            System.out.println("Enter new Employee Salary:");
                            e.setSalary(sc.nextFloat());
                            System.out.println(e + "\n");
                        }
                        case "4" -> {
                            System.out.println("Enter new Employee Contact No. :");
                            e.setPhone(sc.nextLong());
                            System.out.println(e + "\n");
                        }
                        case "5" -> {
                            System.out.println("Enter new Employee Email-ID :");
                            e.setEmail_id(sc.next());
                            System.out.println(e + "\n");
                        }
                        case "6" -> j++;
                        default -> System.out.println("\nEnter a correct choice from the List :");
                    }
                }
                while (j == 1);
            }
        }
        if (j == 0) {
            System.out.println("\nEmployee Details are not available, Please enter a valid ID!!");
        }
    }

    public void delete() {
        System.out.println("\nEnter Employee ID to DELETE from the Database :");
        id = sc.nextInt();
        int k = 0;
        try {
            for (Employee e : al) {
                if (id == e.getId()) {
                    al.remove(e);
                    EmployeeManagement.display(al);
                    k++;
                }
            }
            if (k == 0) {
                System.out.println("\nEmployee Details are not available, Please enter a valid ID!!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void displayAll() {
        EmployeeManagement.display(al);
    }

}
