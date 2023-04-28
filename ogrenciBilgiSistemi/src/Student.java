public class Student {
    String name;
    String stuNo;
    String classes;
    Course course1, course2, course3;
    double avarage;
    boolean isPass;

    Student(
            String name,
            String stuNo,
            String classes,
            Course course1,
            Course course2,
            Course course3

    ) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;

    }

    public void calcAvarage() {
        if ((this.course1.note != 0) && (this.course2.note != 0) && (this.course3.note != 0)) {
            this.avarage = (this.course1.note + this.course2.note + this.course3.note) / 3;
        } else {
            System.out.println("notlar tam girilmemiş olabilir...");
        }
    }

    public void isPass() {
        if (this.course1.note == 0 || this.course2.note == 0 || this.course3.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            this.printNote();

            this.calcAvarage();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public boolean isCheckPass() {
        return this.avarage >= 50;
    }

    public void printNote() {
        System.out.println("**=========================**");
        System.out.println(String.format("Öğrenci adı\t:%s , sınıfı\t: %s , öğrenci no\t: %s " , this.name , this.classes , this.stuNo));
        System.out.println("********************************" + "\n");

        System.out.println(String.format("%s dersinin notu : %d", this.course1.name, this.course1.note));
        System.out.println(String.format("%s dersinin notu : %d", this.course2.name, this.course2.note));
        System.out.println(String.format("%s dersinin notu : %d", this.course3.name, this.course3.note));
    }

    public void addBulkExamNote(int course1Note, int course2Note, int course3Note) {
        if ((course1Note >= 0 && course1Note <= 100) && (course2Note >= 0 && course2Note <= 100) && (course3Note >= 0 && course3Note <= 100)) {
            this.course1.note = course1Note;
            this.course2.note = course2Note;
            this.course3.note = course3Note;

        } else {
            System.out.println("Hatalı not grişi");

        }


    }

}
