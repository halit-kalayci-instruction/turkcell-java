package mypackage;
public class Teacher extends Human{
    private String lessonName;

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public Teacher() {
    }

    public Teacher(String name, String surname, String lessonName) {
        super(name,surname);
        this.lessonName = lessonName;
    }
}
