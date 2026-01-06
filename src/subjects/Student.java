package subjects;

public class Student extends Person {

    private double gpa;


    //constructors

    public Student(String yernaz){
        super();
    }

    public Student(String name, String surname, double gpa){
        super(name, surname);
        this.gpa = gpa;
    }

    //getters and setters


    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public double getPaymentAmount(){
        return gpa > 2.67 ? 36660.0 : 0.0; //ternary operator
    }

    @Override
    public String getPosition(){
        return "Student";
    }

    @Override
    public String toString(){
        return "Student: " + getId() + ". " + getName() + " " + getSurname();
    }
}
