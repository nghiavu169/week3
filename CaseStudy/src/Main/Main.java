package Main;

import Method.Method1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Method1 method = new Method1();
        do {
            System.out.println("\n*********Welcome to the Employee Management System**********\n");
            System.out.println("1). Add Employee to the DataBase\n" +
                    "2). Search for Employee\n" +
                    "3). Edit Employee details\n" +
                    "4). Delete Employee Details\n" +
                    "5). Display all Employees working in this company\n" +
                    "6). EXIT\n");
            System.out.println("Enter your choice : ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> method.add();
                case 2 -> method.search();
                case 3 -> method.edit();
                case 4 -> method.delete();
                case 5 -> method.displayAll();
                default -> System.exit(0);
            }
        }while (true);
    }
}
