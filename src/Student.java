//student list is managed with csv
public class Student {
    private int id, age, point, phone;
    private String name, sex, email, course, status, address, lesson;

    public Student(int id, int age, int points, int phone, String name, String sex, String email, String course, String status, String lesson, String address){
        this.id = id; this.name = name; this.age = age; this.sex = sex;
        this.phone = phone; this.email = email; this.course = course;
        this.point = points; this.status = status; this.address = address; this.lesson = lesson;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public int getPoint() {
        return point;
    }

    public int getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getEmail() {
        return email;
    }

    public String getCourse() {
        return course;
    }

    public String getStatus() {
        return status;
    }

    public String getAddress() {
        return address;
    }

    public String getLesson(){
        return lesson;
    }

    //points can only be purchased +200 increments
    public void setPoint(int p){
        point = point + p;
    }

    public String toCsv() {
        return id + "," + name + "," + age + "," + sex + "," + phone + "," + email + "," + point + "," + course + "," + lesson + "," + status + "\n";
        }
}

