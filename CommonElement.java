import java.util.Scanner;

public class CommonElement {
    public static void findCommonElements(int[] ar1, int[] ar2, int[] ar3) {
        int i = 0, j = 0, k = 0;
        boolean foundCommon = false;

        while (i < ar1.length && j < ar2.length && k < ar3.length) {
            if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) {
                foundCommon = true;
                System.out.print(ar1[i] + " ");
                i++;
                j++;
                k++;
            } else if (ar1[i] < ar2[j]) {
                i++;
            } else if (ar2[j] < ar3[k]) {
                j++;
            } else {
                k++;
            }
        }

        if (!foundCommon) {
            System.out.println("No common elements found");
        } else {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the size of first array: ");
        int n1 = scanner.nextInt();
        int[] ar1 = new int[n1];
        System.out.println("Enter elements of first array (sorted): ");
        for (int i = 0; i < n1; i++) {
            ar1[i] = scanner.nextInt();
        }

        System.out.println("Enter the size of second array: ");
        int n2 = scanner.nextInt();
        int[] ar2 = new int[n2];
        System.out.println("Enter elements of second array (sorted): ");
        for (int i = 0; i < n2; i++) {
            ar2[i] = scanner.nextInt();
        }

        System.out.println("Enter the size of third array: ");
        int n3 = scanner.nextInt();
        int[] ar3 = new int[n3];
        System.out.println("Enter elements of third array (sorted): ");
        for (int i = 0; i < n3; i++) {
            ar3[i] = scanner.nextInt();
        }

        findCommonElements(ar1, ar2, ar3);
        scanner.close();
    }
}
