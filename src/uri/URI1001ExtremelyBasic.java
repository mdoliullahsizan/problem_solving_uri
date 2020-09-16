/*
Read 2 variables, named A and B and make the sum of these two variables, assigning its result to the variable X. 
Print X as shown below. Print endline after the result otherwise you will get “Presentation Error”.

Input
The input file will contain 2 integer numbers.

Output
Print the letter X (uppercase) with a blank space before and after the equal signal followed by the value of X, according to the following example.

Obs.: don't forget the endline after all.

Samples Input	Samples Output
10
9

X = 19

-10
4

X = -6

15
-7

X = 8

*/


package uri;
import java.util.Scanner;
public class URI1001ExtremelyBasic {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int A, B, X;
        A= input.nextInt();
        B= input.nextInt();
        X= A+B;
        System.out.println("X = "+X);
    }
}