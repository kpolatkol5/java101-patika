public class Main {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("kadir", 70);
        Fighter f2 = new Fighter("yasin", 74);
        Match m1 = new Match("orta siklet", f1, f2, 100, 60);

        m1.run();

    }
}