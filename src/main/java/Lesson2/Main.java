package Lesson2;

public class Main {
    public static void main(String[] args) {
        // Примеры использования
        int intSumResult = Calculator.sum(5, 3);
        double doubleDivideResult = Calculator.divide(10.0, 2.5);
        int intSubtractResult = Calculator.subtract(10, 5);
        double doubleMultiplyResult = Calculator.multiply(3.5, 2.0);

        System.out.println("Сумма: " + intSumResult);
        System.out.println("Результат деления: " + doubleDivideResult);
        System.out.println("Разность: " + intSubtractResult);
        System.out.println("Произведение: " + doubleMultiplyResult);

        Pair<Integer, String> pair1 = new Pair<>(42, "Hello");
        Pair<Double, Boolean> pair2 = new Pair<>(3.14, true);

        System.out.println("Pair 1: " + pair1.toString());
        System.out.println("First value of Pair 2: " + pair2.getFirst());
        System.out.println("Second value of Pair 2: " + pair2.getSecond());
    }

}

