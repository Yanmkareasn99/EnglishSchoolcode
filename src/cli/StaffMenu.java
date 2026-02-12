public class StaffMenu {
    private static final Scanner sc = new Scanner(System.in);

    public static void showMenu() { 
        while (true) {
            Design.clearScreen();
            System.out.println(Design.LINE);
            System.out.print("""
                       
                        1: 生徒登録
                        2: 生徒一覧
                        3: 生徒情報変更
                        4: ポイント購入
                        5: レッスン予約
                        6: レッスン確認
                        7: レッスンキャンセル
                        8: レッスン単価
                        9: 講師登録
                        10: 講師一覧
                        11: 生徒退会
                        12: 売上確認
                        0: 戻る
                       """);
            while (true) {
                System.out.print("番号を入力してください>>> ");
                try {
                    int choice = Integer.parseInt(sc.nextLine());
                    switch (choice) {
                        case 1 -> UseCaseAddStudent.execute();
                        case 2 -> UseCaseViewStudent.execute();
                        case 3 -> UseCaseChangeStudent.execute();
                        case 4 -> UseCaseAddPoint.execute();
                        case 5 -> UseCaseBookLesson.execute();
                        case 6 -> UseCaseViewLesson.execute();
                        case 7 -> UseCaseCancelLesson.execute();
                        case 8 -> UseCaseChangeLessonCost.execute();
                        case 9 -> UseCaseAddTeacher.execute();
                        case 10 -> UseCaseViewTeacher.execute();
                        case 11 -> UseCaseRemoveStudent.execute();
                        case 12 -> UseCaseViewProfit.execute();
                        case 0 -> { return; }
                        default -> {
                            System.out.println("無効な入力です。");
                            continue;
                        }
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("数字を入力してください。");
                }
            }
        }
    }
}