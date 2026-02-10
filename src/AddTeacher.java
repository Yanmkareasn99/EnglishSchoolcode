public class AddTeacher {
    public static void execute() {
        System.out.println(Design.LINE);
        int id = EnglishSchool.teachers.size() + 1;

        System.out.print("講師名: ");
        String name = EnglishSchool.sc.nextLine();

        Teacher t = new Teacher(id, name);
        EnglishSchool.teachers.add(t);
        System.out.println("講師を登録しました。");
    }
}
