public class arraymahasiswa {
    public static void main (String args[]){
        int nilai[]={90,80,75,85,95};
        int total =0;
        double rata;
        for(int i=0;i<nilai.length;i++){
          total += nilai[i];
        }
        rata=(double) total/nilai.length;
        System.out.print("nilai mahasiswa : ");
        for (int n : nilai){
            System.out.print(n + " ");
        }
        System.out.println("\nTotal nilai = " + total);
        System.out.println("Rata-rata nilai = " + rata);
    }
}