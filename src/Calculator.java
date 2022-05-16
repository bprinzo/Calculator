import java.security.InvalidParameterException;

public class Calculator {
    public double calculate(Operation operation) {
        if (operation == null) {
            throw new InvalidParameterException("Operation not implemented");
        }

        operation.execute();

        return operation.getResult();
    }
}
