    public class UseCaseRecordAttendance {

    public static void execute() {
        System.out.println(Design.LINE);
        System.out.print("レッスンID: ");
        int lessonId = Integer.parseInt(EnglishSchool.sc.nextLine());

        for (Lesson l : EnglishSchool.lessons) {
            if (l.getLessonId() == lessonId) {
                Student student = FindUtil.findStudent(l.getStudentId());
                if (student != null) {
                    String summary = l.getDateTime() + " " + l.getLessonType();
                    student.setLesson(summary);
                    System.out.println("出席を登録しました。");
                } else {
                    System.out.println("生徒が見つかりません。");
                }
                return;
            }
        }
        System.out.println("レッスンが見つかりません。"); 
    }
}
