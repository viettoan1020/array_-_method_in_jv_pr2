import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên học sinh : ");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i=0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Vị trí của học sinh trong danh sách là : " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Không tìm thấy " + input_name + "in the list.");

        }
    }
}
