package Entities;

import java.io.Serializable;

public class Employee implements Serializable {
    int id;
    String name;
    float salary;
    long phone;
    String email_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public Employee(int id, String name, float salary, long contact_no, String email_id)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.phone = contact_no;
        this.email_id = email_id;
    }

    public String toString()
    {
        return "\nEmployee Details :" + "\nID: " + this.id + "\nName: " + this.name + "\nSalary: " +
                this.salary + "\nContact No: " + this.phone + "\nEmail-id: " + this.email_id;
    }

}
