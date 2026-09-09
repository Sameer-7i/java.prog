import java.util.Scanner;

class Uniquearray {
    private int[] arr;
    private int ncount;
    private final Scanner sc;

    public Uniquearray(int ncount) {
        this.ncount = ncount;
        arr = new int[ncount];
        sc = new Scanner(System.in);
    }

    void readArray() {
        System.out.println("Enter " + ncount + " numbers separated by spaces:");
        for (int i = 0; i < ncount; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void displayArray() {
        boolean[] grouped = new boolean[ncount];

        for (int i = 0; i < ncount; i++) {
            if (grouped[i]) {
                continue;
            }

            int gsize = 0;
            for (int j = i; j < ncount; j++) {
                if (arr[i] == arr[j]) {
                    gsize++;
                    grouped[j] = true;
                }
            }

            System.out.println("Group " + arr[i] + ": " + gsize + " element(s)");
        }
    }

    public static void main(String[] args) {
        Uniquearray ua = new Uniquearray(10);
        ua.readArray();
        ua.displayArray();
    }
}
