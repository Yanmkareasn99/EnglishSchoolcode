import java.time.LocalDate;

public class UseCaseAddStudent {

    public static void execute() {
        System.out.println(Design.LINE);
        int id = SchoolData.students.size()+1;

        System.out.print("名前: ");
        String name = EnglishSchool.sc.nextLine();

        System.out.print("年齢: ");
        int age = Integer.parseInt(EnglishSchool.sc.nextLine());

        System.out.print("性別: ");
        String sex = EnglishSchool.sc.nextLine();

        System.out.print("電話番号: ");
        long phone = Long.parseLong(EnglishSchool.sc.nextLine());

        System.out.print("Email: ");
        String email = EnglishSchool.sc.nextLine();

        String course = CourseUtil.selectCourse();

        Student s = new Student(
                id, name, age, sex,
                phone, email, course,
                0, "在籍", "", ""
        );
        s.setRegisterDate(LocalDate.now());

        SchoolData.students.add(s);
        System.out.println("生徒を登録しました。");
    }
}
