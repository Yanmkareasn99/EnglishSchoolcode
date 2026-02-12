public class UseCaseChangeLessonCost {
    private static final Scanner sc = new Scanner(System.in);

    public static void execute(){
        System.out.println(Design.LINE);
        UseCaseViewLessonCost.execute();
        while(true){
            try{
                System.out.print("""
            単価を変える
       1. はい
       2. いいえ
           
    番号を入力してください>>> """);
                switch (Integer.parseInt(sc.nextLine())){
                    case 1 -> {
                        changeCost();
                        return;
                    }
                    case 2 -> {
                        return;
                    }
                    default -> System.out.println("無効な入力！！！");
                }
            } catch (Exception e) {
                System.out.println("数字を入力してください！！！");
            }
        }
    }

        public static void changeCost(){
        System.out.println(Design.LINE);
        System.out.print("一ポイントの単価を入力してください>>> ");
        SchoolData.lessonCosts.get(0).setPointValue(Integer.parseInt(sc.nextLine()));
        System.out.print("レッスン1コマの単価を入力してください>>> ");
        SchoolData.lessonCosts.get(0).setPerLessonCost(Integer.parseInt(sc.nextLine()));
        System.out.println("単価を変更しました。");
    }
}
