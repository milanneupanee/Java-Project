package Simple;
public class Employee {
    private int id;
    private String name;
    private String post;
    private double salary;
    public Employee(int id, String name, String post, double salary) {
        this.id = id;
        this.name = name;
        this.post = post;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return id+" "+name+" "+post+" "+salary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee(1, "milan", "manager", 4567);
        System.out.println(employee);

    }
}
