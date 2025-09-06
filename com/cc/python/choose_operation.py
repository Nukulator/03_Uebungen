operation = input("What operation should be executed? (1: add, 2: subtract, 3: multiply, 4: divide)")
user_input1 = input("Please enter a number")
user_input2 = input("Please enter a second number")

def choose_operation(user_input1, user_input2):
    if operation == "1" or operation == "add":
        from add import add
        return add(user_input1, user_input2)
    if operation == "2" or operation == "subtract":
        return "The result of the subtraction is: " + str(round(float(user_input1) - float(user_input2), 5))
    if operation == "3" or operation == "multiply":
        return "The result of the multiplication is: " + str(round(float(user_input1) * float(user_input2), 5))
    if operation == "4" or operation == "divide":
        return "The result of the division is: " + str(round(float(user_input1) / float(user_input2), 5))
    return "Please enter a valid operation."

print(choose_operation(user_input1, user_input2))