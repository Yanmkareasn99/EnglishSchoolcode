import java.util.*;

public class EnglishSchool {

    public static final Scanner sc = new Scanner(System.in);
    public static final SchoolData schoolData = new SchoolData();

    public static void main(String[] args) {
        CsvUtil.loadStudents(SchoolData.students);
        CsvUtil.loadTeachers(SchoolData.teachers);
        CsvUtil.loadLessons(SchoolData.lessons);
        CsvUtil.loadLessonCost(SchoolData.lessonCosts);
        MainMenu.showMenu();
    }
}
