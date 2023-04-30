import java.lang.Math;

public class Fighter {
    String name;
    int weight;
    int healt;


    Fighter(String name, int weight) {
        this.name = name;
        this.weight = weight;
        this.healt = 100;
    }

    public void vurus(Fighter foe) {
        foe.healt = foe.healt - this.damage();
    }

    public int damage() {
        int result = (int) (Math.random() * 20);
        return result;
    }
}
