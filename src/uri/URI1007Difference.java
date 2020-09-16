/*
Read four integer values named A, B, C and D. 
Calculate and print the difference of product A and B by the product of C and D (A * B - C * D).

Input
The input file contains 4 integer values.

Output
Print DIFERENCA (DIFFERENCE in Portuguese) with all the capital letters, according to the following example, 
with a blank space before and after the equal signal.
*/


package uri;

import java.util.Scanner;

public class URI1007Difference {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        int A, B, C, D, DIFERENCA;
        A= input.nextInt();
        B= input.nextInt();
        C= input.nextInt();
        D= input.nextInt();
        
        DIFERENCA= (A*B)-(C*D);
        
        System.out.println("DIFERENCA = "+DIFERENCA);
    }
    
}
