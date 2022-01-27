package calculator;

import calculator.domain.Calculator;
import calculator.domain.ExpressionParser;
import calculator.domain.Input;
import calculator.domain.Operators;
import calculator.domain.Terms;

public class Application {

    public static void main(String[] args) {
        while (true) {
            double result;

            String userInput = Input.getUserInput();

            ExpressionParser parser = new ExpressionParser(userInput);
            Operators operators = parser.getOperators();
            Terms terms = parser.getTerms();

            try {
                result = Calculator.evaluate(terms, operators);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                continue;
            }

            System.out.println(result);
        }
    }
}