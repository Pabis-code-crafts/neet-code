# What is **O(?)** — Big-O notation?

“Big-O” is a way to measure **how fast an algorithm grows** as the input gets larger.

It doesn’t measure seconds —

it measures **how many operations** it does compared to the input size.

Let’s look at basic ones:

### **O(n)**

Time grows *linearly* with the number of elements.

If you double the input, the work doubles.

Example:

Going through the list **once**.

---

### **O(n²)**

Time grows with **n × n**.

If you double the input, the work becomes 4× more.

Example:

Two nested loops (checking all pairs).

That’s brute force.

---

### **O(1)**

Constant time — super fast, speed doesn’t change with input size.

Example: checking inside a HashSet.