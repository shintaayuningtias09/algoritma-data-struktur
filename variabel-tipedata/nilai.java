import java.util.Scanner;

public class nilai {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Program Konversi Nilai");
        System.out.println("Input Sebuah Nilai = ");
        int a = x.nextInt();
        if (a>=80){
            System.out.println("Your Grade is A");
        }
        else if (a >=76 && a<=79){
            System.out.println("Your Grade is B+");
        }
        else if (a >=71 && a<=75){
            System.out.println("Your Grade is B");
        }
        else if (a >=66 && a<=70){
            System.out.println("Your Grade is C+");
        }
        else if (a>=61 && a<=65){
            System.out.println("Your Grade is C");
        }
        else if (a>=51 && a<=60){
            System.out.println("Your Grade is D+");
        }
        else if (a>=41 && a<=50){
            System.out.println("Your Grade is D");
        }
        else {
            System.out.println("Your Grade is E");
        }
    }
    
}
