class overloading{
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main (String args[]){
        System.out.println(add(2,3));
        System.out.println(add(2,3,2));
    }
}
