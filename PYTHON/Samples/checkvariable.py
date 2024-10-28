x = 'awesome'

def myfunc():
	x = 'fantastic'
	print("python is "+x)

myfunc()

print("python is"+x)

def checkGlobal():
    global x 
    x = 100
    print("The Global Variable x in a function is ",x)
checkGlobal()
print("Global Variable of Function accessed outside ",x)
#print(y)

