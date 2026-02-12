import java.time.LocalDateTime;

public class UseCaseBookLesson {
    private static final Scanner sc = new Scanner(System.in);

    public static void execute() {
        System.out.println(Design.LINE);
        UseCaseViewStudent.execute();
        int lessonId = SchoolData.lessons.size()+1;
        System.out.print("生徒ID: ");
        int studentId = Integer.parseInt(sc.nextLine());
        Student student = FindUtil.findStudent(studentId);
        if (student == null || !"在籍".equals(student.getStatus())) {
            System.out.println("在籍中の生徒が見つかりません。");
            return;
        }
        UseCaseViewTeacher.execute();
        System.out.print("講師ID: ");
        int teacherId = Integer.parseInt(sc.nextLine());
        Teacher currentTeacher = FindUtil.findTeacher(teacherId);
        if (currentTeacher == null) {
            System.out.println("先生が見つかりません");
            return;
        }
        String lessonType = CourseUtil.SelectLessonType();

        System.out.print("日時 (例: 2026-02-01 18): ");
        String input = sc.nextLine();
        LocalDateTime dateTime;
        try {
            dateTime = DateTimeUtil.parse(input);
        } catch (Exception e) {
            System.out.println("日時の形式が正しくありません。");
            return;
        }
        if (dateTime.isBefore(LocalDateTime.now())) {
            System.out.println("過去の日時は予約できません。");
            return;
        }

        String formattedDateTime = DateTimeUtil.format(dateTime);
        for(Lesson l : SchoolData.lessons){
            if(!"取消".equals(l.getStatus()) && formattedDateTime.equals(l.getDateTime())){
                if(l.getTeacherId() == teacherId){
                    System.out.println("講師はその時間に予約があります。");
                    return;
                }
                if(l.getStudentId() == studentId){
                    System.out.println("生徒はその時間に予約があります。");
                    return;
                }
            }
        }

        if (!student.consumePoints(SchoolData.lessonCosts.get(0).getLessonCost())) {
            System.out.println("ポイントが不足しています。");
            while(true){
                try{
                    System.out.println("""
        ポイントを購入しますか？
       1. はい
       2. いいえ
           
    番号を入力してください>>> """);
                    switch (Integer.parseInt(sc.nextLine())){
                        case 1 -> {
                            UseCaseAddPoint.execute();
                            return;
                        }
                        case 2 -> {
                            return;
                        }
                        default -> System.out.println("無効な入力！！！");
                    }
                } catch (Exception e) {
                    System.out.println("数字を入力してください！！！");
                }
            }
        }

        Lesson l = new Lesson(lessonId, studentId, teacherId, lessonType, DateTimeUtil.format(dateTime));
        SchoolData.lessons.add(l);

        System.out.println("レッスンを予約しました。");
    }

        public static void execute(int studentId) {
        System.out.println(Design.LINE);

        int lessonId = SchoolData.lessons.size()+1;
        Student student = FindUtil.findStudent(studentId);
        System.out.print("講師ID: ");
        int teacherId = Integer.parseInt(sc.nextLine());
        Teacher currentTeacher = FindUtil.findTeacher(teacherId);
        if (currentTeacher == null) {
            System.out.println("先生が見つかりません");
            return;
        }
        String lessonType = CourseUtil.SelectLessonType();

        System.out.print("日時 (例: 2026-02-01 18): ");
        String input = sc.nextLine();
        LocalDateTime dateTime;
        try {
            dateTime = DateTimeUtil.parse(input);
        } catch (Exception e) {
            System.out.println("日時の形式が正しくありません。");
            return;
        }
        if (dateTime.isBefore(LocalDateTime.now())) {
            System.out.println("過去の日時は予約できません。");
            return;
        }

        String formattedDateTime = DateTimeUtil.format(dateTime);
        for(Lesson l : SchoolData.lessons){
            if(!"取消".equals(l.getStatus()) && formattedDateTime.equals(l.getDateTime())){
                if(l.getTeacherId() == teacherId){
                    System.out.println("講師はその時間に予約があります。");
                    return;
                }
                if(l.getStudentId() == studentId){
                    System.out.println("生徒はその時間に予約があります。");
                    return;
                }
            }
        }

        if (student == null || !"在籍".equals(student.getStatus())) {
            System.out.println("在籍中の生徒が見つかりません。");
            return;
        }

        if (!student.consumePoints(SchoolData.lessonCosts.get(0).getLessonCost())) {
            System.out.println("ポイントが不足しています。");
            return;
        }

        Lesson l = new Lesson(lessonId, studentId, teacherId, lessonType, DateTimeUtil.format(dateTime));
        SchoolData.lessons.add(l);

        System.out.println("レッスンを予約しました。");
    }

}
