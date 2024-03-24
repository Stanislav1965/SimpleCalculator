public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b);

        // При вычислении calc.devide.apply(a, b) ошибка деление на ноль
        // Обработал ошибку деления на ноль с применением try catch

        calc.println.accept(c);
    }
}