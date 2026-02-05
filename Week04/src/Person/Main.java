package Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Andrei", 33);
        person.displayDetails();

        Student student1 = new Student();
        student1.displayDetails();

        Student student2 = new Student("Catalin", 33, "AFA");
        student2.displayDetails();

        Teacher teacher1 =  new Teacher();
        teacher1.displayDetails();

        Teacher teacher2 = new Teacher("Ana", 65, "AFA", "Aviatie");
        teacher2.displayDetails();
        //super.displayDetails();
    }
}
