package Interview;

public class singletonEx {
    private static singletonEx instance;

    private singletonEx(){

    }
    public static singletonEx getInstance(){
        if(instance==null){
            synchronized (singletonEx.class){
                if (instance==null){
                    instance=new singletonEx();
                }
            }
        }
        return instance;
    }
}
