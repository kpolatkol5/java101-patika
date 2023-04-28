

public class Main {


    public static void main(String[] args) {
//        kurslar eklendi

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

//         hoca eklendi

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

//        kurs için hoca eklendi
        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

//       öğrenci eklendi

        Student s1 = new Student("kadir", "1212", "deneme", mat, fizik, kimya);

        s1.addBulkExamNote(100, 21, 21);

//        Kurs hocalarının isimleri
        System.out.println(s1.course1.teach.name);
        System.out.println(s1.course2.teach.name);
        System.out.println(s1.course3.teach.name);

//        öğrenci geçti mi

        s1.isPass();
// öğrencinin not bilgisi
        s1.printNote();
    }
}