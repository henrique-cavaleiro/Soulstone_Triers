package domein.characters.enemies;

import domein.characters.bases.Character;

public class enemy extends Character {
    public enemy(int life, float damage, int radius, float fireDamage, float waterDamge, float windDamage, float lightningDamage) {
        super(life, damage, radius, fireDamage, waterDamge, windDamage, lightningDamage);
    }

    public enemy(int life, float damage, int radius) {
        super(life, damage, radius);
    }
}
