import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.InvalidParameterException;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Double value1 = null;
        Double value2 = null;
        String operation = null;

        try {
            System.out.println("Enter first value: ");
            value1 = Double.parseDouble(reader.readLine());
            System.out.println("Enter second value: ");
            value2 = Double.parseDouble(reader.readLine());
            System.out.println("Enter operation (+, -, *, /): ");
            operation = reader.readLine();

        } catch (Exception e) {
            System.out.println("Invalid input!");
        }


        switch (operation) {
            case "+" -> {
                Addition addition = new Addition(value1, value2);
                System.out.println(calculator.calculate(addition));
            }
            case "-" -> {
                Subtraction subtraction = new Subtraction(value1, value2);
                System.out.println(calculator.calculate(subtraction));
            }
            case "*" -> {
                Multiplication multiplication = new Multiplication(value1, value2);
                System.out.println(calculator.calculate(multiplication));
            }
            case "/" -> {
                Division division = new Division(value1, value2);
                System.out.println(calculator.calculate(division));
            }
            default -> throw new InvalidParameterException("Invalid operation!");
        }
    }
}