class fibonacci {
    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
 
}

class Recursion1{
    public static void main (String args[]){
        System.out.println(add(10,100));
        int n = 2;
        System.out.println(
            n + "th Fibonacci Number: " + fibonacci.fib(n));
    }
    public static int add(int start,int end){
        if(start<end)
            return end+add(start,end-1);
        else
            return start;
    }
}

