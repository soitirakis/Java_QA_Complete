package Person;

public class Teacher extends Person{
    private String school;
    private String catedra;

    public Teacher(){
        super();
        this.school = "Unknown school";
        this.catedra = "Unknown catedra";
    }

    public Teacher(String name, int age, String school, String catedra) {
        super(name, age);
        this.school = school;
        this.catedra = catedra;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("School: " + this.school);
        System.out.println("Catedra: " + this.catedra);
    }
}
