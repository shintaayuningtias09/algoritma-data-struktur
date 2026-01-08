import java.util.Scanner;

public class menu_makanan{
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String makanan ;
        int harga ;
        int pilihan ;

        System.out.println("MENU MAKANAN");
        System.out.println("1. Kwetiau        - Rp 15.000");
        System.out.println("2. Nasi uduk      - Rp 12.000");
        System.out.println("3. Ayam goreng    - Rp 10.000");
        System.out.println("4. Iga bakar      - Rp 13.000");

        System.out.print("Pilih menu 1-4 :");
        pilihan = input.nextInt();

        switch(pilihan){
            case 1:
            makanan = "Kwetiau";
            harga = 15000;
            break;
            case 2:
            makanan = "Nasi uduk";
            harga = 12000;
            break;
            case 3:
            makanan = "Ayam goreng";
            harga = 10000;
            break;
            case 4:
            makanan = "Iga bakar";
            harga = 13000;
            break;
            case 5:
            System.out.println("Terimakasih sudah memesan");
            input.close();
            return;

            default:
            System.out.println("Pilihan tidak tersedia");
            input.close();
            return;
        }

        System.out.println("Anda memilih "+makanan);
        System.out.println("Harga Rp" + harga);
        input.close();



    }
}