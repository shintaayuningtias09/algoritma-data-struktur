import java.util.Scanner;

public class MesinHitungOtomatis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MESIN HITUNG OTOMATIS ===");
        System.out.print("Masukkan angka awal: ");
        int awal = input.nextInt();
        System.out.print("Masukkan angka akhir: ");
        int akhir = input.nextInt();

        System.out.println("\nPilih jenis perulangan:");
        System.out.println("1. For");
        System.out.println("2. While");
        System.out.println("3. Do-While");
        System.out.print("Pilihan Anda: ");
        int pilihan = input.nextInt();

        System.out.println("\nPilih jenis operasi:");
        System.out.println("1. Deret bilangan genap");
        System.out.println("2. Deret bilangan ganjil");
        System.out.println("3. Faktorial dari angka akhir");
        System.out.print("Pilihan operasi: ");
        int operasi = input.nextInt();

        System.out.println("\n=== HASIL PROGRAM ===");

        switch (pilihan) {
            case 1:
                for (int i = awal; i <= akhir; i++) {
                    tampilkan(i, operasi);
                }
                break;

            case 2:
                int i = awal;
                while (i <= akhir) {
                    tampilkan(i, operasi);
                    i++;
                }
                break;

            case 3:
                int j = awal;
                do {
                    tampilkan(j, operasi);
                    j++;
                } while (j <= akhir);
                break;

            default:
                System.out.println("Pilihan tidak valid.");
        }

        System.out.println("\n=== Program Selesai ===");
    }

    static void tampilkan(int nilai, int operasi) {
        switch (operasi) {
            case 1:
                if (nilai % 2 == 0) System.out.print(nilai + " ");
                break;
            case 2:
                if (nilai % 2 != 0) System.out.print(nilai + " ");
                break;
            case 3:
                int faktorial = 1;
                for (int k = 1; k <= nilai; k++) {
                    faktorial *= k;
                }
                System.out.println("Faktorial dari " + nilai + " = " + faktorial);
                break;
        }
    }
}
