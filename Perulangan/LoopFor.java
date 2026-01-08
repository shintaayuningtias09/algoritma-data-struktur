public class LoopFor {
   public static void main(String[] args) {
        System.out.println("=== Menampilkan Angka Genap 1–20 ===");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) { // hanya cetak jika genap
                System.out.println("Angka genap: " + i);
            }
        }
    }
}
