##Identify Courses

##Problem Statement: Identify Courses
This project aims to automate the search and display of web development courses tailored for beginners in the English language, along with extracting language learning options and interacting with an enterprise form on the suggested website, Coursera.org. The tasks are divided into specific steps as outlined below:
 
##Detailed Description
**Task 1: Search for Web Development Courses**
- Objective: Search for web development courses for beginners available in English and extract the following details for the first two courses:
Course Name
Total Learning Hours
Rating

**Task 2: Extract Language Learning Options**
- Objective: Extract all the available languages and their different levels along with the total count of each level. Display the extracted information.

**Task 3: Interact with Enterprise Form**
- Objective: On the Home page, navigate to the "For Enterprise" section, locate the "Courses for Campus" under Products, fill out the "Ready to transform" form with at least one invalid input (e.g., an invalid email), capture the error message displayed, and output the message.
 
## Libraries and Dependencies

Maven Repository: Maven 3.12.1

TestNG: 7.10.2

Extent Report: 5.1.1

Selenium WebDriver: 4.21.0

##Key Automation Scope
**The project will involve the following automation steps and techniques:**
Search Option:
 
Utilizing the search functionality on the website to find relevant courses.
Extract Multiple Dropdown List Items & Store in Collections:
 
Extracting items from dropdown lists and storing them in appropriate data structures for further processing.
Navigating Back to Home Page:
 
Filling Form:
 
Automating the process of filling forms with various input types on the web page.
Capture Warning Message:
 
Detecting and capturing error or warning messages when invalid inputs are provided in forms.
Scrolling Down in Web Page:
 
Scrolling through web pages to access elements that are not visible in the initial view.
Steps to Execute:

- Step 1: Search and Display Web Development Courses
Navigate to the suggested website (e.g., Coursera.org).
Search for web development courses that are for beginners and offered in English.
Extract the course name, total learning hours, and rating for the first two courses displayed.

- Step 2: Extract Language Learning Options
Locate the section for language learning on the website.
Extract all the available languages and their levels.
Count the total number of courses for each level and display the results.

- Step 3: Interact with Enterprise Form
Go to the home page and navigate to the "For Enterprise" section.
Select "Courses for Campus" under Products.
Fill out the "Ready to transform" form with at least one invalid input.
Capture the error message displayed and output the message.

**Example Output:**

- Web Development Courses (Sample Output)

Course 1:
 
Name: "Introduction to Web Development"

Total Learning Hours: 20 hours

Rating: 4.8.

Course 2:
 
Name: "Beginner's Guide to Web Development"

Total Learning Hours: 15 hours

Rating: 4.7

Language Learning Options (Sample Output)

Language: English
 
Beginner: 10 courses

Intermediate: 8 courses

Advanced: 5 courses


Enterprise Form Error Message (Sample Output)

Error Message: "Please enter a valid email address."

## Screenshots and Data Logging

Throughout the testing process:
- Take necessary screenshots for all test cases to document and validate each step.
- Print all relevant data in the console to ensure transparency and accuracy in the validation process.

## Challenges and Solutions

 **Challenges:**
  - Handling dynamic web elements.
  - Ensuring compatibility across different browsers.

 **Solutions:**
  - Implement robust automation scripts to handle dynamic elements.
  - Conduct thorough parallel testing.
  - Use appropriate methods to handle alerts and windows.

##Contributors

Shreyasi Mondal – 2332934
