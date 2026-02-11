public class UseCaseViewLessonCost {
    public static void execute() {
        System.out.println("\n------ 単価 ------");
        System.out.println("レッスン単価=" + SchoolData.lessonCosts.get(0).getLessonCost() + "ポイント");
        System.out.println("ポイント単価=" + SchoolData.lessonCosts.get(0).getPointValue() + "円");
    }
}
