import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UseCaseRemoveStudent {
    private static final Scanner sc = new Scanner(System.in);

    public static void execute() {
        System.out.println(Design.LINE);
        System.out.print("退会する生徒ID: ");
        int id = Integer.parseInt(sc.nextLine());
        for (Student s : SchoolData.students) {
            if (s.getId() == id) {
                if (!"在籍".equals(s.getStatus())) {
                    System.out.println("すでに退学済みです。");

                    s.setStatus("退学" + "退学日: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm")));
                    System.out.println("退学処理が完了しました。");
                    return;
                }

                return;
            }
        }
        System.out.println("生徒が見つかりません。");
    }
}
