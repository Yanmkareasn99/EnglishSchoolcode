public class ViewTeacher {
        public static void execute() {
        System.out.println(Design.LINE);
        System.out.println("\n------ 講師一覧 ------");
        for (Teacher t : EnglishSchool.teachers) {
            System.out.println(
                    "ID=" + t.getId() +
                            " 名前=" + t.getName()
            );
        }
    }
}
