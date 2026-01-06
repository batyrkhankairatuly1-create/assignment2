package subjects;

public class Employee extends Person{

    private String position;
    private double salary;

    public Employee(){
        super();
        this.position = "Unknown";
        this.salary = 0.0;
    }

    public Employee(String name, String surname, String position, double salary){
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }

    //getters and setters

    public void setPosition(String position){
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public double getPaymentAmount(){
        return salary;
    }

    @Override
    public String toString(){
        return "Employee: " + getId() + ". " + getName() + " " + getSurname();
    }
}
