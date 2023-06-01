def bubble(l):
    n=len(l)
    for i in range (n-1):
        for j in range (0,n-i-1):
            if l[j]>l[j+1]:
                t=l[j]
                l[j]=l[j+1]
                l[j+1]=t
    return
l=[56,90,63,98,78]
bubble(l)
print("Sorted list is ")
for i in range (len(l)):
    print("%d"%l[i])
