# Java Labs

Lab, tutorial and lecture exercises from my university Java course, kept in one place.

## Contents

| Folder | Topic |
|---|---|
| `lab1`, `lab4`, `laps` | Weekly lab tasks |
| `lec03`, `lec004` | Lecture exercises |
| `tut07`, `tut08` | Tutorial tasks (including `ArrayList` basics) |
| `task04`, `task2` | Standalone tasks |
| `ex1` | Exercise 1 |
| `game` | Tic-tac-toe (**work in progress**, does not compile yet: the board array is never declared) |

## Run it

Requires a JDK (8 or newer). Files in the same folder share a package, so compile a folder together:

```bash
javac -d bin src/lab1/*.java
java -cp bin lab1.task2
```

Or import the `src` folder into Eclipse / IntelliJ and run any class directly.

## Notes

These are learning exercises, not polished projects. For larger work see my other repositories.
