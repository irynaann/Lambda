package app;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;
import java.util.function.Supplier;

import static app.RandomNumberGenerator.generateRandomNumber;

public class Main {
    public static void main(String[] args) {

        MathOperation mathOperation = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };

        int sum = mathOperation.operate(1, 3);
        System.out.println("1) " + sum);

        StringManipulator stringManipulator = str -> str.toUpperCase();
        String result = stringManipulator.convertToUpperCase("cat");
        System.out.println("2) " + result);

        Function<String, Integer> result2 = StringListProcessor::countUppercase;
        int upperCaseSum = result2.apply("BaBy");
        System.out.println("3) " + upperCaseSum);

        Supplier<Integer> randomNum = () -> generateRandomNumber(1,100);
        int randomNumber = randomNum.get();
        System.out.println("4) " + randomNumber);
    }
}