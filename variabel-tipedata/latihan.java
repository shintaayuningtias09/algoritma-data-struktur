public class latihan {
 
    public static void main(String[]args){
        int nilai = 10;
        String pesan = " ", jumlah= " ";

        if (nilai>2){
            jumlah = "Lebih Besar dari 2";
            if(nilai % 2 == 0){
                pesan = "Bilangan Genap";
            }else{
                pesan = "Bilangan Ganjil";
            }
            System.out.println(jumlah+ " dan " +pesan);
        }else{
            jumlah = "lebih kecil dari 2";
            System.out.println(jumlah);
        }
    }
}
