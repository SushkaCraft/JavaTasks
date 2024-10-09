//Variant 1
// First
public class Main
{
    public static void main(String[] args) {
        int a = 25, b = -10, c = 0;
        
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        String strC = String.valueOf(c);
        
        System.out.println("int to str: " + strA + " " + strB + " " + strC);
        
        System.out.println("str to int: " + Integer.parseInt(strA) + " " + Integer.parseInt(strB)+ " " + Integer.parseInt(strC));
        
    }
}
// Second
public class Main
{
    public static void main(String[] args) {
        logicalCalculator(true, true);
        logicalCalculator(true, false);
        logicalCalculator(false, true);
        logicalCalculator(false, false);
    }
    
    public static void logicalCalculator(boolean v1, boolean v2){
        System.out.println("AND: " + (v1 && v2));
        System.out.println("OR: " + (v1 || v2));
        System.out.println("NOT v1: " + (!v1));
        System.out.println("NOT v1: " + (!v2));
        System.out.println();
    }
}
// Third
public class Main
{
    public static void main(String[] args) {
        Comparison(10, 5);
        Comparison(3, 8);
        Comparison(6, 6);
        
    }
    
    public static void Comparison(int a, int b){
        if (a > b){
            System.out.println("Первая > Второй");
        } else if(a < b){
            System.out.println("Первая < Второй");
        } else {
            System.out.println("Первая = Второй");
        }
    }
}
// Fourth
public class Main
{
    public static void main(String[] args) {
        Yavnoe(10.5);
        neYavnoe(5.8);
        Yavnoe(10.5);
        neYavnoe(5.8);
    }
    
    public static void Yavnoe(double a){
        int A = (int) a;
        System.out.println("Yavnoe " + A);
        System.out.println();
    }
    
    public static void neYavnoe(double a){
        int A = 0;
        A += a;
        System.out.println("neYavnoe " + A);
        System.out.println();
    }
    
}

//Variant 2
// First
public class Main
{
    public static void main(String[] args) {
        int a = 100, b = -50, c = 15;
        
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        String strC = String.valueOf(c);
        
        System.out.println("int to str: " + strA + " " + strB + " " + strC);
        
        System.out.println("str to int: " + Integer.parseInt(strA) + " " + Integer.parseInt(strB)+ " " + Integer.parseInt(strC));
        
    }
}
// Second
public class Main
{
    public static void main(String[] args) {
        logicalCalculator(true, false);
        logicalCalculator(false, true);
        logicalCalculator(true, true);
        logicalCalculator(false, false);
    }
    
    public static void logicalCalculator(boolean v1, boolean v2){
        System.out.println("AND: " + (v1 && v2));
        System.out.println("OR: " + (v1 || v2));
        System.out.println("NOT v1: " + (!v1));
        System.out.println("NOT v1: " + (!v2));
        System.out.println();
    }
}
// Third
public class Main
{
    public static void main(String[] args) {
        Comparison(20, 15);
        Comparison(4, 7);
        Comparison(9, 9);
        
    }
    
    public static void Comparison(int a, int b){
        if (a > b){
            System.out.println("Первая > Второй");
        } else if(a < b){
            System.out.println("Первая < Второй");
        } else {
            System.out.println("Первая = Второй");
        }
    }
}
// Fourth
public class Main
{
    public static void main(String[] args) {
        Yavnoe(8.2);
        neYavnoe(3.7);
        Yavnoe(8.2);
        neYavnoe(3.7);
    }
    
    public static void Yavnoe(double a){
        int A = (int) a;
        System.out.println("Yavnoe " + A);
        System.out.println();
    }
    
    public static void neYavnoe(double a){
        int A = 0;
        A += a;
        System.out.println("neYavnoe " + A);
        System.out.println();
    }
    
}

//Variant 3
// First
public class Main
{
    public static void main(String[] args) {
        int a = 50, b = -20, c = 0;
        
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        String strC = String.valueOf(c);
        
        System.out.println("int to str: " + strA + " " + strB + " " + strC);
        
        System.out.println("str to int: " + Integer.parseInt(strA) + " " + Integer.parseInt(strB)+ " " + Integer.parseInt(strC));
        
    }
}
// Second
public class Main
{
    public static void main(String[] args) {
        logicalCalculator(true, true);
        logicalCalculator(true, false);
        logicalCalculator(false, true);
        logicalCalculator(false, false);
    }
    
    public static void logicalCalculator(boolean v1, boolean v2){
        System.out.println("AND: " + (v1 && v2));
        System.out.println("OR: " + (v1 || v2));
        System.out.println("NOT v1: " + (!v1));
        System.out.println("NOT v1: " + (!v2));
        System.out.println();
    }
}
// Third
public class Main
{
    public static void main(String[] args) {
        Comparison(15, 5);
        Comparison(3, 8);
        Comparison(5, 5);
        
    }
    
