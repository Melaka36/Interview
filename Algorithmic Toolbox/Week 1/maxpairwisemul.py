line1=input("Number of elements in the array: ")
arr=[0]*int(line1)
max1=arr[0]
max2=arr[0]
temp=0
for i in range(int(line1)):
    arr[i]=int(input("Enter the element: "))

# mul=0
# for i in range(int(line1)-1):
#     temp=arr[i]*arr[i+1]
#     if temp>mul:mul=temp
#find the two max numbers using the max function

max1=max(arr)
arr.remove(max1) #remove the first max number
max2=max(arr)  

print("max 1:",max1,"max 2:",max2)
print(arr)