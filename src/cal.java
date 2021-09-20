import java.util.Scanner;
import java.util.StringTokenizer;
class Roman {
    public String rom1;
    public String romop2;
    public String rom3;
    char oper = romop2.charAt(0);
    RomanToNumber rom1c = new RomanToNumber();
    RomanToNumber rom3c = new RomanToNumber();
    int sum = rom1c.romanToDecimal(rom1) + oper + rom3c.romanToDecimal(rom3);
    NumberToRoman sumr = new NumberToRoman ();
    public String together(){
        return sumr.intToRoman(sum);
    }
}
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
            Roman rom = new Roman();
            rom.rom1 = var1;
            rom.romop2 = varop2;
            rom.rom3 = var3;

            System.out.println(rom.together());
            System.exit(0);
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

