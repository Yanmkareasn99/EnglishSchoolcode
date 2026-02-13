import java.util.*;
import java.time.LocalDate;

public class UseCaseAddStudent {
    private static final Scanner sc = new Scanner(System.in);

    public static void execute() {
        System.out.println(Design.LINE);
        int id = SchoolData.students.size()+1;

        System.out.print("名前: ");
        String name = sc.nextLine();

        System.out.print("年齢: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("性別: ");
        String sex = sc.nextLine();

        System.out.print("電話番号: ");
        long phone = Long.parseLong(sc.nextLine());

        System.out.print("Email: ");
        String email = sc.nextLine();

        String course = CourseUtil.selectCourse();

        System.out.print("カード番号: ");
        long cardNumber = Long.parseLong(sc.nextLine());

        Student s = new Student(
                id, name, age, sex,
                phone, email, course,
                0, "在籍", "", "", cardNumber
        );
        s.setRegisterDate(LocalDate.now());

        SchoolData.students.add(s);
        System.out.println("生徒を登録しました。");
    }
}
