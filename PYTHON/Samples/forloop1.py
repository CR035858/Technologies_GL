msg = "welcome"
for i in msg:
	print(i,end=" ")
# ---------- Range 1 to 10 step default 1
print()
data = range(1,11)
for i in data:
    print(i,end=" ")
print()
#---------------- Range 1 to 10 -> 1,3,5,7,9
data = range(1,11,2)
for i in data:
    print(i,end=" ")
print()
    
#---------------- Range(11) --> 0 to 10 step: 1
for i in range(11):
    print(i,end=" ")
print()
    
#---------------- Range(5,0,-1) --> 5
for i in range(5,0,-1):
    print(i, end=" ")
print()
#----------------Range () --> 0, 10,20,30,40,50
for i in range(0,51,10):
    print(i, end = " ")
print()
#----------------Range () -->10,20,30,40,50
for i in range(0,51,10):
    print(i, end = " ")
print()
#----------------Range () -->1 to 10
for i in range(1,11):
    print(i, end = " ")
print()
#----------------> 1 square 2 square 3 square ... upto 4 square
for i in range(1,6):
    print (i * i, end = " ")
print()

#----------------- While Loop
i = 1
while i<=5:
    print(i,end = " ")
    i += 1
print()
#---------------- Pattern
'''
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
'''
#----------------for loop with break
for  i in range(1,10):
    if i == 6:
        break;
    print(i,end=" ")
print()

#----------------for loop with continue
for i in range(1,3):
    if i == 3:
        continue
    print(i)
else:
    print("from else part")
    
#----------------for loop with continue
reply = "yes"
while reply == "yes":
    i = int(input("Enter a Number"))
    square = i * i
    if square > 100:
        print ("sorry square greater than 100 range should be 1 to 10")
        ''' break ''' 
        continue
    else:
        print (square, end = " ")
        print()
    '''i+=1'''
    reply = input("Do You wish to continue yes/no  :")
    
    
    