public class UseCaseChangeLessonCost {
    public static void execute(){
        System.out.println(Design.LINE);
        UseCaseViewLessonCost.execute();
        while(true){
            try{
                System.out.println("""
            単価を変える
       1. はい
       2. いいえ
           
    番号を入力してください>>> """);
                switch (Integer.parseInt(EnglishSchool.sc.nextLine())){
                    case 1 -> {
                        LessonCost.changeCost();
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
}
