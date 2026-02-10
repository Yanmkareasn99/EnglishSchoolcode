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
}
