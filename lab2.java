// Zadanie 1
// V1
import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        
        if (input != null && !input.isEmpty()) {
            System.out.println("Вы ввели строку: " + input);
        } else {
            System.out.println("Ошибка: введена пустая строка.");
        }
    }
}

// V2
import java.util.Scanner;

public class InputInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println("Вы ввели число: " + number);
        } else {
            System.out.println("Ошибка: введены некорректные данные.");
        }
    }
}

// V3
import java.util.Scanner;

public class InputBoolean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите true или false: ");
        
        if (scanner.hasNextBoolean()) {
            boolean value = scanner.nextBoolean();
            System.out.println("Вы ввели значение: " + value);
        } else {
            System.out.println("Ошибка: введены некорректные данные.");
        }
    }
}

// V4
import java.util.Scanner;

public class InputDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дробное число (double): ");
        
        if (scanner.hasNextDouble()) {
            double number = scanner.nextDouble();
            System.out.println("Вы ввели число: " + number);
        } else {
            System.out.println("Ошибка: введены некорректные данные.");
        }
    }
}

// V5
import java.util.Scanner;

public class InputFloat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дробное число (float): ");
        
        if (scanner.hasNextFloat()) {
            float number = scanner.nextFloat();
            System.out.println("Вы ввели число: " + number);
        } else {
            System.out.println("Ошибка: введены некорректные данные.");
        }
    }
}

// V6
import java.util.Scanner;

public class InputChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите символ: ");
        String input = scanner.nextLine();
        
        if (input.length() == 1) {
            char symbol = input.charAt(0);
            System.out.println("Вы ввели символ: " + symbol);
        } else {
            System.out.println("Ошибка: введено больше одного символа.");
        }
    }
}

// Zadanie 2
// V1
import java.util.Scanner;

public class StudentVariant5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер студента: ");
        int studentNumber = scanner.nextInt();
        int variant = (studentNumber % 5 == 0) ? 5 : studentNumber % 5;
        System.out.println("Ваш вариант: " + variant);
    }
}

// V2
import java.util.Scanner;

public class StudentVariant7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер студента: ");
        int studentNumber = scanner.nextInt();
        int variant = (studentNumber % 7 == 0) ? 7 : studentNumber % 7;
        System.out.println("Ваш вариант: " + variant);
    }
}

// V3
import java.util.Scanner;

public class StudentVariant8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер студента: ");
        int studentNumber = scanner.nextInt();
        int variant = (studentNumber % 8 == 0) ? 8 : studentNumber % 8;
        System.out.println("Ваш вариант: " + variant);
    }
}

// V4
import java.util.Scanner;

public class StudentVariant5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер студента: ");
        int studentNumber = scanner.nextInt();
        int variant = (studentNumber % 5 == 0) ? 5 : studentNumber % 5;
        System.out.println("Ваш вариант: " + variant);
    }
}

//V5
import java.util.Scanner;

public class StudentVariant11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер студента: ");
        int studentNumber = scanner.nextInt();
        int variant = (studentNumber % 11 == 0) ? 11 : studentNumber % 11;
        System.out.println("Ваш вариант: " + variant);
    }
}

//V6
import java.util.Scanner;

public class StudentVariant15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер студента: ");
        int studentNumber = scanner.nextInt();
        int variant = (studentNumber % 15 == 0) ? 15 : studentNumber % 15;
        System.out.println("Ваш вариант: " + variant);
    }
}

// Zadanie 3
import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Число четное.");
        } else {
            System.out.println("Число нечетное.");
        }
    }
}

// Zadanie 4
import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();
        int price = 0;

        switch (age) {
            case 0, 1, 2, 3, 4, 5, 6:
                System.out.println("Билет бесплатный.");
                break;
            case 7, 8, 9, 10, 11:
                price = 150;
                System.out.println("Стоимость билета: " + price + " рублей.");
                break;
            case 12, 13, 14, 15, 16, 17:
                price = 200;
                System.out.println("Стоимость билета: " + price + " рублей.");
                break;
            case 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49:
                price = 250;
                System.out.println("Стоимость билета: " + price + " рублей.");
                break;
            default:
                if (age >= 50) {
                    price = 250;
                    double discountedPrice = price * 0.95; // 5% скидка
                    System.out.println("Стоимость билета с пенсионной скидкой: " + discountedPrice + " рублей.");
                } else {
                    System.out.println("Некорректный возраст.");
                }
                break;
        }
    }
}
