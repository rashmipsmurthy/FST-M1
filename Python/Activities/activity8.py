# Given list of numbers
#numList = [10, 20, 30, 40, 10]

# Taking input as a string using input function.
input_str = input("Enter elements of the list separated by space: ")
# Converting input string to a list of integers.
my_list = input_str. split()
my_list = [int(num) for num in my_list]
# Printing the list.
print("List:", my_list)

#print("Given list is ", numList)

# Get first element in list
firstElement = my_list[0]
# Get last element in list
lastElement = my_list[-1]

# Check if first and last element are equal
if (firstElement == lastElement):
    print(True)
else:
    print(False)