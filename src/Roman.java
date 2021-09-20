public class Roman {
    public String rom1;
    public String romop2;
    public String rom3;
    char operand = romop2.charAt(0);
    RomanToNumber rom1c = new RomanToNumber();
    RomanToNumber rom3c = new RomanToNumber();
    int sum = rom1c.romanToDecimal(rom1) + operand + rom3c.romanToDecimal(rom3);
    NumberToRoman sumr = new NumberToRoman ();
    public String together(){
        return sumr.intToRoman(sum);
    }
}
