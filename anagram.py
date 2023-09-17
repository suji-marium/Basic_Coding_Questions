flag=0
x=input("Enter string 1")
y=input("Enter string 2")

for i in x:
    if i in y:
        flag=0
    else:
        flag=1 
        break 
    
if(flag==0):
    print("The strings are Anagram")
else:
    print("The strings are not Anagram")



