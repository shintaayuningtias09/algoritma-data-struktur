
import java.util.Scanner;

public class LoopingWhile {
    public static void main(String[] args) {
        int i = 1;
        String ulang = "N";
        Scanner sc = new Scanner(System.in);

        while(ulang.equals("N")){
            System.out.println("Ini adalah perulangan ke "+ i);
            i++;
            System.out.println("Apakah Mau Keluar dari Program (Y/N)?");
            ulang=sc.next();
        }
    }
}
