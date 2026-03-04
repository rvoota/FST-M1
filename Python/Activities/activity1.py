from datetime import datetime
name = input("enter your name: ")
age = int(input("enter your age: "))

print(name)
print(age)

current_year = datetime.now().year
year_turn_100 = current_year + (100 - age)

print(f"Hello {name}, you will turn 100 years old in the year {year_turn_100}")