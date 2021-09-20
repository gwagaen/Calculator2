import java.util.Scanner;
import java.util.StringTokenizer;
public class cal {
    public static void main(String[] args) {
        int op1, op2;
        char operator;
        String var1, varop2, var3;
        Scanner inputstr = new Scanner(System.in);
        System.out.print("Input: ");
        String actualString = inputstr.nextLine();
        actualString = actualString.replaceAll("\\s+", "");
        StringTokenizer st = new StringTokenizer((actualString), "+-*/", true);
        var1 = st.nextToken();
        varop2 = st.nextToken();
        var3 = st.nextToken();
        if (var1.contains("X") || var1.contains("I") || var1.contains("V")) {
            char oper = varop2.charAt(0);
            RomanToNumber rom1c = new RomanToNumber();
            RomanToNumber rom3c = new RomanToNumber();
            int a = rom1c.romanToDecimal(var1);
            int b = rom3c.romanToDecimal(var3);
            if (1 <= a && 10 >= a && 1 <= b && 10 >= b) {
                int res1 = 0;
                if (oper == '+') {
                    res1 = a + b;
                } else if (oper == '-') {
                    res1 = a - b;
                } else if (oper == '*') {
                    res1 = a * b;
                } else if (oper == '/') {
                    res1 = a / b;
                }
                NumberToRoman sumr = new NumberToRoman ();
                System.out.println(sumr.intToRoman(res1));
                System.exit(0);
            }


        }

        op1 = Integer.parseInt(var1);
        operator = varop2.charAt(0);
        op2 = Integer.parseInt(var3);
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

