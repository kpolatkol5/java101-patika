public class Match {

    String name;
    Fighter f1;
    Fighter f2;
    int maxWeight;
    int minWeight;
    boolean win;

    Match(String name, Fighter f1, Fighter f2, int maxWeight, int minWeight) {
        this.name = name;
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    boolean isCheck() {
        return (this.f1.weight >= this.minWeight && this.f1.weight <= this.maxWeight) && (this.f2.weight >= this.minWeight && this.f2.weight <= this.maxWeight);
    }

    public void run() {
        if (this.isCheck()) {

            while (true) {

                if (isWin()) {
                    this.winnerFighter();
                    break;

                } else {
                    f1.vurus(f2);
                    f2.vurus(f1);
                    System.out.println(String.format("%s isimli sporcunun sağlığı : %d <***> %s isimli sporcunun sağlığı : %d", this.f1.name, this.f1.healt, this.f2.name, this.f2.healt));
                }

            }
        } else {
            System.out.println("sporcular bu maç için uygun değil");
        }
    }

    public void winnerFighter() {
        if (this.f1.healt <= 0) {
            System.out.println(String.format("kaznan : %s", this.f2.name));
        } else {
            System.out.println(String.format("kaznan : %s", this.f1.name));
        }
    }

    public boolean isWin() {
        if (this.f1.healt <= 0 || this.f2.healt <= 0) {
            return true;
        } else {
            return false;
        }
    }

}
