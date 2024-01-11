class Q16{
    public int a=10;
    public static void main (String args[]){
        System.out.println("He");
        
        A a=new A();
        // Q16 a=new Q16();
        System.out.println(a.a);
    }
    
}
class A{
    int b=20;
    protected int c=30;
}

class B{
    public void honk(){
        System.out.println("B");
    }
}