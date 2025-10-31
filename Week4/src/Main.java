import Super.Child;
import Super.Parent;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();

        parent.displayInfo();


        Child child = new Child();
        child.displayInfo();
    }


}