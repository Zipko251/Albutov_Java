import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.print("Введите имя: ");
            String name = in.nextLine();
            if (Objects.equals(name, "Вячеслав")){
                System.out.println("Привет, " + name);
                flag = false;
            }
            else if (Objects.equals(name, "вячеслав")) {
                System.out.println("Попробуйте с большой буквы");
            }
            else if (!Objects.equals(name, "Вячеслав")){
                System.out.println("Нет такого имени");
            }
        }
        in.close();
    }
}