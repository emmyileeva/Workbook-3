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
  -  Great practice for:
- Working with file writing using `FileWriter` and `BufferedWriter`
- Using timestamps with `LocalDateTime` and `DateTimeFormatter`
- Logging user input and actions to a text file
- Building simple loops and conditional logic to handle user flow
 
### ✅ SearchEngineLogger
- Simulates a simple search engine with logging
- Logs key user actions to a file named `logs.txt`:
  - When the application is launched
  - When a user performs a search (logs the search term)
  - When the user exits the application
- Uses date and time stamps in the format: `yyyy-MM-dd HH:mm:ss`

### ✅ SearchInventory
- Manages and searches product inventory using `ArrayList`
- Loads product data from a CSV file using `BufferedReader`
  - Each product has an ID, name, and price
- Displays a menu to the user:
  1. List all products (sorted by name)
  2. Look up a product by ID
  3. Find products within a price range
  4. Add a new product to the list
  5. Quit the application
- Implements:
  - `Product` class to represent individual products
  - `InventoryManager` class to handle inventory operations
  - `Store` class for the menu loop and user interaction
- Great practice for:
  - File input with parsing using delimiters
  - Working with `ArrayList` and sorting collections
  - Creating a modular program with multiple Java classes
  - Using conditionals, loops, and menu-based interaction
 
### ✅ SearchInventoryMap
- Similar to the earlier inventory app, but uses a `Map` instead of an `ArrayList`
- Loads product data from a CSV file into a `HashMap` with the product name as the key
- Allows users to:
  - View a list of all available product names
  - Search for a product by name (case-insensitive)
  - View product details like ID and price
- Bonus feature: lets the user keep searching as long as they answer "yes"
- Great practice for:
  - Using `HashMap` for fast key-based lookups
  - Reading and parsing data from CSV files
  - Building loop-driven user interactions with conditional logic

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
- How to write output to files in both `.csv` and `.json` formats
- How to format and display dates and times using different patterns and time zones
- How to write logs with timestamps to track user actions
- How to sort `ArrayList` items using custom `Comparator`
- How to implement menu-driven applications for real-world scenarios

