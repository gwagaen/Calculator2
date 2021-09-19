import java.util.Map;
import java.util.HashMap;
public class Roman {
    public String rom1;
    public String romop2;
    public String rom3;
    char operand = romop2.charAt(0);
    int sum = romanToInt(rom1) + operand + romanToInt(rom3);
    String sumr = intToRom(sum);
    public String together(){
        return sumr;
    }
}
