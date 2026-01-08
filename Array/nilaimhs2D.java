public class nilaimhs2D {
    public static void main(String[] args) {
        // Inisialisasi array 2 dimensi:
        // Baris = Mahasiswa, Kolom = Mata kuliah
        int[][] nilai = {
            {80, 85, 90}, // Mahasiswa 1
            {75, 70, 80}, // Mahasiswa 2
            {90, 95, 88}  // Mahasiswa 3
        };

        // Jumlah mahasiswa dan mata kuliah
       int jumlahMahasiswa = nilai.length;
        int jumlahMatkul = nilai[0].length;

        System.out.println("=== Program Nilai Mahasiswa (Array 2 Dimensi) ===");
        System.out.println("Baris = Mahasiswa | Kolom = Mata Kuliah\n");

        // Tampilkan data nilai dalam bentuk tabel
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Mahasiswa ke-" + (i + 1) + " : ");
            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print(nilai[i][j] + "\t");
            }
            System.out.println();
        }

        // Hitung rata-rata tiap mahasiswa
        System.out.println("\n=== Rata-rata Nilai Tiap Mahasiswa ===");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            int total = 0;
            for (int j = 0; j < jumlahMatkul; j++) {
                total += nilai[i][j];
            }
            double rataRata = (double) total / jumlahMatkul;
            System.out.println("Mahasiswa ke-" + (i + 1) + " : " + rataRata);
        }

        // Contoh akses elemen tertentu (baris dan kolom)
        System.out.println("\nContoh akses nilai mahasiswa ke-2 pada mata kuliah ke-3:");
        System.out.println("Nilai: " + nilai[1][2]);
    }
}
 