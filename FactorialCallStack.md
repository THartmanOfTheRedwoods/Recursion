# Factorial Call-Stack

```bash
factorial(5)
|-- factorial(4)
|   |-- factorial(3)
|   |   |-- factorial(2)
|   |   |   |-- factorial(1)
|   |   |   |   |-- factorial(0)
|   |   |   |   |   |-- factorial(0) = 1
|   |   |   |   |
|   |   |   |   |-- factorial(1) = 1
|   |   |   |
|   |   |   |-- factorial(2) = 2
|   |   |
|   |   |-- factorial(3) = 6
|   |
|   |-- factorial(4) = 24
|
|-- factorial(5) = 120
```