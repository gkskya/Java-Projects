

public class Employee extends Person {
    private String department;
    private double salary;

    public Employee(String name, String lastName, String id, String address, String department, double salary) {
        super(name, lastName, id, address);
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nDepartment: " + department +
                "\nSalary: " + salary;
    }
}
