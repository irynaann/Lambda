package app;

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
    }
}