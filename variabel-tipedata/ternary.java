public class ternary {
    public static void main(String[] args) {
        int uang = 50000;
        int hargaMainan = 55000;

        // menggunakan operator ternary
        String hasil = (uang >= hargaMainan) 
                        ? "Uang cukup, bisa membeli mainan." 
                        : "Uang tidak cukup, tidak bisa membeli mainan.";

        System.out.println("Uang yang dibawa: Rp " + uang);
        System.out.println("Harga mainan: Rp " + hargaMainan);
        System.out.println("Kesimpulan: " + hasil);
    }
}
