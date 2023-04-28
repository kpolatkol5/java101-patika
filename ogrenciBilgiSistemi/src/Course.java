public class Course {
    Teacher teach;

    String name;
    String code;
    String prefix;
    int note;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    public void addTeacher(Teacher t) {

        if (t.branch.equals(this.prefix)) {
            System.out.println("Başarılı");
            this.teach = t;
        } else {
            System.out.println("Bu öğretmen bu dersi vermez");
        }
    }

    public void prinTeacher() {
        if (this.teach == null) {
            System.out.println("Bu kursa hoca atanmamış");
        } else {
            this.teach.print();
        }
    }
}
