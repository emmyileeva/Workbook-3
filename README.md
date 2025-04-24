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
- **New Feature (Exercise 1 Extension)**:
  - Prompts the user for a file to read and a filename to write the payroll report
  - Exports payroll results to either:
    - `.csv` file in the format `id|name|grossPay`
    - `.json` file as an array of JSON objects (if user inputs a `.json` filename)
- Great practice for:
  - Reading and writing files in different formats
  - Prompting users for input filenames
  - Using `BufferedWriter` or `PrintWriter` for output
  - Formatting data for both CSV and JSON outputs

### ✅ FormatDates
- Retrieves the current date and time and displays it in several formats:
  - `MM/dd/yyyy` → Example: `09/05/2021`
  - `yyyy-MM-dd` → Example: `2021-09-05`
  - `MMMM d, yyyy` → Example: `September 5, 2021`
  - `EEEE, MMM d, yyyy HH:mm` in **GMT** → Example: `Sunday, Sep 5, 2021 10:02`
  - `h:mm on dd-MMM-yyyy` in **local time zone** → Example: `5:02 on 05-Sep-2021`
- Great practice for:
  - Using `LocalDateTime`, `ZonedDateTime`, and `ZoneId`
  - Formatting dates with `DateTimeFormatter`
  - Displaying time in different time zones (GMT vs local)

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
- How to write structured output to `.csv` and `.json` formats
- How to prompt users for file input/output paths for flexible processing

