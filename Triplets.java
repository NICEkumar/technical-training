import java.util.Arrays;
import java.util.Scanner;

public class Triplets {
    public static void findTripletSum(int[] arr, int sum) {
        Arrays.sort(arr); // Sort the array

        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                int currentSum = arr[i] + arr[left] + arr[right];

                if (currentSum == sum) {
                    System.out.println(arr[i] + ", " + arr[left] + ", " + arr[right]);
                    return;
                } else if (currentSum < sum) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        System.out.println("No triplet found with the given sum.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter the target sum: ");
        int targetSum = scanner.nextInt();

        findTripletSum(array, targetSum);

        scanner.close();
    }
}
