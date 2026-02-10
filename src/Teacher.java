public class Teacher {

    private int id;
    private String name;

    public Teacher(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    public String toCsv() {
        return id + "," + name;
    }

    public static String getTeacherName(int teacherId) {
        Teacher teacher = FindUtil.findTeacher(teacherId);
        return teacher != null ? teacher.getName() : "";
    }
}
