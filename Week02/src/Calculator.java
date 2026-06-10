public class Calculator {

    public static void main(String[] args) {
        //check if args are 3
        if (args.length != 3) {
            System.out.println("Error: wrong number of arguments");
            return;
        }

        //extract the args
        float a = Float.parseFloat(args[0]);
        float b = Float.parseFloat(args[2]);
        String operator = args[1];


        float result = 0;
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0){
                    System.out.println("Division by zero");
                    return;
                }
                result = a / b;
                break;
            default:
                System.out.println("Error: unknown operator");
                return;
        }
        System.out.println("Result " + a + operator + b + "=" + result);
    }
}
