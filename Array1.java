import java.util.Scanner;

public class Array1 {
    private int[] arr;
    private int size;
 
    public Array1(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void readArray(Scanner sc) {
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
    }

    public void displayArray() {
        System.out.println("Array elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        Array1 obj = new Array1(size);
        obj.readArray(sc);
        obj.displayArray();

        sc.close();
    }
}