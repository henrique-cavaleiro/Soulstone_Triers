package domein.Characters;

public class Character {
    int life = 100;
    static float damage = 10;
    float radius = 1;

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public static float getDamage() {
        return damage;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }
}
