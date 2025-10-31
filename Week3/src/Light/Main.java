package Light;

public class Main  {
    public static void main(String[] args) {
        // 1 = 0N
        // 0 = OFF
        Light light1 = new Light(1);
        Light light2 = new Light(0);

        //check the Lights
        light1.setLightOn(); // Light already on
        light1.setDim(5);
        light2.setBrighten(15);
        //light2.setBrighten(15);

        System.out.println(light1.getStatus());
        System.out.println(light2.getStatus());
    }
}
