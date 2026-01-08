public class LoopWhile {
    public static void main(String[] args) {
        String teks = "Halo Dunia ";
        String hasil = "";
        int totalKarakter = 0;

        while (totalKarakter < 50) {
            hasil += teks; // tambahkan string ke hasil
            totalKarakter = hasil.length(); // hitung panjang total
        }

        System.out.println("=== Hasil Perulangan ===");
        System.out.println(hasil);
        System.out.println("Total karakter: " + totalKarakter);
    }
}