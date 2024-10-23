// Zadanie 1
// V1
import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        
        if (scanner.hasNext()) {
            String inputString = scanner.next();
            System.out.println("Вы ввели строку: " + inputString);
        } else {
            System.out.println("Ошибка: Введена не строка.");
        }
    }
}

// V2
import java.util.Scanner;

public class Main {
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

public class Main {
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

public class Main {
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

public class Main {
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

public class Main {
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

public class Main {
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

public class Main {
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

public class Main {
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

public class Main {
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

public class Main {
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

public class Main {
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

public class Main {
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

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();
        int price = 0;

        switch (age) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Билет бесплатный.");
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                price = 150;
                System.out.println("Стоимость билета: " + price + " рублей.");
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                price = 200;
                System.out.println("Стоимость билета: " + price + " рублей.");
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                price = 250;
                System.out.println("Стоимость билета: " + price + " рублей.");
                break;
            default:
                if (age >= 50) {
                    price = 250;
                    double discountedPrice = price * 0.95;
                    System.out.println("Стоимость билета с пенсионной скидкой: " + discountedPrice + " рублей.");
                } else {
                    System.out.println("Некорректный возраст.");
                }
                break;
        }
    }
}

//Zadanie 5
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter password");
	    String password = in.nextLine();
	    
	    if(password.length() < 8){
	        System.out.println("err<8");
	    } else{
	        boolean hasUpperCase = false;
	        boolean hasDigit = false;
	        
	        for(char c : password.toCharArray()){
	            if(Character.isUpperCase(c)) hasUpperCase = true;
	            if(Character.isDigit(c)) hasDigit = true;
	            if(hasDigit && hasUpperCase) break;
	        }
	        
	        if(hasDigit && hasUpperCase) System.out.println("Correct");
	        else System.out.println("Error");
	    }
	}
}

// I would use the following regex pattern to assert your requirements:

// ^(?!.*[^A-Za-z0-9])(?=.{10,}).*\\d.*\\d.*$
// This pattern says to:

// ^                   from the start of the password
// (?!.*[^A-Za-z0-9])  look ahead and assert that we do NOT see any non letters or digits
// (?=.{10,})          look ahead and assert that password length be 10 or longer
// .*\\d.*\\d.*        then match any pattern so long as two digits be present
// $                   end of the password
// I would probably just directly use String#matches here:

// Scanner scan = new Scanner(System.in);
// String password = scan.nextLine();
// if (password.matches("(?!.*[^A-Za-z0-9])(?=.{10,}).*\\d.*\\d.*")) {
//     System.out.println("Password is valid");
// }
// Note that we drop the ^ and $ anchors from the regex pattern when using it with String#matches because this method implicitly applies the pattern to the entire string input.

// String password = "ABC123@";
// int numChars = password.replaceAll("(?i)[^A-Z]+", "").length();
// int numDigits = password.replaceAll("\\D+", "").length();
// int numSpecial = password.replaceAll("[^!@#$%^&*()_+.-]", "").length();

// if (numChars >=1 && numChars <= 6 && numDigits >= 1 && numDigits <= 10 &&
//     numSpecial <= 1) {
//     System.out.println("password is valid");
// }
// else {
//     System.out.println("password is invalid");
// }

// Zadanie 6

//V1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите тип фигуры (круг, квадрат, прямоугольник): ");
        String shapeType = scanner.nextLine().toLowerCase();

        switch (shapeType) {
            case "круг":
                System.out.println("Введите радиус круга: ");
                double radius = scanner.nextDouble();
                double circleArea = Math.PI * Math.pow(radius, 2);
                System.out.println("Площадь круга: " + circleArea);
                break;
            case "квадрат":
                System.out.println("Введите длину стороны квадрата: ");
                double side = scanner.nextDouble();
                double squareArea = Math.pow(side, 2);
                System.out.println("Площадь квадрата: " + squareArea);
                break;
            case "прямоугольник":
                System.out.println("Введите длину и ширину прямоугольника: ");
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                double rectangleArea = length * width;
                System.out.println("Площадь прямоугольника: " + rectangleArea);
                break;
            default:
                System.out.println("Неизвестный тип фигуры.");
        }

        scanner.close();
    }
}

//V2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 'C' для конвертации в Фаренгейты или 'F' для конвертации в Цельсии: ");
        String scale = scanner.nextLine().toUpperCase();

