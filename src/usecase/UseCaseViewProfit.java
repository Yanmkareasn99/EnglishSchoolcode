public class UseCaseViewProfit {
        public static void execute() {

        System.out.println(Design.LINE);
//        for (Lesson l : EnglishSchool.lessons) {
//            if (!"取消".equals(l.getStatus())) {
//                lessonCount++;
//            }
//        }
        int lessonCount = SchoolData.lessons.size();
        int totalPointsUsed = lessonCount * SchoolData.lessonCosts.get(0).getLessonCost();
        int totalProfit = totalPointsUsed * SchoolData.lessonCosts.get(0).getPointValue();
        System.out.println(Design.LINE);
        System.out.println("ポイント合計=" + totalPointsUsed);
        System.out.println("売上=" + totalProfit + "円");
    }
}
