# Import pandas
import pandas
from pandas import ExcelWriter, DataFrame

# Create a dictionary that will be used to create the DataFrame
data = {
    'FirstName':["Satvik", "Avinash", "Lahri"],
    'LastName':["Shah", "Kati", "Rath"],
    'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
    'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}

# Create the DataFrame that will be written to the excel file
df = pandas.DataFrame(data)

# Print the dataframe
# Write the dataframe to a Excel file
writer = ExcelWriter("../inputs/sample.xlsx")
df.to_excel(writer, "Sheet1", index=False)
writer._save()
sample = pandas.read_excel("../inputs/sample.xlsx", sheet_name="Sheet1")
print(sample)
print("................")
print("Number of rows:", sample.shape[0])
print("................")
print("Number of columns:", sample.shape[1])
print(sample["Email"])
print("Firstname................")
print(sample.sort_values(["FirstName"]))