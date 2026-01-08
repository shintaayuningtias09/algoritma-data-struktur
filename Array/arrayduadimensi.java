public class arrayduadimensi {
    public static void main(String[]args){
        String[][] kontak = {{"Lina","0012"},{"Dadang","0013"}, {"Dilla","0014"}, {"Ujang","0015"}};

        for(int x=0; x <kontak.length; x++){
            System.out.println("Nama : " + kontak[x][0]);
            System.out.println("Nomor : " + kontak[x][1]);
            System.out.println("-----------------------------------");
        }
    }
    
}
