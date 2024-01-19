import java.util.*;
public class Demo {


    public static void main(String[] args) {
        ThreadClass threadClass=new ThreadClass();
        threadClass.start();
        for (int i=0;i<10;i++){
            System.out.println("Parent Thread"+i);
        }
    }
}
