package Car;

public class Car {
    private int accelerate;
    private int start;
    private int stop;
    private boolean turnLeft;
    private boolean turnRight;
    private final int MAX_ACCELERATE = 100;
    private boolean status;

    public Car(){

    }

    public Car(int start, int accelerate){
        this.accelerate = accelerate;
        this.start = start;
        this.stop = 0;
        this.turnLeft = false;
        this.turnRight = false;
        this.status = false;
    }

    //check initial status
    public void initialStatus(){
        if (this.start == 1) {
            this.status = true;
            System.out.println("Car is on");
        } else {
            this.status = false;
            System.out.println("Car is off");
        }
    }

    //start the car
    public void setStart(){
        if (this.status == false){
            this.start = 1;
            this.status = true;
            System.out.println("Car engine start");
        }
    }

    //stop the car
    public void setStop(){
        if (this.status){
            this.stop = 0;
            this.status = false;
            System.out.println("Car engine stop");
        }

    }

    public boolean getStatus(){
        return this.status;
    }

    //accelerate the car; max speed 100;
    public void setAccelerate(int accelerate){
        if (this.start == 1) {
            this.accelerate += accelerate;
        }
        if (this.accelerate <= MAX_ACCELERATE){
            System.out.println("Car accelerated: " + this.accelerate);
        }else {
            this.accelerate = 0;
            this.status = false;
            this.stop = 0;
            this.start = 0;
            System.out.println("Car over speed max 100. Engine blew up");
        }
    }


    //turn left
    public void isTurnLeft(){
        if (this.status == false) {
            System.out.println("Car is off. You need to turn it on");
        } else {
            this.turnLeft = true;
            System.out.println("Car turn left");
        }

    }

    //turn right
    public void isTurnRight(){
        if (this.status == false) {
            System.out.println("Car is off. You need to turn it on");
        }else{
            this.turnRight = true;
            System.out.println("Car turn right");
        }

    }
}
