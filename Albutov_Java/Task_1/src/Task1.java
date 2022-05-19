import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.print("Введите число: ");
            int num = in.nextInt();
            if (num > 7) {
                System.out.println("Привет");
                flag = false;
            } else if (num < 7) {
                System.out.println("Попробуй ввести другое число");
            } else if (num == 7) {
                System.out.println("Попробуй ввести другое число");
            }

        }
        in.close();
    }
}
