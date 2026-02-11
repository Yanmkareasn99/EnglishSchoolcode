public class FindUtil {
    
    public static Student findStudent(int studentId) {
    for (Student s : SchoolData.students) {
        if (s.getId() == studentId) {
            return s;
        }
    }
    return null;
    }

    public static Teacher findTeacher(int teacherId) {
    for (Teacher t : SchoolData.teachers) {
        if (t.getId() == teacherId) {
            return t;
        }
    }
    return null;
    }

    public static String findTeacherName(int teacherId) {
        Teacher teacher = FindUtil.findTeacher(teacherId);
        if (teacher != null) {
            return teacher.getName();
        } else {
            return "";
        }

    }

    public static String findStudentName(int studentId) {
        Student student = FindUtil.findStudent(studentId);
        if (student != null) {
            return student.getName();
        } else {
            return "";
        }
    }
}
