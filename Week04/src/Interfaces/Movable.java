package Interfaces;

public interface Movable {
    //Abstract method
    void move();

    //Default method
    default void rest(){
        System.out.println("Resting after movement");
    }

    //Static method
    static void showMovementInfo(){
        System.out.println("Move info");
    }
}
