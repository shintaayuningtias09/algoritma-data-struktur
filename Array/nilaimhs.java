public class nilaimhs {
    public static void main(String[] args) {

        // Inisialisasi array statis dengan 5 nilai mahasiswa
        int[] nilai = {80, 90, 75, 85, 95};
        int total = 0;

        System.out.println("=== Program Nilai Mahasiswa (Array Statis) ===");

        // Tampilkan semua nilai dan hitung total
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
            total += nilai[i];
        }
        // Hitung rata-rata
        double rataRata = (double) total / nilai.length;

        System.out.println("\nRata-rata nilai mahasiswa: " + rataRata);
}
}
