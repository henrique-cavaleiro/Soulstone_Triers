package domein.characters.classes;

import domein.characters.bases.Character;

public class Knight extends Character {

    public Knight(int life, float damage, int radius, float fireDamage, float waterDamge, float windDamage, float lightningDamage) {
        super(life, damage, radius, fireDamage, waterDamge, windDamage, lightningDamage);
        life = 1000;
        damage=30;
        radius=0;
        fireDamage=5;
        waterDamge=5;
        windDamage=5;
        lightningDamage=5;

    }

    public Knight(int life, float damage, int radius) {
        super(life, damage, radius);
    }
}
