# Given tuple
#tuple = input("Enter the numbers ")
#for i in range(1,n)

input_str = input("Enter elements of the list separated by space: ")
# Converting input string to a list of integers.
my_list = input_str. split()
my_list = [int(num) for num in my_list]
# Printing the list.
print("List:", my_list)

# Print elements that are divisible by 5
print("Elements that are divisible by 5:")
for num in my_list:
    if (num % 5 == 0):
        print(num)