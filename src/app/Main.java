package app;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        MathOperation mathOperation = new MathOperation() {
            public int operate(int a, int b) {
                return a + b;

            }
        };

        StringManipulator stringManipulator = str -> str.toUpperCase();
        String result = stringManipulator.convertToUpperCase("cat");
        System.out.println(result);

        Function<String, Integer> result2 = StringListProcessor::countUppercase;
        Supplier<Integer> randomNum = () -> ThreadLocalRandom.current().nextInt(1,100);

    }
}