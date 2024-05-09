package Lesson2;

public class Calculator {
    // Обобщенный метод для сложения
    public static <T extends Number> T sum(T num1, T num2) {
        if (num1 instanceof Integer) {
            return (T) Integer.valueOf(num1.intValue() + num2.intValue());
        } else if (num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() + num2.doubleValue());
        } else {
            throw new IllegalArgumentException("Unsupported data type");
        }
    }

    // Обобщенный метод для умножения
    public static <T extends Number> T multiply(T num1, T num2) {
        if (num1 instanceof Integer) {
            return (T) Integer.valueOf(num1.intValue() * num2.intValue());
        } else if (num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() * num2.doubleValue());
        } else {
            throw new IllegalArgumentException("Unsupported data type");
        }
    }

    // Обобщенный метод для деления
    public static <T extends Number> T divide(T num1, T num2) {
        if (num1 instanceof Integer) {
            return (T) Double.valueOf(num1.intValue() / num2.intValue());
        } else if (num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() / num2.doubleValue());
        } else {
            throw new IllegalArgumentException("Unsupported data type");
        }
    }

    // Обобщенный метод для вычитания
    public static <T extends Number> T subtract(T num1, T num2) {
        if (num1 instanceof Integer) {
            return (T) Integer.valueOf(num1.intValue() - num2.intValue());
        } else if (num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() - num2.doubleValue());
        } else {
            throw new IllegalArgumentException("Unsupported data type");
        }
    }
}
