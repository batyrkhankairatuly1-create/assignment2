import subjects.Person;
import subjects.Student;
import subjects.Employee;
import subjects.Payable;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String args[]){
        ArrayList<Person> people = new ArrayList<>();
        Student s1 = new Student("Yernaz", "Yermekov", 3.5);
        Student s2 = new Student("Batyr", "Kanapiya", 2.0);

        Employee e1 = new Employee("Alibek", "Alibekov", "Streamer", 33333.33);
        Employee e2 = new Employee("Maga", "Magamedov", "Cybersportsman", 50000.00);

        people.add(s1);
        people.add(s2);
        people.add(e1);
        people.add(e2);

        Collections.sort(people);

        printData(people);
    }

    public static void printData(Iterable<Person> people){
        for (Person p : people){
            System.out.println(
                    p.toString() + " earns " + p.getPaymentAmount() + " tenge"
            );
        }
    }
}
