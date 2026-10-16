import java.util.Scanner;
public class patternsclass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 
        String input = sc.next();
 
        int A, B;
        String S;
 
        if (input.contains("+")) {
            S = "+";
        } else if (input.contains("-")) {
            S = "-";
        } else if (input.contains("*")) {
            S = "*";
        } else {
            S = "/";
        }
 
        String[] parts = input.split("\\" + S);   // splits "7+5" into "7" and "5"
        A = Integer.parseInt(parts[0]);
        B = Integer.parseInt(parts[1]);
 
        if (S.equals("+")) {
            System.out.println(A + B);
        } else if (S.equals("-")) {
            System.out.println(A - B);
        } else if (S.equals("*")) {
            System.out.println(A * B);
        } else {
            if (B == 0) {
                System.out.println("Cannot divide by zero");
            } else {
                System.out.println(A / B);
            }
        }
    }
}
