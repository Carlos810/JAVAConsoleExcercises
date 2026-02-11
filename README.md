# Custom Console Menu – Java

A modular **console-based menu system in Java** that allows users to execute different exercises from a dynamic list of options.

This project demonstrates:

- Clean separation of responsibilities
- Basic control flow with `switch`
- User input handling via `Scanner`
- Modular exercise execution
- Custom exception handling

---

## Overview

The `PrintOptions` class dynamically renders a menu from an `ArrayList<String>` and executes the selected option using a `switch` statement.

Each menu option triggers a different exercise class located in separate packages.

---

## Project Structure (Conceptual)

```
customMenuConsole/
 └── PrintOptions.java

Exceptions/
 └── InvalidUserInputException.java

JavaExcercises/
 ├── Calculator.java
 ├── ModuleOperator.java
 ├── IsBigerOrNot.java
 ├── OneTOFiniteNumber.java
 ├── MatTables.java
 ├── EvenBetweenOneToOneHundred.java
 ├── AddAndPrint.java
 ├── IsThatYourNumber.java
 └── InteractiveMenu.java

Saludo_Scanner/
 └── Greetings.java

Statics/
 └── Console_Methods.java
```

---

## Core Responsibilities

### `PrintOptions`

- Validates if the menu list contains elements
- Prints numbered options dynamically
- Captures user input
- Converts input to integer
- Executes corresponding exercise

---

## Code Breakdown

### Method Signature

```java
public void Show(ArrayList<String> lista) throws InvalidUserInputException
```

- Accepts a dynamic list of menu options
- Throws a custom exception if input validation fails elsewhere

---

### Menu Rendering Logic

```java
for(int i = 0; i < lista.size(); i++){
    PrintMessage("  [" + (i + 1) + "] " + lista.get(i).toUpperCase());
}
```

- Dynamically generates numbered menu
- Converts options to uppercase for consistency

---

### Input Handling

```java
String menuOption = new Scanner(System.in).nextLine().trim();
int numberOption = Integer.parseInt(menuOption);
```

- Reads user input
- Trims whitespace
- Parses to integer

**Potential improvement:**

- Add validation before parsing
- Handle `NumberFormatException`

---

### Execution Flow

```java
switch(numberOption){
    case 1:
        Greetings.Excecute();
        break;
    case 2:
        new Calculator().ProcessNumbers();
        break;
    // Additional cases...
    default:
        PrintMessage("Invalid option selected.");
        break;
}
```

Each case delegates responsibility to a specific class.

This follows:

- Single Responsibility Principle
- Modular execution design
- Clear separation of concerns

---

## Available Exercises

| Option | Class                          | Description                         |
|--------|--------------------------------|-------------------------------------|
| 1      | `Greetings`                    | Displays greeting message           |
| 2      | `Calculator`                   | Performs arithmetic operations      |
| 3      | `ModuleOperator`               | Determines odd or even              |
| 4      | `IsBigerOrNot`                 | Compares two numbers                |
| 5      | `OneTOFiniteNumber`            | Prints sequence of numbers          |
| 6      | `MatTables`                    | Generates multiplication tables     |
| 7      | `EvenBetweenOneToOneHundred`   | Prints even numbers 1–100           |
| 8      | `AddAndPrint`                  | Adds numbers and prints result      |
| 9      | `IsThatYourNumber`             | Guess-the-number logic              |
| 10     | `InteractiveMenu`              | Nested interactive menu             |

---

## Design Characteristics

- Dynamic menu rendering
- Modular class delegation
- Custom exception support
- Clear console messaging
- Simple and readable structure

---

## Possible Improvements

- Replace `switch` with:
    - Strategy Pattern
    - Command Pattern
- Add input validation wrapper
- Prevent invalid numeric selections
- Reuse a single `Scanner` instance

---

## Key Java Concepts Demonstrated

- Collections (`ArrayList`)
- Control structures (`switch`)
- Exception propagation
- Object instantiation
- Package organization
- Static method usage
- Console I/O

---

## Educational Purpose

This project is ideal for:

- Java beginners practicing modular design
- Understanding dynamic menu systems
- Learning separation of concerns
- Practicing console application architecture

---

## How to Run

1. Ensure all packages are properly structured.
2. Compile the project.
3. Call:

```java
new PrintOptions().Show(menuList);
```

Where `menuList` is:

```java
ArrayList<String> menuList = new ArrayList<>();
menuList.add("Greetings");
menuList.add("Calculator");
// Add additional options...
```

---

## License

Educational use only.
