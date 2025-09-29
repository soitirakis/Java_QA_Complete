
//Tema 1 - QA Complete - Andrei Anghel

void main() {

    //TODO 1.
    String termen1 = "Ana";
    String termen2 = "are";
    String termen3 = "mere";
    String space = " ";

    String finalText = termen1 + space + termen2 + space + termen3;
    System.out.println("Text: " + finalText);

    //TODO 3
    //constant WEEK_DAYS
    final int WEEK_DAYS = 7;

    long number1 = 1234455678910L;
    long number2 = 258369741010L;

    //sum of two numbers
    long sum = number1 + number2;
    //substraction of two numbers
    long subst = number1 - number2;
    //multiplication of two numbers
    long multiply = number1 * number2;
    //division of two numbers
    long divide = number1 / number2;

    //print the results in the console
    System.out.println("Number 1: " + number1 + "\n" + "Number 2: " + number2);
    System.out.println("Sum: " + sum);
    System.out.println("Subst: " + subst);
    System.out.println("Multiply: " + multiply);
    System.out.println("Divide: " + divide);
}