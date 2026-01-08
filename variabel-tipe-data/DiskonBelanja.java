import java.util.Scanner;

public class DiskonBelanja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total belanja: ");
        int total = input.nextInt();
        double bayar;

        if (total >= 100000) {
            bayar = total * 0.9; // diskon 10%
            System.out.println("Anda mendapat diskon 10%!");
        } else if (total >= 50000) {
            bayar = total * 0.95; // diskon 5%
            System.out.println("Anda mendapat diskon 5%!");
        } else {
            bayar = total;
            System.out.println("Tidak ada diskon.");
        }

        System.out.println("Total yang harus dibayar: Rp " + bayar);
    }
}

