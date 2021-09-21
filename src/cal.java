import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class cal {
    public static void main(String[] args) {
        double op1, op2;
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

        if (Pattern.matches("[a-zA-Z]+", var1)){
            char oper = varop2.charAt(0);
            RomanToNumber rom1c = new RomanToNumber();
            RomanToNumber rom3c = new RomanToNumber();
            double a = rom1c.romanToDecimal(var1);
            double b = rom3c.romanToDecimal(var3);
            int res1 = (int)math(a, b, oper);
            System.out.println(NumberToRoman.intToRoman(res1));
            System.exit(0);
        }
        op1 = Integer.parseInt(var1);
        operator = varop2.charAt(0);
        op2 = Integer.parseInt(var3);

        double res2 = math(op1, op2, operator);
        System.out.println(res2);
    }
    public static double math(double x, double y, char z){
        double res = 0;
        if (1 <= x && 10 >= x && 1 <= y && 10 >= y) {
            if (z == '+') {res = x + y;}
            else if (z == '-') {res = x - y;}
            else if (z == '*') {res = x * y;}
            else if (z == '/') {res = x / y;}
        }
        return res;
    }
}

