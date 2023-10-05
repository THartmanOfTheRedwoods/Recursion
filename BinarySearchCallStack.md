# Binary Search Call Stack

```bash
binarySearch({1, 3, 5, 7, 9, 11, 13}, 7, 0, 6)
|-- binarySearch({1, 3, 5, 7, 9, 11, 13}, 7, 0, 2)
|   |-- binarySearch({1, 3, 5, 7, 9, 11, 13}, 7, 1, 2)
|   |   |-- binarySearch({1, 3, 5, 7, 9, 11, 13}, 7, 2, 2) // Index out of bounds
|   |   |   |-- Return -1
|   |   |
|   |   |-- Return 2
|   |
|   |-- Return 2
|
|-- Return 3
```