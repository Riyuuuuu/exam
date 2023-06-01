def ssort(l):
    n=len(l)
    for i in range(n):
        small=l[i]
        loc=i
        for j in range(i+1,n):
            if l[j]<small:
                small=l[j]
                loc=j
                temp=l[loc]
                l[loc]=l[i]
                l[i]=temp

    return(l)

l=[2,5,1,4,9]
print("Unsorted list is=",l)
ssort(l)
print("Sorted list is=",l)