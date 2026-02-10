public class UseCaseViewLessonCost {
    public static void execute() {
        System.out.println("\n------ 単価 ------");
        System.out.println("レッスン単価=" + LessonCost.getLessonCost() + "ポイント");
        System.out.println("ポイント単価=" + LessonCost.getPointValue() + "円");
    }
}
