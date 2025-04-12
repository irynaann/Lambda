package app;

import java.util.function.Function;

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

    }
}