import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.print("������� ���: ");
            String name = in.nextLine();
            if (Objects.equals(name, "��������")){
                System.out.println("������, " + name);
                flag = false;
            }
            else if (Objects.equals(name, "��������")) {
                System.out.println("���������� � ������� �����");
            }
            else if (!Objects.equals(name, "��������")){
                System.out.println("��� ������ �����");
            }
        }
        in.close();
    }
}