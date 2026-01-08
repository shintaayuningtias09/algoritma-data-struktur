import java.util.Scanner;

public class LoopDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ulang;
        int i = 1;

        do {
            System.out.println("Perulangan ke-" + i);
            if (i >= 5) {
                System.out.println("Maksimal 5 kali perulangan, program berhenti otomatis.");
                break; // keluar dari loop jika sudah 5 kali
            }
            System.out.print("Apakah ingin mengulang (y/n)? ");
            ulang = input.nextLine();
            i++;
        } while (ulang.equalsIgnoreCase("y"));

        System.out.println("Perulangan selesai.");
    }
}
