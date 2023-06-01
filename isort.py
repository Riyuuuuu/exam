def isort(l):
    for i in range(len(l)):
        key=l[i]
        j=i-1
        while j>=0 and key<l[j]:
            l[j+i]=l[j]
            j-=1

        l[j+1]=key

l=[22,38,49,10,29]
print("List is=",l)
isort(l)
print("The sorted list is=")
for i in range(len(l)):
    print(l[i])
