# Kotlin `map()` Function Behavior

This example demonstrates a common misconception about the `map()` function in Kotlin.  Unlike some other languages, Kotlin's `map()` function is immutable; it returns a *new* list containing the transformed elements without altering the original list.

This repository contains two Kotlin files: `bug.kt` showcasing the unexpected behavior, and `bugSolution.kt` illustrating how to achieve the desired in-place modification.

## How to Reproduce the Bug

1. Clone this repository.
2. Run `bug.kt`. Observe that even after applying `map()`, the `mutableList` remains unchanged. This is because `map()` produces a new list.