public class RemoveStudent {
        public static void execute() {
        System.out.println(Design.LINE);
        System.out.print("退会する生徒ID: ");
        int id = Integer.parseInt(EnglishSchool.sc.nextLine());

        for (Student s : EnglishSchool.students) {
            if (s.getId() == id) {
                if (!"在籍".equals(s.getStatus())) {
                    System.out.println("すでに退学済みです。");
                    return;
                }
                s.setStatus("退学");
                System.out.println("退学処理が完了しました。");

                return;
            }
        }
        System.out.println("生徒が見つかりません。");
    }
}
