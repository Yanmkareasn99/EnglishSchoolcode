public class UseCaseAddTeacher {
    private static final Scanner sc = new Scanner(System.in);

    public static void execute() {
        System.out.println(Design.LINE);
        int id = SchoolData.teachers.size() + 1;

        System.out.print("講師名: ");
        String name = sc.nextLine();

        Teacher t = new Teacher(id, name);
        SchoolData.teachers.add(t);
        System.out.println("講師を登録しました。");
    }
}
