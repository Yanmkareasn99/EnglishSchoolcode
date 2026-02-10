public class UseCaseViewProfit {
        public static void execute() {

        System.out.println(Design.LINE);
//        for (Lesson l : EnglishSchool.lessons) {
//            if (!"取消".equals(l.getStatus())) {
//                lessonCount++;
//            }
//        }
        int lessonCount = EnglishSchool.lessons.size();
        int totalPointsUsed = lessonCount * LessonCost.getLessonCost();
        int totalProfit = totalPointsUsed * LessonCost.getPointValue();
        System.out.println(Design.LINE);
        System.out.println("ポイント合計=" + totalPointsUsed);
        System.out.println("売上=" + totalProfit + "円");
    }
}
