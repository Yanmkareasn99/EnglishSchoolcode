public class Teachercsv {
    private int id;
    private String name;

    public Teachercsv(int id, String name){
        this.id = id; this.name =  name;
    }

    public String toCsv() {
        return id + "," + name + "\n";
    }
}
