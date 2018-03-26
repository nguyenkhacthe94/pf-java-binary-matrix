import java.util.Scanner;

public class BinaryMatrix {
    public static void printMatrix(int n) {
        int array[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (int) (Math.random() * 2);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter size: ");
            n = input.nextInt();
            if (n < 1) System.out.print("Invalid size");
        } while (n < 1);
        printMatrix(n);
    }
}