package Light;

public class Light {
    private float status;
    private boolean turnOn;
    private boolean turnOff;
    private float dim;
    private float brighten;

    public Light (float status) {
        this.status = status;
    }

    public void setLightOn(){
        if  (status == 0){
            this.turnOn = true;
            this.status = 1;
            System.out.println("Light on");
        } else {
            System.out.println("Light already on");
        }

    }
    public void setLightOff(){
        if (status == 1) {
            this.turnOff = false;
            this.status = 0;
            System.out.println("Light off");
        } else {
            System.out.println("Light already off");
        }
    }
    public void setDim(float dim){
        if  (status != 0){
            this.dim = dim / 10;
            this.status -= this.dim;
        }
        if (status < 0) {
            this.status = 0;
            System.out.println("Dim too low. Complete dark!");
        } else {
            System.out.println("Light decreased: " + this.dim);
        }

    }
    public void setBrighten(float brighten){
        if (status != 1){
            this.brighten = brighten / 10;
            this.status += this.brighten;
            System.out.println("Light increased: " + this.brighten);
        }
        if (status > 1) {
            this.status = 0;
            System.out.println("Brightness too high. Light exploaded");
        } else {
            System.out.println("Light increased: " + this.brighten);
        }
    }

    public float  getStatus(){
        return this.status;
    }
}
