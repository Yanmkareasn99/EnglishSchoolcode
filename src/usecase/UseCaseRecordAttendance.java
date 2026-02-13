import java.util.*;
public class UseCaseRecordAttendance {
    private static final Scanner sc = new Scanner(System.in);

    public static void execute() {
        System.out.println(Design.LINE);
        System.out.print("レッスンIDを入力してください:");
        
        String input = sc.nextLine();

        int lessonId;


        try {
            lessonId = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.err.println("数値を入力してください。");
            return;
        }

        
        
        
       for (Lesson l : SchoolData.lessons) {
    if (l.getLessonId() == lessonId) {

        System.out.println("1: 出席  2: 欠席  3: 遅刻 を選んでください:");
        String choice = sc.nextLine();

        String newStatus;

        switch (choice) {
            case "1":
                newStatus = "出席";
                break;
            case "2":
                newStatus = "欠席";
                break;
            case "3":
                newStatus = "遅刻";
                break;
            default:
                System.out.println("正しい番号を入力してください。");
                return;
        }
        l.setStatus(l.getStatus() + " 出席状況： " + newStatus);
        System.out.println(newStatus + "を登録しました。");
        return;
    }
}

    System.out.println("レッスンが見つかりません。");
    }
}
