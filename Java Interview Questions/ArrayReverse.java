class ArrayReverse{
    static void reverse(int [] a,int n){
        
        int i,k,t;
        for(i=0;i<n/2; i++){
            t=a[i];
            a[i]=a[n-1-i];
            a[n-1-i]=t;
        }
        for(k=0;k<n;k++){
            System.out.print(a[k]+",");
        }

    }

    public static void main(String []args){
        int[] arr={10,20,30,40,50,60};
        reverse(arr,arr.length);
    }
}