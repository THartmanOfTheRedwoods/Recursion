public class ClassicRecursionExamples {

    /**
     * Factorial Calculation
     * @param n The number we wish to calculate the factorial for.
     * @return The factorial of the number n
     */
    public static int factorial(int n) {
        // Base case: If n is 0, the factorial is 1.
        if (n == 0) {
            return 1;
        }
        // Recursive case: Calculate factorial(n) = n * factorial(n-1).
        return n * factorial(n - 1);
    }

    /**
     * Fibonacci Sequence
     * @param n The n-th number in the fibonacci sequence
     * @return Returns the value of the n-th number in the fibonacci sequence.
     */
    public static int fibonacci(int n) {
        // Base cases: The Fibonacci of 0 is 0, and the Fibonacci of 1 is 1.
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        // Recursive case: Calculate Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2).
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * Sum of an Array
     * @param arr An array to be summed up
     * @param index The index of the array we are currently at in the call-stack.
     * @return The summation of all the numbers in an array from index to the end of the array.
     */
    public static int sumArray(int[] arr, int index) {
        // Base case: If the index is out of bounds, return 0.
        if (index < 0 || index >= arr.length) {
            return 0;
        }
        // Recursive case: Calculate sumArray(arr, index) = arr[index] + sumArray(arr, index+1).
        return arr[index] + sumArray(arr, index + 1);
    }

    /**
     * Binary Search in a Sorted Array
     * @param arr The array to search for a value in.
     * @param target The thing you are searching for.
     * @param left The index to the left.
     * @param right The index to the right.
     * @return The index where the target is found or -1
     */
    public static int binarySearch(int[] arr, int target, int left, int right) {
        // Base case: If the left index is greater than the right index, the target is not found.
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        // Base case: If the target is found at the middle index, return the index.
        if (arr[mid] == target) {
            return mid;
        }
        // Recursive case: Search in the left or right half based on the comparison with the target.
        if (arr[mid] > target) {
            return binarySearch(arr, target, left, mid - 1);
        } else {
            return binarySearch(arr, target, mid + 1, right);
        }
    }

    public static void main(String[] args) {
        // Example 1: Factorial Calculation
        int factorialResult = factorial(5);
        System.out.println("Factorial of 5 is: " + factorialResult);

        // Example 2: Fibonacci Sequence
        int fibonacciResult = fibonacci(7);
        System.out.println("Fibonacci number at position 7 is: " + fibonacciResult);

        // Example 3: Sum of an Array
        int[] arr = {1, 2, 3, 4, 5};
        int sumArrayResult = sumArray(arr, 0);
        System.out.println("Sum of the array is: " + sumArrayResult);

        // Example 4: Binary Search in a Sorted Array
        int[] sortedArr = {1, 3, 5, 7, 9, 11, 13};
        int target = 7;
        int binarySearchResult = binarySearch(sortedArr, target, 0, sortedArr.length - 1);
        if (binarySearchResult != -1) {
            System.out.println("Target " + target + " found at index: " + binarySearchResult);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    }
}
