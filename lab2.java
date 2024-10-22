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
