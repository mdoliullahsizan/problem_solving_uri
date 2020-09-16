/*
Read three values (variables A, B and C), which are the three student's grades. Then, calculate the average, 
considering that grade A has weight 2, grade B has weight 3 and the grade C has weight 5. 
Consider that each grade can go from 0 to 10.0, always with one decimal place.

Input
The input file contains 3 values of floating points with one digit after the decimal point.

Output
Print the message "MEDIA"(average in Portuguese) and the student's average according to the following example, 
with a blank space before and after the equal signal.
*/

package uri;

import java.util.Scanner;

public class URI1006Average2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        double A, B, C, MEDIA;
        A= input.nextDouble();
        B= input.nextDouble();
        C= input.nextDouble();
        
        MEDIA= (A*2+B*3+C*5)/(2+3+5);
        
        System.out.printf("MEDIA = %.1f", MEDIA);
        System.out.println();
        
    }
    
}
