public class UseCaseViewStudent {
        public static void execute() {
        System.out.println(Design.LINE);
        System.out.println("\n------ 生徒一覧 ------");
        for (Student s : SchoolData.students) {
            if (!"在籍".equals(s.getStatus())) {
                continue;
            }
            System.out.println(
                    "ID=" + s.getId() +
                            " 名前=" + s.getName() +
                            " コース=" + s.getCourse() +
                            " ポイント=" + s.getPoints() +
                            " 登録日=" + s.getRegisterDate()
            );
        }
    }

        public static void execute(int studentId) {
        System.out.println(Design.LINE);
        for (Student s : SchoolData.students) {
            if (s.getId() == studentId) {
                System.out.println(
                        "ID=" + s.getId() +
                                " 名前=" + s.getName() +
                                " コース=" + s.getCourse() +
                                " ポイント=" + s.getPoints() +
                                " レッスン=" + s.getLesson() +
                                " 登録日=" + s.getRegisterDate()
                );
                return;
            }
        }
        System.out.println("生徒が見つかりません");
    }
}
