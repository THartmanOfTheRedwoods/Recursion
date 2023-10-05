# Fibonacci Call-Stack

```bash
fibonacci(7)
|-- fibonacci(6)
|   |-- fibonacci(5)
|   |   |-- fibonacci(4)
|   |   |   |-- fibonacci(3)
|   |   |   |   |-- fibonacci(2)
|   |   |   |   |   |-- fibonacci(1) = 1
|   |   |   |   |   |-- fibonacci(0) = 1
|   |   |   |   |   
|   |   |   |   |-- fibonacci(1) = 1
|   |   |   |   
|   |   |   |-- fibonacci(2)
|   |   |   |   |-- fibonacci(1) = 1
|   |   |   |   |-- fibonacci(0) = 1
|   |   |   
|   |   |   = 2
|   |   
|   |   |-- fibonacci(4)
|   |   |   |-- fibonacci(3)
|   |   |   |   |-- fibonacci(2)
|   |   |   |   |   |-- fibonacci(1) = 1
|   |   |   |   |   |-- fibonacci(0) = 1
|   |   |   |   |   
|   |   |   |   |-- fibonacci(1) = 1
|   |   |   |   
|   |   |   |-- fibonacci(2)
|   |   |   |   |-- fibonacci(1) = 1
|   |   |   |   |-- fibonacci(0) = 1
|   |   |   
|   |   |   = 3
|   |   
|   |   = 5
|   
|   |-- fibonacci(5)
|   |   |-- fibonacci(4)
|   |   |   |-- fibonacci(3)
|   |   |   |   |-- fibonacci(2)
|   |   |   |   |   |-- fibonacci(1) = 1
|   |   |   |   |   |-- fibonacci(0) = 1
|   |   |   |   |   
|   |   |   |   |-- fibonacci(1) = 1
|   |   |   |   
|   |   |   |-- fibonacci(2)
|   |   |   |   |-- fibonacci(1) = 1
|   |   |   |   |-- fibonacci(0) = 1
|   |   |   
|   |   |   = 3
|   |   
|   |   |-- fibonacci(3)
|   |   |   |-- fibonacci(2)
|   |   |   |   |-- fibonacci(1) = 1
|   |   |   |   |-- fibonacci(0) = 1
|   |   |   |   
|   |   |   |-- fibonacci(1) = 1
|   |   |   
|   |   = 4
|   
|   = 8
|   
|-- fibonacci(5)
|   |-- fibonacci(4)
|   |   |-- fibonacci(3)
|   |   |   |-- fibonacci(2)
|   |   |   |   |-- fibonacci(1) = 1
|   |   |   |   |-- fibonacci(0) = 1
|   |   |   |   
|   |   |   |-- fibonacci(1) = 1
|   |   |   
|   |   |-- fibonacci(2)
|   |   |   |-- fibonacci(1) = 1
|   |   |   |-- fibonacci(0) = 1
|   |   |   
|   |   = 3
|   |   
|   |-- fibonacci(3)
|   |   |-- fibonacci(2)
|   |   |   |-- fibonacci(1) = 1
|   |   |   |-- fibonacci(0) = 1
|   |   |   
|   |   |-- fibonacci(1) = 1
|   |   
|   = 4
|   
= 13
```