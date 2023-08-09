public class Main {
    public static void main(String[] args) {


        Student<String> s1 = new Student<>();
        Student<Integer> s2 = new Student<>();

        s1.select("12");
        s2.select(12);

        /* s1.select("12"); */
    }
}