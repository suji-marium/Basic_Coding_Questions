x=int(input("Enter a number: "))
val=x
c=0
while(x!=0):
    c=c+1;
    x=x//10

sq=val*val 
print(sq)
res=sq%(10**c)

print(res)
print(val)

if(res==val):
    print("Automorphic")
else: 
    print("Not Automorphic")
