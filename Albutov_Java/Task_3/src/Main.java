import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("¬ведите размер массива: ");
        int size = in.nextInt();
        int[] array = new int[size];
        System.out.print("¬ведите элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (array[i] % 3 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}