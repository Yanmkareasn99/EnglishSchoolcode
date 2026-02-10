public class FindUtil {
        public static Student findStudent(int studentId) {
        for (Student s : EnglishSchool.students) {
            if (s.getId() == studentId) {
                return s;
            }
        }
        return null;
    }

        public static Teacher findTeacher(int teacherId) {
        for (Teacher t : EnglishSchool.teachers) {
            if (t.getId() == teacherId) {
                return t;
            }
        }
        return null;
    }
}
