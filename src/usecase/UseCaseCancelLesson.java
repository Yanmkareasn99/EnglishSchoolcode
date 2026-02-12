public class UseCaseCancelLesson {
    private static final Scanner sc = new Scanner(System.in);

    public static void execute() {
        System.out.println(Design.LINE);
        System.out.print("取消するレッスンID: ");
        int lessonId = Integer.parseInt(sc.nextLine());

        for (Lesson l : SchoolData.lessons) {
            if (l.getLessonId() == lessonId) {
                if ("取消".equals(l.getStatus())) {
                    System.out.println("すでに取消済みです。");
                    return;
                }
                l.setStatus("取消");
                System.out.println("レッスンを取消しました。");
                return;
            }
        }
        System.out.println("レッスンが見つかりません。");
    }
}
