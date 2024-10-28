a = """ Lorem ipsum dolor sit amet
consecutor adipiscing elit,
sed do eiusmod tempor incididunt
ut labore et , dolore magna aliqua."""
print(a)

txt = "The best things in life are free!"
print("free" in txt)
print(len(a))
str = "Internet is a network of networks"
if "net" in str:
    print("Net is present in str")
print("Not" not in str)

b = "Hello World"
print("b[2:5] ",b[2:5])

print("b[-5:-2] ",b[-5:-2])
print("b.upper()",b.upper())
print("(b.upper()).lower() ",(b.upper()).lower())
b = "   welcome home  "
print("b before strippping :",b)
print("b after  strippping :",b.strip())
c = "Hello World"
print("c.replace(\"H\",\"T\") :",c.replace("H","T"))
d = "One:Two:Three:Four"
print(' d.split(":") :', d.split(":"))
var1 = "Hello"
var2 = "World"
print(var1+' '+var2)
age = 36
sal = 1000000000000
tax = 2.3
txt = f"My Name is Chandra , I am   {age}  and my salary is {sal} I pay a tax of {tax}"

print(txt)

