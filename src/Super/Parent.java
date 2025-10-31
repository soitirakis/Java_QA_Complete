package Super;

public class Parent {
    private String name;
    private int age;

    //Default constructor
    public Parent() {
        this.name = "Unknown";
        this.age = 0;
    }

    //Param constructor
    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void displayInfo(){
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
    }
}
