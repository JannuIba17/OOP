# Java OOPS, Stream API, Multithreading and DSA – README

A structured, hands-on Java training curriculum designed for beginners and intermediate learners. This course covers Java fundamentals, OOP, collections, generics, debugging, interfaces, and real-world application structuring. Each session includes theory, demonstration, and lab exercises.

---

## 📘 Course Overview

This training aims to build strong foundational and intermediate Java development skills, focusing on practical problem-solving, clean coding habits, and understanding the internals of the JVM, memory model, and OOP principles.

---

## 🧩 Session Breakdown

---

## Session 1: Java Ecosystem Setup & “Hello World”

### Concepts Covered
- What Java is used for in modern enterprise systems
- JVM, JRE, JDK differences
- Platform independence & bytecode
- Setting up JDK 17+ and IntelliJ IDEA
- Git installation and first GitHub push
- javac and java commands

### Lab
- Create HelloWorld.java
- Print name, course name, date
- Compile via CLI and run inside IDE

---

## Session 2: Variables, Data Types & Control Flow

### Concepts Covered
- Primitive vs reference types
- Stack memory diagrams
- Conditionals and loops
- Scope and lifetime

### Lab
- Build a Simple Interest Calculator
- Use loops and conditionals
- Use formatted output with printf()

---

## Session 3: Methods & Parameter Passing

### Concepts Covered
- Why methods exist
- Stack frames
- Pass-by-value explained
- Method overloading

### Lab
- Create MathUtility with overloads
- Test them inside main()

---

## Session 4: Classes, Objects & Encapsulation

### Concepts Covered
- OOP basics
- Encapsulation
- UML for Student class
- Getters, setters, constructors
- Access modifiers

### Lab
- Implement Student class
- Create multiple objects
- Store in an array & compute averages

---

## Session 5: Inheritance & Polymorphism

### Concepts Covered
- is-a vs has-a
- Method overriding
- Dynamic dispatch
- super and constructor chaining

### Lab
- Create Employee, Manager, Intern
- Demonstrate polymorphism in an array

---

## Session 6: Abstraction & Interfaces

### Concepts Covered
- Abstract classes
- Interfaces and multiple inheritance
- Loose coupling through abstraction

### Lab
- Create Payable interface
- Implement in Contractor and FullTimeEmployee
- Demonstrate interface polymorphism

---

## Session 7: Exception Handling & Debugging

### Concepts Covered
- Exception hierarchy
- Checked vs unchecked
- try-catch-finally
- Custom exception
- Debugging: stepping, breakpoints, variable inspection

### Lab
- BankAccount with InsufficientFundsException
- Debug variable states and screenshots

---

## Session 8: The Collections Framework

### Concepts Covered
- Array limitations
- ArrayList, LinkedList, HashSet, HashMap
- Iterators and for-each loops
- Hashing and duplicates

### Lab
- Word-frequency counter using HashMap
- Compare performance of ArrayList vs LinkedList

---

## Session 9: Generics & Wrapper Classes

### Concepts Covered
- Need for generics
- Generic classes & methods
- Type safety
- Autoboxing and unboxing
- Type erasure

### Lab
- Implement generic Pair<T1, T2>
- Swap values and test with different types

---

## Session 10: Integration & Code Review

### Concepts Covered
- Architecture review
- Code walkthrough
- Naming conventions
- Git commit best practices

### Lab
- Peer review of mini-projects
- Architecture presentation

---

## 🧵 JVM Concurrency – Detailed Learning Outcomes

By the end of this unit, learners will be able to:

1. **Explain core execution concepts**  
   Clearly differentiate between:
   - **Process** – an independent program with its own memory.
   - **Thread** – a lightweight execution unit inside a process.
   - **Task** – a logical unit of work scheduled on a thread.  
   Learners will understand why multi-threading is used and where it is appropriate.

2. **Implement parallel execution**  
   Use Java's threading APIs to run code concurrently:
   - Creating threads using the `Thread` class
   - Using `Runnable` for lightweight jobs
   - Using `Callable` + `Future` to return results from tasks

3. **Coordinate threads safely**  
   Prevent race conditions using:
   - `synchronized` methods/blocks  
   - Reentrant locks (`ReentrantLock`, `ReadWriteLock`)  
   - Concurrent collections such as `ConcurrentHashMap`, `CopyOnWriteArrayList`, and `BlockingQueue`

4. **Manage concurrency using the Executor Framework**  
   Use:
   - `ExecutorService`  
   - Fixed, cached, and scheduled thread pools  
   Learners will understand queueing, task submission, and graceful shutdown.

5. **Use the Stream API and functional constructs**  
   Apply:
   - Lambdas
   - Functional interfaces (`Function`, `Predicate`, `Supplier`, etc.)
   - Parallel streams (and when to avoid them)

6. **Write safe, deadlock-free code**  
   Understand:
   - The causes of race conditions
   - Deadlock scenarios (circular wait)
   - Techniques to avoid deadlocks (ordering locks, using timeouts, minimizing shared state)

7. **Benchmark and profile concurrent programs**  
   Use tools and techniques to:
   - Measure performance
   - Compare single-threaded vs multi-threaded execution
   - Interpret CPU utilisation, thread dumps, and contention hotspots

---

## 🧠 Data Structures & Algorithms (DSA) – Detailed Learning Outcomes

Learners will be able to:

1. **Analyse time and space complexity deeply**  
   Explain:
   - Big-O, Big-Theta, Big-Omega
   - Why some structures are faster for reads/writes/searches  
   Compare complexity trade-offs between arrays, lists, trees, stacks, queues, and hashes.

2. **Implement foundational data structures from scratch in Java**  
   Build internal understanding by coding:
   - **Arrays** (dynamic resizing, traversal, searching)
   - **Stacks** (push/pop, call-stack simulation)
   - **Queues** (circular queues, priority queues conceptually)
   - **Linked Lists** (single, double, operations at head/middle/tail)
   - **Hash Maps** (hash functions, collision resolution with chaining/open addressing)

3. **Use recursion and iteration effectively**  
   Understand:
   - Base conditions, recursion depth, stack overflow scenarios
   - Converting recursive algorithms into iterative versions
   - Templates like DFS, backtracking, divide-and-conquer

4. **Evaluate algorithm efficiency using Big-O notation**  
   Learners will measure and explain the cost of:
   - Searching  
   - Sorting  
   - Traversing structures  
   - Adding/removing elements  
   And justify why certain approaches scale better with input size.

5. **Apply problem-solving heuristics**  
   Use systematic thinking tools:
   - **Decomposition** – breaking problems into smaller tasks  
   - **Pattern Recognition** – identifying reusable algorithmic shapes  
   - **Iteration Refinement** – improving a naive solution step-by-step  
   - **Analogy** – using known solutions to approach new problems  

6. **Write clean, production-quality solutions**  
   Demonstrate:
   - Proper naming, modularity, and comments  
   - Writing unit tests  
   - Submitting well-organised GitHub repositories  
   - Using Java best practices for clarity and maintainability

7. **Solve real-world algorithmic problems**  
   Apply algorithms to practical cases:
   - Scheduling  
   - Searching and indexing  
   - Memory-efficient data handling  
   - Optimisation problems  
   Learners will be able to defend their solution choices based on complexity and readability.

