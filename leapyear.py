x=int(input("Enter the year: "))

if(x%4==0):
    if(x%100==0):
        if(x%400==0):
            print(x ,"is leap year")
        else:
            print(x ,"is not leap year")
    else: 
        print(x ,"is leap year")
else:
    print(x ,"is not leap year")
