# Task 1 - List Management

## 📋 Description

This program generates a third list (`list3`) using two predefined lists:  
- `list1` contains integers  
- `list2` contains strings  

The logic works as follows:  
For each element in `list1`, the program adds `1` to it and uses that value as an index to retrieve a string from `list2`.  
It then concatenates that string with the original number and stores it in `list3`.

---

## ⚠️ Error Handling

If a number in `list1` causes an index that is **outside the bounds of `list2`**, the program detects it and prints an error message instead of crashing.

### Example:

If `list1` contains a value like `100`, the program tries to access `list2[101]`, which is invalid.  
In such a case, the program prints:  Error: list2 does not contain index 101


---

## 🖼 Screenshot Example

Here is a screenshot showing the error handling in action (taken from the test page):

![Error Handling Example](screenshot is uploaded on mail)

---

## 🛠 How to Run

1. Open the project in IntelliJ IDEA.
2. Make sure the folder structure matches `src/oop/final/t1/ListManager.java`.
3. Run the `main` method in `ListManager`.

---

## ✅ Requirements Met

- Package: `oop.final.t1`
- JavaDoc and comments included
- Error handling implemented and demonstrated
- Markdown formatting in README
- Screenshot included

