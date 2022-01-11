print("Enter First Value")
x = int(input())
answer = input("Please enter a Operator")
print("Enter Second Value")
y = int(input())

def add(x,y):

    return x + y

def substract(x, y):
    return x - y


def multiply(x,y):

    return x*y

def divide(x ,y):
    return x /y

if(answer =="+"):
    print(add(x,y))

if(answer =="-"):
    print(substract(x,y))

if(answer == "*"):
    print(multiply(x,y))

if(answer =="/"):
    print(divide(x,y))
