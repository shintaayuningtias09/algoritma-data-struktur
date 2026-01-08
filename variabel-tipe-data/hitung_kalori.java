import java.util.Scanner;

public class hitung_kalori {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalKalori = 0;
        int pilihan;
        int waktu;

        System.out.println("Program Hitung Kalori");
        System.out.println("1. Lari (60 kalori per 5 menit)");
        System.out.println("2. Push-up (200 kalori per 30 menit)");
        System.out.println("3. Plank (5 kalori per 1 menit)");
        System.out.println("0. Selesai");

        System.out.print("Pilih olahraga (1-3, 0 untuk selesai): ");
        pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.print("Masukkan lama waktu lari (menit): ");
            waktu = input.nextInt();
            int kalori = (waktu / 5) * 60;
            totalKalori += kalori;
            System.out.println("Kalori terbakar dari lari: " + kalori);

        } else if (pilihan == 2) {
            System.out.print("Masukkan lama waktu push-up (menit): ");
            waktu = input.nextInt();
            int kalori = (waktu / 30) * 200;
            totalKalori += kalori;
            System.out.println("Kalori terbakar dari push-up: " + kalori);

        } else if (pilihan == 3) {
            System.out.print("Masukkan lama waktu plank (menit): ");
            waktu = input.nextInt();
            int kalori = waktu * 5;
            totalKalori += kalori;
            System.out.println("Kalori terbakar dari plank: " + kalori);

        } else if (pilihan == 0) {
            System.out.println("Program selesai. Tidak ada kalori yang dihitung.");
        } else {
            System.out.println("Pilihan tidak valid!");
        }

        System.out.println("\nTotal kalori yang terbakar: " + totalKalori);
        input.close();
    }
}
