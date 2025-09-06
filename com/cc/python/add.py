user_input1 = input("Please enter a number:")
user_input2 = input("Please enter a second number")

def add(user_input1, user_input2):
    return f"The result of the addition is {float(user_input1) + float(user_input2)}"


print(add(user_input1, user_input2))