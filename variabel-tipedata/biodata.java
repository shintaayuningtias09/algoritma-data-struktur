import java.util.Scanner;

public class biodata{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data dari pengguna
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Umur: ");
        int umur = input.nextInt();

        System.out.print("Masukkan Tinggi Badan (cm): ");
        float tinggiBadan = input.nextFloat();

        System.out.print("Apakah Anda mahasiswa aktif? (true/false): ");
        boolean statusAktif = input.nextBoolean();

        // Output biodata
        System.out.println("\n===== BIODATA MAHASISWA =====");
        System.out.println("Nama              : " + nama);
        System.out.println("Umur              : " + umur + " tahun");
        System.out.println("Tinggi Badan      : " + tinggiBadan + " cm");
        System.out.println("Status Mahasiswa  : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
    }
}