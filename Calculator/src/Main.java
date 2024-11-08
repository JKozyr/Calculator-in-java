import java.util.Scanner;

class Calculator {
    Scanner scanner = new Scanner(System.in);
    void CalculateNumbers(){
        System.out.println("Enter the first number");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number");
        int number2 = scanner.nextInt();

        System.out.println("+ Add | - Subtract | * Multiplication | / Division | ^ Exponentiation");

        System.out.println("Enter operator");
        String operator = scanner.next();


        if(operator.equals("+")){
            System.out.println(number1 + number2);
        }
        else if(operator.equals("-")){
            System.out.println(number1 - number2);
        }
        else if(operator.equals("*")){
            System.out.println(number1 * number2);
        }
        else if(operator.equals("/")){
            System.out.println(number1 / number2);
        }
        else if(operator.equals("^")){
            System.out.println(Math.pow(number1, number2));
        }


    }
}
public class Main {
    public static void main(String[] args) {
        Calculator calculator1 = new Calculator();
        calculator1.CalculateNumbers();
        }
    }
