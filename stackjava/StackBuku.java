package stackjava;

public class StackBuku {

    public static void main(String[] args) {
    Stack mybook = new Stack();
    mybook.push("Java Programmer");
    mybook.push("Learning by doing");
    mybook.push("Belajar pemrograman Web");
    mybook.getInfo();
    mybook.pop();
    mybook.getInfo();
    }
   } 
   