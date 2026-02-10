import java.util.*;

public class EnglishSchool {

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        CsvUtil.loadStudents(SchoolData.students);
        CsvUtil.loadTeachers(SchoolData.teachers);
        CsvUtil.loadLessons(SchoolData.lessons);
        int[] lessonCost = CsvUtil.loadLessonCost();
        if (lessonCost != null) {
            LessonCost.setCosts(lessonCost[0], lessonCost[1]);
        }
        MainMenu.showMenu();
    }
}
