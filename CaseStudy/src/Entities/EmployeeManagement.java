package Entities;

import java.util.ArrayList;

public class EmployeeManagement {
    public static void display(ArrayList<Employee> al) {
        System.out.println("\n--------------Employee List---------------\n");
        System.out.printf("%-5s%-20s%-15s%-20s%-10s%n", "ID","Name","salary","contact-no","Email-Id");
        for(Employee e : al) {
            System.out.printf("%-5s%-20s%-15s%-20s%-10s%n",e.id,e.name,e.salary,e.phone,e.email_id);
        }
    }
}
