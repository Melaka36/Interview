package example2;

public class Table {
    synchronized void printTabel(int n){
        for(int i=1;i<5;i++){
            System.out.println(n*i);
            try {
                Thread.sleep(1000);
            }catch (Exception e) {
                System.out.println(e);
            }
        }
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
