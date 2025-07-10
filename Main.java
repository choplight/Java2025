import java.util.Arrays;

// Step 1: Base class with sorting method
class SortNumbers {
    public void sortArray(int[] numbers) {
        Arrays.sort(numbers);
        System.out.print("Sorted Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println(); // for line break
    }
}

// Step 2: Child class that adds numbers after sorting
class AddNumbers extends SortNumbers {
    public void addNumbers(int[] numbers) {
        // Call sorting method from base class
        sortArray(numbers);

        // Now add the sorted numbers
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Sum of Numbers: " + sum);
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        int[] nums = {12, 2, 9, 1, 3};

        // Create object of child class
        AddNumbers obj = new AddNumbers();

        // Call the method that does both sorting and addition
        obj.addNumbers(nums);
    }
}
