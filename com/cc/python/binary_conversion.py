user_input1 = input("Please enter an integer:")

def binary_conversion(user_input1):
    binary_digits = []
    
    if user_input1 > 15:
        return "Please enter a number from 0 - 15"
    
    for i in range(4):
        binary_digits.append(str(user_input1 % 2))
        user_input1 = user_input1 // 2

    binary_digits.reverse()
    return "The binary representation is: " + "".join(binary_digits)
print(binary_conversion(int(user_input1)))