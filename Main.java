//First Task - Pattern

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        
        int half = n;
        
        for (int i = 0; i < half; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            
            for (int j = 0; j < 2 * (half - i - 1); j++) {
                System.out.print("  ");
            }
            
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        for (int i = half - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            
            for (int j = 0; j < 2 * (half - i - 1); j++) {
                System.out.print("  ");
            }
            
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        scanner.close();
    }
}

//In - 4
//
//Out -
//*            *
// **        **
//  ***    ***
//   ********
//   ********
//  ***    ***
// **        **
//*            *

//Second Task - S = (1/n+m+k)*Σ(n, i=1)(Σ(m, j=1)(Σ(k, t=1)(j^2/((i+t)^3-t))))

public class Main
{
	public static void main(String[] args) {
	    
		int N = 5, M = 7, K = 3;
		
		double S = 1.0 / (N + M + K) * sum(N, M, K);
		
		System.out.println(S);
	}
	
	public static double sum(double n, double m, double k){
	    
	    double sum = 0;
	    
	    double i, j, t;
	    
	    for (i = 1; i <= n; i++){
    	    	for (j = 1; j <= m; j++){
	            for (t = 1; t <= k; t++) sum += (j*j)/(((i+t)*(i+t)*(i+t))-t);
    	    	}
	    }
	    
	    return sum;
	}
}

//Out - 2.9489856742660523
