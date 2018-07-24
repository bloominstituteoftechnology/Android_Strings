# AndroidStrings

This project will help you practice the skills and concepts you learned related to strings in Java. For this project you'll build an app with a button, a label and an edit text field. The user will enter a string in the edit text field. When they tap the button, you're app should check to see if the string may entered is the palindrome. If it is a palindrome, it should update a label to say "[string] is a palindrome!" where `[string]` is the string the user entered.

> A palindrome is a word or phrase that is the same whether spelled forward or backwards, for example `madam`, `racecar`, or `was it a rat i saw`.

### Create an Android Studio Project

1. Create a new Android Studio project
2. Name the project "Palindrome Checker"
3. Select "Empty Activity" for your first activity.

### Add UI Elements to activity_main.xml

1. Open the app's activity_main.xml file.
2. Change the parent layout to a linear layout.
3. Add an edit text field to the main screen
4. Add a button to the main screen
5. Make the button's text "Palindrome?"
6. Add a text view to the screen.
7. Add ids to all elements.

### Create Listeners

1. Create an onClickListener for the button in the MainActivity.java file.

### Write A Palindrome Checker Function

2. In the MainActivity.java file, create a function called `isPalindrome()`. It should take a single string as an argument, and return a `Boolean`.
3. Write the `isPalindrome()` function. It should return true if the passed in string is a palindrome, false otherwise.

> Hint: You can access the end of a string using `myString.length - 1` as the index for the `charAt()` method. This may help you implement `isPalindrome()`.

### Build, Run, and Test Your App

1. Build and run your app using your preferred testing environment.
2. Enter various strings, some palindromes, some not, into the text field and make sure the palindrome checking works.

### Bonus

If you finish and want another challenge try making the app so that it ignores capitalization, punctuation and spaces when checking if a string is a palindrome. For example, "Was it a car or a cat I saw?" is a palindrome if you ignore the fact that the first letter is capitalized and that there's a question mark at the end.
