package Interfaces;

public class Bird implements Soundable, Movable{
    private String name;

    public Bird(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    //Implementing Soundable interface
    @Override
    public void makeSound(){
        System.out.println("Make sound");
    }

    @Override
    public void sleep(){
        System.out.println("Sleep");
    }

    //Implementing Movable interface
    @Override
    public void move(){
        System.out.println("Move");
    }

    //Using default rest() method from Movable
}
