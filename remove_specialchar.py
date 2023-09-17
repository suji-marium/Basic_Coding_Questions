str1=input("Enter a string: ")
str2=''
for x in str1:
    if(ord(x)>=65 and ord(x)<=90) or (ord(x)>=97 and ord(x)<=122):
        str2+=x
print(str2)
