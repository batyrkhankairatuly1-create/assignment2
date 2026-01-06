package subjects;

public class Person implements Payable, Comparable<Person> {
    private static int idGen = 1;

    private int id;
    private String name;
    private String surname;

    //constructors

    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
        this.id = idGen++;
    }

    public Person() {
        this("NoName", "NoSurname"); // значения по умолчанию
    }

    //getters and setters

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    //methods

    public String getPosition(){
        return "Student";
    }

    @Override
    public String toString(){
        return id + ". " + name + " " + surname;
    }

    @Override
    public double getPaymentAmount(){
        return 0.0;
    }

    @Override
    public int compareTo(Person other){
        double diff = this.getPaymentAmount() - other.getPaymentAmount();
        if(diff > 0) return -1;
        if(diff < 0) return 1;
        return 0;
    }

}