        if (scale.equals("C")) {
            System.out.println("Введите температуру в Цельсиях: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("Температура в Фаренгейтах: " + fahrenheit);
        } else if (scale.equals("F")) {
            System.out.println("Введите температуру в Фаренгейтах: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("Температура в Цельсиях: " + celsius);
        } else {
            System.out.println("Неверный ввод.");
        }

        scanner.close();
    }
}

//V3
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите стоимость товара: ");
        double price = scanner.nextDouble();

        System.out.println("Введите скидку в процентах: ");
        double discount = scanner.nextDouble();

        if (discount >= 0 && discount <= 100) {
            double finalPrice = price - (price * discount / 100);
            System.out.println("Стоимость товара со скидкой: " + finalPrice);
        } else {
            System.out.println("Некорректное значение скидки.");
        }

        scanner.close();
    }
}

//V4
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длины сторон треугольника:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a == b && b == c) {
            System.out.println("Треугольник равносторонний.");
        } else if (a == b || b == c || a == c) {
            System.out.println("Треугольник равнобедренный.");
        } else {
            System.out.println("Треугольник разносторонний.");
        }

        scanner.close();
    }
}

//V5
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер месяца (1-12): ");
        int month = scanner.nextInt();

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень.");
                break;
            default:
                System.out.println("Некорректный номер месяца.");
        }

        scanner.close();
    }
}

//V6
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер дня недели (1-7): ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Понедельник.");
                break;
            case 2:
                System.out.println("Вторник.");
                break;
            case 3:
                System.out.println("Среда.");
                break;
            case 4:
                System.out.println("Четверг.");
                break;
            case 5:
                System.out.println("Пятница.");
                break;
            case 6:
                System.out.println("Суббота.");
                break;
            case 7:
                System.out.println("Воскресенье.");
                break;
            default:
                System.out.println("Некорректный номер дня недели.");
        }

        scanner.close();
    }
}

// Zadanie 7
//V1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год: ");
        int year = scanner.nextInt();

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " является високосным годом.");
        } else {
            System.out.println(year + " не является високосным годом.");
        }

        scanner.close();
    }
}

//V2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите вес посылки (в кг): ");
        double weight = scanner.nextDouble();

        System.out.println("Введите расстояние доставки (в км): ");
        int distance = scanner.nextInt();

        int tariff;
        switch (distance / 100) {
            case 0:
            case 1:
                tariff = 50;
                break;
            case 2:
            case 3:
                tariff = 100;
                break;
            case 4:
            case 5:
                tariff = 150;
                break;
            default:
                tariff = 200;
        }

        double cost = weight * tariff;
        System.out.println("Стоимость доставки: " + cost + " рублей.");

        scanner.close();
    }
}

//V3
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String inputString = scanner.nextLine();

        System.out.println("Введите символ: ");
        char inputChar = scanner.nextLine().charAt(0);

        if (inputString.indexOf(inputChar) != -1) {
            System.out.println("Символ '" + inputChar + "' есть в строке.");
        } else {
            System.out.println("Символ '" + inputChar + "' отсутствует в строке.");
        }

        scanner.close();
    }
}

//V4
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String inputString = scanner.nextLine().toLowerCase();

        int vowelCount = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            switch (ch) {
                case 'а':
                case 'е':
                case 'ё':
                case 'и':
                case 'о':
                case 'у':
                case 'ы':
                case 'э':
                case 'ю':
                case 'я':
                    vowelCount++;
                    break;
                default:
                    // Не гласная
            }
        }

        System.out.println("Количество гласных в строке: " + vowelCount);

        scanner.close();
    }
}

//V5
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String inputString = scanner.nextLine().toLowerCase().replaceAll("\\s+", "");

        String reversedString = new StringBuilder(inputString).reverse().toString();

        if (inputString.equals(reversedString)) {
            System.out.println("Строка является палиндромом.");
        } else {
            System.out.println("Строка не является палиндромом.");
        }

        scanner.close();
    }
}

//V6
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Меню:");
        System.out.println("1. Пункт 1");
        System.out.println("2. Пункт 2");
        System.out.println("3. Пункт 3");
        System.out.println("Выберите пункт меню (1-3):");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Вы выбрали Пункт 1.");
                break;
            case 2:
                System.out.println("Вы выбрали Пункт 2.");
                break;
            case 3:
                System.out.println("Вы выбрали Пункт 3.");
                break;
            default:
                System.out.println("Некорректный выбор.");
        }

        scanner.close();
    }
}
