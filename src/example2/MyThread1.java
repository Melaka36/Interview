package example2;

public class MyThread1 extends Thread{
    Table t;

    MyThread1(Table t){
        this.t=t;
    }
    public void run(){
        t.printTabel(5);
    }
}
