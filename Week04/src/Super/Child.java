package Super;

public class Child extends Parent {
    private String school;

    public Child() {
        super();
        this.school = "Unknown school";
    }

    public Child(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        
    }
}
