# Sum Array Call Stack

```bash
sumArray({1, 2, 3, 4, 5}, 0)
|-- sumArray({1, 2, 3, 4, 5}, 1)
|   |-- sumArray({1, 2, 3, 4, 5}, 2)
|   |   |-- sumArray({1, 2, 3, 4, 5}, 3)
|   |   |   |-- sumArray({1, 2, 3, 4, 5}, 4)
|   |   |   |   |-- sumArray({1, 2, 3, 4, 5}, 5)
|   |   |   |   |   |-- Return 0
|   |   |   |   |
|   |   |   |   |-- Return 5
|   |   |   |
|   |   |   |-- Return 9
|   |   |
|   |   |-- Return 12
|   |
|   |-- Return 14
|
|-- Return 15
```