package Person;

public class Student extends Person{
    private String school;

    public Student(){
        super();
        this.school = "Unkown school";
    }

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("School: " + this.school);
    }
}
