import java.util.Scanner;

public class HitungKaloriMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM HITUNG KALORI ===");
        System.out.println("1. Lari (60 kalori tiap 5 menit)");
        System.out.println("2. Push-up (200 kalori tiap 30 menit)");
        System.out.println("3. Plank (5 kalori tiap 1 menit)");
        System.out.print("Pilih jenis olahraga (1-3): ");
        int pilihan = input.nextInt();

        int durasi, kalori = 0;

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan durasi lari (menit): ");
                durasi = input.nextInt();
                if (durasi >= 5) {
                    kalori = (durasi / 5) * 60;
                } else {
                    System.out.println("⚠ Durasi lari kurang dari 5 menit, tidak dihitung.");
                }
                break;

            case 2:
                System.out.print("Masukkan durasi push-up (menit): ");
                durasi = input.nextInt();
                if (durasi >= 30) {
                    kalori = (durasi / 30) * 200;
                } else {
                    System.out.println("⚠ Durasi push-up kurang dari 30 menit, tidak dihitung.");
                }
                break;

            case 3:
                System.out.print("Masukkan durasi plank (menit): ");
                durasi = input.nextInt();
                if (durasi >= 1) {
                    kalori = durasi * 5;
                } else {
                    System.out.println("⚠ Durasi plank kurang dari 1 menit, tidak dihitung.");
                }
                break;

            default:
                System.out.println("Pilihan tidak valid.");
        }

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Total kalori terbakar: " + kalori + " kalori");
    }
}
