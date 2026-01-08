package stackjava;

public class Stack {
    private final int MAX_DATA = 10; // Maksimum 10 Data
    private String [] tumpukan = new String[MAX_DATA];
    private int teratas;
   
    public Stack(){
    teratas = 0;
    }
   
    public boolean push(String data){
    if(teratas==(MAX_DATA)){
    System.out.println("Tumpukan penuh");
    System.out.println("Data tidak bisa dimasukkan");
    return false;
    }
    teratas++;
    tumpukan[MAX_DATA-teratas] = data;
    return true;
    }
   
    public boolean empty(){
    return teratas == 0;
    } 

    public String pop(){
        String data=null;
        if(!empty()){
        for(int i=0;i<tumpukan.length;i++){
        if(tumpukan[i]!=null){
        data = tumpukan[i];
        tumpukan[i] = null;
        break;
        }
        }
        teratas--;
        return data;
        }
        else
        return "Tumpukan Sudah Kosong";
        }
       
        public void getInfo(){
        for(int i=0;i < tumpukan.length;i++){
        System.out.print(tumpukan[i] + "-");
        }
        System.out.println();
        }
       }

