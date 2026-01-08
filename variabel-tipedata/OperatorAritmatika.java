import java.util.Scanner;

public class OperatorAritmatika {
    public static void main(String[]args){
        int bil_satu;
        int bil_dua;
        int hasiJumlah, hasilKurang, hasilKali, hasilBagi, hasilSisaBagi;

        Scanner input = new Scanner(System.in);
        System.out.print("Isikan Bilangan 1:");
        bil_satu = input.nextInt();
        System.out.print("Isikan Bilangan 2:");
        bil_dua = input.nextInt();

        hasiJumlah = bil_satu + bil_dua;
        hasilKurang = bil_satu - bil_dua;
        hasilBagi = bil_satu / bil_dua;
        hasilKali = bil_satu * bil_dua;
        hasilSisaBagi = bil_satu % bil_dua;
        
        System.out.println("Hasil Penjumlahan: " + hasiJumlah);
        System.out.println("Hasil Kurang :" + hasilKurang);
        System.out.println("Hasil Pembagian : " + hasilBagi);
        System.out.println("Hasil Perkalian : " + hasilKali);
        System.out.println("Hasil Sisa Bagi : " + hasilSisaBagi);

    }
    
}
