package usecase;
public class UseCaseViewLesson {
        public static void execute() {
        System.out.println(Design.LINE);
        for (Lesson l : SchoolData.lessons) {
            if (!"取消".equals(l.getStatus())) {
                System.out.println(
                        "レッスンID=" + l.getLessonId() +
                                " 生徒ID=" + l.getStudentId() +
                                " 講師ID=" + l.getTeacherId() +
                                " レッスンタイプ=" + l.getLessonType() +
                                " 日時=" + l.getDateTime() + "時"
                );
            }
        }
    }

        public static void executeStudent(int studentId) {
        System.out.println(Design.LINE);
        boolean found = false;
        for (Lesson l : SchoolData.lessons) {
            if (l.getStudentId() == studentId && !"取消".equals(l.getStatus())) {
                System.out.println(
                        "レッスンID=" + l.getLessonId() +
                                " 講師=" + FindUtil.findTeacherName(l.getTeacherId()) +
                                " レッスンタイプ=" + l.getLessonType() +
                                " 日時=" + l.getDateTime() + "時"
                );
                found = true;
            }
        }
        if (!found) {
            System.out.println("レッスンがありません。");
        }
    }

        public static void executeTeacher(int teacherId) {
        System.out.println(Design.LINE);

        boolean found = false;
        for (Lesson l : SchoolData.lessons) {
            if (l.getTeacherId() == teacherId && !"取消".equals(l.getStatus())) {
                System.out.println(
                        "レッスンID=" + l.getLessonId() +
                                " 生徒ID=" + l.getStudentId() +
                                " 生徒名=" + FindUtil.findStudentName(l.getStudentId())+
                                " レッスンタイプ=" + l.getLessonType() +
                                " 日時=" + l.getDateTime()
                );
                found = true;
            }
        }
        if (!found) {
            System.out.println("該当レッスンがありません。");
        }
    }
}
