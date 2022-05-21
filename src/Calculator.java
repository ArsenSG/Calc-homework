import java.util.function.*;

public class Calculator {
    public Calculator() {
    }

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
//  BinaryOperator<Integer> devide = (x, y) -> x / y;
//  Код не работает из-за деления на ноль. В качестве решения можно в тернарном операторе поставить условие, что y != 0, в противном случае вернуть 0.
    BinaryOperator<Integer> devide = (x, y) -> y != 0 ? x / y : y;


    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}
