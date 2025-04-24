# Workbook 3 – Java Practice Projects

This folder contains my Java exercises from Workbook 3.  

---

## 📘 Exercises Included

### ✅ FamousQuotes
- Stores an array of 10 motivational quotes
- Prompts the user to select a quote by entering a number between 1 and 10
- Includes error handling for invalid input (non-integer or out-of-range)
- Bonus features:
  - Option to view a **random quote** by entering 0
  - Prompts the user to continue or exit using a simple loop
- Great practice for:
  - Working with arrays and random selection
  - Using `Scanner` for user input
  - Exception handling with `try-catch`
  - Building simple loops and conditionals for user interaction

### ✅ BedtimeStories
- Loads and reads a text file line-by-line using `Scanner`
- Prompts the user to enter the name of a story file (like `goldilocks.txt`)
- Adds a line number to the beginning of each printed line
- Uses a separate `StoryReader` class to handle the file reading logic
- Includes error handling for file reading issues
- Great practice for:
  - Reading from files with `FileInputStream` and `Scanner`
  - Structuring programs with multiple classes
  - Numbering and printing lines for better readability
  - Handling exceptions and file-related errors

### ✅ PayrollCalculator
- Reads employee data from a CSV file using `BufferedReader`
- Each line in the file includes:
  - Employee ID, Name, Hours Worked, and Pay Rate
- Builds an `Employee` class with:
  - Fields for each piece of data
  - `getGrossPay()` method to calculate pay based on hours and rate
- Uses an `EmployeeReader` class to:
  - Read and parse each line of the file
  - Create and return a list of `Employee` objects
- Main app prints each employee’s:
  - ID, name, hours worked, pay rate, and gross pay
- Great practice for:
  - Reading CSV files with `BufferedReader`
  - Splitting string data using delimiters
  - Object-oriented programming with classes and methods
  - Storing and accessing object data using lists

---

## ✨ What I Learned
- How to store and access multiple strings using arrays
- How to use `Scanner` to gather user input from the terminal
- How to use `Random` to generate a random number
- How to use `try-catch` to handle exceptions like invalid input
- How to create a loop that lets the user interact with the program more than once
- How to make small programs more user-friendly by adding retry options and messages
- How to read a text file line by line using `Scanner` and `FileInputStream`
- How to break code into multiple classes for clarity and reuse
- How to read structured data from a `.csv` file using `BufferedReader`
- How to split data using a delimiter like `|` and convert to appropriate types
- How to build and work with `List` collections of objects in Java
