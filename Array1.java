import java.util.HashSet;
import java.util.Scanner;

public class Array1 {
    private int[] arr;
    private int size;

    public Array1(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void readUniqueArray(Scanner sc) {
        HashSet<Integer> used = new HashSet<>();

        System.out.println("Enter " + size + " unique elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            int value = sc.nextInt();

            while (used.contains(value)) {
                System.out.print("Duplicate found! Enter a different value: ");
                value = sc.nextInt();
            }

            arr[i] = value;
            used.add(value);
        }
    }

    public void displayArray() {
        System.out.println("Array elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int sumArray() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public int sumRandomElements() {
        int count = (Math.random() < 0.5) ? 2 : 4;
        int[] indexes = new int[count];

        for (int x = 0; x < count; x++) {
            int randomIndex;
            do {
                randomIndex = (int) (Math.random() * size);
            } while (contains(indexes, randomIndex, x));
            indexes[x] = randomIndex;
        }

        System.out.print("Randomly selected elements: ");
        for (int x = 0; x < count; x++) {
            System.out.print(arr[indexes[x]] + " ");
        }
        System.out.println();

        int sum = 0;
        for (int x = 0; x < count; x++) {
            sum += arr[indexes[x]];
        }
        return sum;
    }

    private boolean contains(int[] arr, int value, int currentLength) {
        for (int i = 0; i < currentLength; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        Array1 obj = new Array1(size);
        obj.readUniqueArray(sc);
        obj.displayArray();

        System.out.println("Total sum of all elements = " + obj.sumArray());
        System.out.println("Selected random sum = " + obj.sumRandomElements());

        sc.close();
    }
}