public class Studentcsv {
    private int id, age, points, phone;
    private String name, sex, email, course, status, address;

    public Studentcsv(int id, int age, int points, int phone, String name, String sex, String email, String course, String status){
        this.id = id; this.name = name; this.age = age; this.sex = sex;
        this.phone = phone; this.email = email; this.course = course;
        this.points = points; this.status = status; this.address = address;
    }

    public String toCsv() {
        return id + "," + name + "," + age + "," + sex + "," + phone + "," + email + "," + points + "," + course + "," + status + "\n";
        }

}
