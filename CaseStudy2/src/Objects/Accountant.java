package Objects;

public class Accountant extends Person {
    int id, OT_days, salary;

    public Accountant(int id, int OT_days, int salary) {
        this.id = id;
        this.OT_days = OT_days;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOT_days() {
        return OT_days;
    }

    public void setOT_days(int OT_days) {
        this.OT_days = OT_days;
    }

    @Override
    public int getSalary() {
        if (OT_days > 0 && OT_days < 10) return salary;
        else return salary + OT_days * 500;
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
