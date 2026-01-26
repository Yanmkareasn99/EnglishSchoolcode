import java.io.*;
import java.util.*;

public class Main{
    public static List<Student> students = new ArrayList<>();
    public static List<Lessons> lessons = new ArrayList<>();

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            try{
                System.out.print("""
              
                                    ***** 英会話スクールシステム *****
                                    
                                              Main Menu
                                              
                                      1. 生徒
                                      2. 講師
                                      3. 受付
                                      0. 終了してデータをCSVに書く
                                      
                                    番号を選択してください >>> """);

                int choice = Integer.parseInt(sc.nextLine());
                switch (choice){
                    case 1 -> {
                        student.menu();
                    }
                    case 2 -> {
                        teacher.menu();
                    }
                    case 3 -> {
                        staff.menu();
                    }
                    case 0-> {
                        System.out.println("保存が終了しました。");
                    }
                    default -> System.out.println("無効な入力！！！");
                }
            } catch (Exception e) {
                System.out.println("数字を入力してください");
            }
        }
    }



}