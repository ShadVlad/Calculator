import java.util.Scanner;

public class ReadConsole {
    private static Scanner read;

    public String [] readNext(){
        read = new Scanner(System.in);
        String [] digitsStr = new String[3];
        digitsStr [0] = read.next();
        digitsStr [1] = read.next();
        digitsStr [2] = read.next();

        return digitsStr;

    }



}
