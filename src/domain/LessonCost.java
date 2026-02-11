public class LessonCost {
    private int pointValue;
    private int lessonCost;

    public LessonCost(int pointValue, int perLessonCost){
        this.pointValue = pointValue;
        this.lessonCost = perLessonCost;
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }
    public void setPerLessonCost(int lessonCost) {
        this.lessonCost = lessonCost;
    }

    public int getPointValue() {
        return this.pointValue;
    }

    public int getLessonCost() {
        return this.lessonCost;
    }

    public String toCsv() {
        return pointValue + "," + lessonCost;
    }

}
