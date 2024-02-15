
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите арифметическое выражение");
                String input = scanner.nextLine();

                try {
                    String result = calc(input);
                    System.out.println("Результат: " + result);
                } catch (IllegalArgumentException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }
            }

            public static String calc(String input) {
                String[] tokens = input.split(" ");
                if (tokens.length != 3) {
                    throw new IllegalArgumentException("Неверный формат выражения. Используйте пробелы между числами и операторами.");
                }

                int a;
                int b;
                try {
                    a = parseNumber(tokens[0]);
                    b = parseNumber(tokens[2]);
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Неправильный формат числа. Введите числа от 1 до 10.");
                }

                int result;
                switch (tokens[1]) {
                    case "+":
                        result = a + b;
                        break;
                    case "-":
                        result = a - b;
                        break;
                    case "*":
                        result = a * b;
                        break;
                    case "/":
                        if (b == 0) {
                            throw new IllegalArgumentException("Деление на ноль недопустимо.");
                        }
                        result = a / b;
                        break;
                    default:
                        throw new IllegalArgumentException("Неподдерживаемая операция. Поддерживаются только +, -, *, /.");
                }

                return convertToRoman(result);
            }

            private static int parseNumber(String token) {
                try {
                    return Integer.parseInt(token);
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Неправильный формат числа. Введите числа от 1 до 10.");
                }
            }

            private static String convertToRoman(int number) {

                return Integer.toString(number);
            }
        }



