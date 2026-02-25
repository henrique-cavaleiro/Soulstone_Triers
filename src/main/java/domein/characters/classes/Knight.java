package domein.characters.classes;

import domein.characters.bases.Character;

public class Knight extends Character {

    public Knight(int life, float damage, int radius, float fireDamage, float waterDamge, float windDamage, float lightningDamage) {
        super(life, damage, radius, fireDamage, waterDamge, windDamage, lightningDamage);
    }

    public Knight(int life, float damage, int radius) {
        super(life, damage, radius);
    }
}
