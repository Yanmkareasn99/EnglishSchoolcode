public class StudentMenu {
    public static void showMenu() {
        System.out.println(Design.LINE);
        System.out.print("生徒ID: ");
        int studentId;
        try {
            studentId = Integer.parseInt(EnglishSchool.sc.nextLine());
        } catch (Exception e) {
            System.out.println("数字を入力してください！！！");
            return;
        }
        Student currentStudent = FindUtil.findStudent(studentId);
        if (currentStudent == null || !"在籍".equals(currentStudent.getStatus())) {
            System.out.println("在籍中の生徒が見つかりません");
            return;
        }

        while (true) {
            Design.clearScreen();
            System.out.println(Design.LINE);
            System.out.println("生徒: " + currentStudent.getName() + " (ID: " + studentId + ")");
            System.out.print("""

                        1: 生徒情報確認
                        2: レッスン予約
                        3: レッスン確認
                        0: 戻る

                        """);
            while (true) {
                System.out.print("番号を入力してください>>> ");
                try {
                    int choice = Integer.parseInt(EnglishSchool.sc.nextLine());
                    switch (choice) {
                        case 1 -> ViewStudent.execute(studentId);
                        case 2 -> BookLesson.execute(studentId);
                        case 3 -> ViewLesson.executeStudent(studentId);
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
