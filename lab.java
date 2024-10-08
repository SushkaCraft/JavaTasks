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
        double A = a;
        float fA = Math.round(a);
        // int intA = fA;
        System.out.println("neYavnoe " + fA);
        System.out.println();
    }
    
}
