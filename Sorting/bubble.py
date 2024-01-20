

def bubble(arr):
    n = len(arr)
    for i in range(n):
        for j in range(0,n-i-1  ):
            if arr[j]>arr[j+1]:
                t=arr[j]
                arr[j]=arr[j+1]
                arr[j+1]=t
    return arr
arr = [3,41,5,2,7,11,63,72,2]
bubble(arr)
print(arr)
    
    