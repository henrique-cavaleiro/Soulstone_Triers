package domein.characters.bases;

public class Character {
    int life = 100;
    static float damage = 10;
    float radius = 1;
    static float fireDamage = 10;
    static float waterDamage = 10;
    static float windDamage = 10;
    static float lightningDamage = 10;


    public static float getFireDamage() {
        return fireDamage;
    }

    public static void setFireDamage(float fireDamage) {
        Character.fireDamage = fireDamage;
    }

    public static float getWaterDamage() {
        return waterDamage;
    }

    public static void setWaterDamage(float waterDamage) {
        Character.waterDamage = waterDamage;
    }

    public static float getWindDamage() {
        return windDamage;
    }

    public static void setWindDamage(float windDamage) {
        Character.windDamage = windDamage;
    }

    public static float getLightningDamage() {
        return lightningDamage;
    }

    public static void setLightningDamage(float lightningDamage) {
        Character.lightningDamage = lightningDamage;
    }


    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

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
