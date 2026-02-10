public class UseCaseAddPoint {

    public static void execute() {
        System.out.println(Design.LINE);
        UseCaseViewStudent.execute();
        System.out.print("生徒ID: ");
        int id = Integer.parseInt(EnglishSchool.sc.nextLine());

        for (Student s : SchoolData.students) {
            if (s.getId() == id) {
                if (!"在籍".equals(s.getStatus())) {
                    System.out.println("在籍中の生徒が見つかりません。");
                    return;
                }
                System.out.print("追加ポイント（200単位）: ");
                int p = Integer.parseInt(EnglishSchool.sc.nextLine());

                if (s.setpoint(p)) {
                    System.out.println("ポイント追加完了");
                } else {
                    System.out.println("200単位で入力してください");
                }
                return;
            }
        }
        System.out.println("生徒が見つかりません。");
    }
}
