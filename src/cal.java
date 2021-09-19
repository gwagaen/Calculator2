import java.util.Scanner;
import java.util.StringTokenizer;
public class cal {
    public static void main(String[] args) {
        int op1, op2;
        char operator;
        Scanner inputstr = new Scanner(System.in);
        System.out.print("Input: ");
        String actualString = inputstr.nextLine();
        actualString = actualString.replaceAll("\\s+", "");
        StringTokenizer st = new StringTokenizer((actualString), "+-*/", true);
        op1 = Integer.parseInt(st.nextToken());
        operator = st.nextToken().charAt(0);
        op2 = Integer.parseInt(st.nextToken());
        if (1 <= op1 && 10 >= op1 && 1 <= op2 && 10 >= op2) {
        float res = 0;
        if (operator == '+') {res=op1+op2;}
        else if (operator == '-') {res=op1-op2;}
        else if (operator == '*') {res=op1*op2;}
        else if (operator == '/') {res=op1/op2;}
        System.out.println(res);
        }
        }
}

