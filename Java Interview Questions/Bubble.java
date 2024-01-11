class Bubble{

    public static void BubbleSort(int a[]){
        int t;
        int n=a.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
    }
    static void printArray(int a[]) 
    { 
        int n = a.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(a[i] + " "); 
        System.out.println(); 
    } 
    public static void main(String[] args) {

          int arr[]={3,5,7,9,2,4,8};
          BubbleSort(arr);
            printArray(arr);
    }
}