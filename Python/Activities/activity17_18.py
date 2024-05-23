# Import pandas
import pandas as pd

# Create a Dictionary that will hold our data
data = {
    "Usernames": ["admin", "Charles", "Deku"],
    "Passwords": ["password", "Charl13", "AllMight"]
}

# Create a DataFrame using that data
dataframe = pd.DataFrame(data)

# Print the DataFrame
print(dataframe)

"""
 Write the DataFrame to a CSV file
 To avoid writing the index numbers to the file as well
 the index property is set to false
"""
#dataframe.to_csv("../inputs/cred.csv", index=False)
dataframe.to_csv("../inputs/cred.csv", index=False)

#rea from the file
cred = pd.read_csv("../inputs/cred.csv")
print(".......................")
print(cred["Usernames"][1], "Password", cred["Passwords"])
print(".......................")
print(dataframe.sort_values( "Usernames", ascending=True ))
print(".......................")
print(dataframe.sort_values('Passwords', ascending=False))

print(dataframe.sort_values('Passwords', ascending=True))
