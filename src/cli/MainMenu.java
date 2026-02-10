public class MainMenu {
    public static void showMenu(){

    while (true){
            System.out.println(Design.LINE);
            System.out.print("""
              
                        ***** 英会話スクールシステム *****
                        
                                  Main Menu
                                  
                          1. 生徒
                          2. 講師
                          3. 受付
                          0. 終了してデータをCSVに書く
                          
                        """);
            while (true) {
                System.out.print("番号を選択してください >>> ");
                try{
                    int choice = Integer.parseInt(EnglishSchool.sc.nextLine());
                    switch (choice){
                        case 1 -> {
                            StudentMenu.showMenu();
                        }
                        case 2 -> {
                            TeacherMenu.showMenu();
                        }
                        case 3 -> {
                            StaffMenu.showMenu();
                        }
                        case 0-> {
                            CsvUtil.saveStudents(SchoolData.students);
                            CsvUtil.saveTeachers(SchoolData.teachers);
                            CsvUtil.saveLessons(SchoolData.lessons);
                            System.out.println("保存が終了しました。");
                            EnglishSchool.sc.close();
                            return;
                        }
                        default -> {
                            System.out.println("無効な入力！！！");
                            continue;
                        }
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("数字を入力してください");
                }
            }
        }
    }
}