user_input1 = input("Please enter an integer:")

def gerade_ungerade(user_input1):
    if int(user_input1) % 2 == 0:
        return "The number is even."
    else:
        return "The number is odd."
    
print(gerade_ungerade(user_input1))