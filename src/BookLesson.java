import java.time.LocalDateTime;

public class BookLesson {
    public static void execute() {
        System.out.println(Design.LINE);
        ViewStudent.execute();
        int lessonId = EnglishSchool.lessons.size()+1;
        System.out.print("生徒ID: ");
        int studentId = Integer.parseInt(EnglishSchool.sc.nextLine());
        Student student = FindUtil.findStudent(studentId);
        if (student == null || !"在籍".equals(student.getStatus())) {
            System.out.println("在籍中の生徒が見つかりません。");
            return;
        }
        ViewTeacher.execute();

        System.out.print("講師ID: ");
        int teacherId = Integer.parseInt(EnglishSchool.sc.nextLine());
        Teacher currentTeacher = FindUtil.findTeacher(teacherId);
        if (currentTeacher == null) {
            System.out.println("先生が見つかりません");
            return;
        }
        String lessonType = CourseUtil.SelectLessonType();

        System.out.print("日時 (例: 2026-02-01 18): ");
        String input = EnglishSchool.sc.nextLine();
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
        for(Lesson l : EnglishSchool.lessons){
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

        if (!student.consumePoints(LessonCost.getLessonCost())) {
            System.out.println("ポイントが不足しています。");
            while(true){
                try{
                    System.out.println("""
        ポイントを購入しますか？
       1. はい
       2. いいえ
           
    番号を入力してください>>> """);
                    switch (Integer.parseInt(EnglishSchool.sc.nextLine())){
                        case 1 -> {
                            AddPoint.execute();
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
        EnglishSchool.lessons.add(l);

        System.out.println("レッスンを予約しました。");
    }

        public static void execute(int studentId) {
        System.out.println(Design.LINE);

        int lessonId = EnglishSchool.lessons.size()+1;
        Student student = FindUtil.findStudent(studentId);
        System.out.print("講師ID: ");
        int teacherId = Integer.parseInt(EnglishSchool.sc.nextLine());

        String lessonType = CourseUtil.SelectLessonType();

        System.out.print("日時 (例: 2026-02-01 18): ");
        String input = EnglishSchool.sc.nextLine();
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
        for(Lesson l : EnglishSchool.lessons){
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

        if (student == null || !student.consumePoints(LessonCost.getLessonCost())) {
            System.out.println("ポイントが不足しています。");
            return;
        }

        Lesson l = new Lesson(lessonId, studentId, teacherId, lessonType, DateTimeUtil.format(dateTime));
        EnglishSchool.lessons.add(l);

        System.out.println("レッスンを予約しました。");
    }

}
