import java.util.Scanner;

public class  penjumlahan {
    public static void main(String[] args) {
        int nilai1;
        int nilai2;
        int hasil;

        Scanner input = new Scanner(System.in);
        System.out.print("Isikan Nilai Pertama: ");
        nilai1 = input.nextInt();
        System.out.print("Isikan Nilai Kedua: ");
        nilai2 = input.nextInt();

        hasil = nilai1 + nilai2;

        System.out.println("Hasil Penjumlahan Adalah: "+ hasil);

    }
} 
