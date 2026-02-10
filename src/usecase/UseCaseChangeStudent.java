public class UseCaseChangeStudent {
        public static void execute() {
        System.out.println(Design.LINE);
        System.out.print("変更する生徒ID: ");
        int id = Integer.parseInt(EnglishSchool.sc.nextLine());

        for (Student s : SchoolData.students) {
            if (s.getId() == id) {
                if (!"在籍".equals(s.getStatus())) {
                    System.out.println("在籍中の生徒が見つかりません。");
                    return;
                }
                System.out.print("新しいコース名: ");
                String course = EnglishSchool.sc.nextLine();
                System.out.println("****コース変更****");
                System.out.println("変更前: " + s.getCourse());
                s.setCourse(course);
                System.out.println("変更後: " + course);
                return;
            }
        }
        System.out.println("生徒が見つかりません。");
    }
}
