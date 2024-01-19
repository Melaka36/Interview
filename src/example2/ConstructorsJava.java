package example2;
class MyClass{
    int a;
    static int b;
    char one='1'-0;
    int on= one - '0';
    int [][]arr= new int[5][];
    public MyClass(int a) {
        this.a = a;
    }
    public static void printA(){
//        a=5;
        System.out.println(b);
    }
}
public class ConstructorsJava {
    public static void main(String[] args) {
        MyClass m=new MyClass(3);
        m.printA();
    }
}