    public static void Comparison(int a, int b){
        if (a > b){
            System.out.println("Первая > Второй");
        } else if(a < b){
            System.out.println("Первая < Второй");
        } else {
            System.out.println("Первая = Второй");
        }
    }
}
// Fourth
public class Main
{
    public static void main(String[] args) {
        Yavnoe(10.5);
        neYavnoe(10.5);
        Yavnoe(5.8);
        neYavnoe(5.8);
    }
    
    public static void Yavnoe(double a){
        int A = (int) a;
        System.out.println("Yavnoe " + A);
        System.out.println();
    }
    
    public static void neYavnoe(double a){
        int A = 0;
        A += a;
        System.out.println("neYavnoe " + A);
        System.out.println();
    }
    
}

//Variant 4
//First
public class Main
{
    public static void main(String[] args) {
        int a = 25, b = -10, c = 0;
        
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        String strC = String.valueOf(c);
        
        System.out.println("int to str: " + strA + " " + strB + " " + strC);
        
        System.out.println("str to int: " + Integer.parseInt(strA) + " " + Integer.parseInt(strB)+ " " + Integer.parseInt(strC));
        
    }
}
// Second
public class Main
{
    public static void main(String[] args) {
        logicalCalculator(true, true);
        logicalCalculator(true, false);
        logicalCalculator(false, true);
        logicalCalculator(false, false);
    }
    
    public static void logicalCalculator(boolean v1, boolean v2){
        System.out.println("AND: " + (v1 && v2));
        System.out.println("OR: " + (v1 || v2));
        System.out.println("NOT v1: " + (!v1));
        System.out.println("NOT v1: " + (!v2));
        System.out.println();
    }
}
// Third
public class Main
{
    public static void main(String[] args) {
        Comparison(10, 5);
        Comparison(3, 8);
        Comparison(5, 5);
    }
    
    public static void Comparison(int a, int b){
        if (a > b){
            System.out.println("Первая > Второй");
        } else if(a < b){
            System.out.println("Первая < Второй");
        } else {
            System.out.println("Первая = Второй");
        }
    }
}
// Fourth
public class Main
{
    public static void main(String[] args) {
        Yavnoe(10.5);
        neYavnoe(10.5);
        Yavnoe(5.8);
        neYavnoe(5.8);
    }
    
    public static void Yavnoe(double a){
        int A = (int) a;
        System.out.println("Yavnoe " + A);
        System.out.println();
    }
    
    public static void neYavnoe(double a){
        int A = 0;
        A += a;
        System.out.println("neYavnoe " + A);
        System.out.println();
    }
    
}
//Variant 5
//First
public class Main
{
    public static void main(String[] args) {
        int a = 255, b = -100, c = 0;
        
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        String strC = String.valueOf(c);
        
        System.out.println("int to str: " + strA + " " + strB + " " + strC);
        
        System.out.println("str to int: " + Integer.parseInt(strA) + " " + Integer.parseInt(strB)+ " " + Integer.parseInt(strC));
        
    }
}
// Second
public class Main
{
    public static void main(String[] args) {
        logicalCalculator(true, true);
        logicalCalculator(true, false);
        logicalCalculator(false, true);
        logicalCalculator(false, false);
    }
    
    public static void logicalCalculator(boolean v1, boolean v2){
        System.out.println("AND: " + (v1 && v2));
        System.out.println("OR: " + (v1 || v2));
        System.out.println("NOT v1: " + (!v1));
        System.out.println("NOT v1: " + (!v2));
        System.out.println();
    }
}
// Third
public class Main
{
    public static void main(String[] args) {
        Comparison(9, 4);
        Comparison(2, 7);
        Comparison(6, 6);
    }
    
    public static void Comparison(int a, int b){
        if (a > b){
            System.out.println("Первая > Второй");
        } else if(a < b){
            System.out.println("Первая < Второй");
        } else {
            System.out.println("Первая = Второй");
        }
    }
}
// Fourth
public class Main
{
    public static void main(String[] args) {
        Yavnoe(105.56);
        neYavnoe(105.56);
        Yavnoe(57.845489);
        neYavnoe(57.845489);
    }
    
    public static void Yavnoe(double a){
        int A = (int) a;
        System.out.println("Yavnoe " + A);
        System.out.println();
    }
    
    public static void neYavnoe(double a){
        int A = 0;
        A += a;
        System.out.println("neYavnoe " + A);
        System.out.println();
    }
    
}
