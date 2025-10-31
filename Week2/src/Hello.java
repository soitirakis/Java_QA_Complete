
public class Hello {
    public static void main(String[] args)
    {
        String name = "Andrei";
        int x = 5;
        int y = 7;
        System.out.println("Hello world!");
        System.out.println(name);
        System.out.println(x+y);

        int sum = 0;
        int z = 100;
        for (int i = 1; i <= z; i++)
        {
            sum += i;
        }

        System.out.println("Sum: " + sum);
    }
}

