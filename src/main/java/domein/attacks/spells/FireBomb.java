package domein.attacks.spells;

import domein.attacks.bases.Spell;
import domein.attacks.targeting.AreaOfEffect;
import domein.attacks.elements.Fire;

public class FireBomb extends Spell implements Fire, AreaOfEffect {

    @Override
    public void applyBurn() {
        System.out.println("Burn effect applied!");
    }

    @Override
    public double getFireDamage() {
        return 50;
    }

    @Override
    public double getRadius() {
        return 3.5;
    }

    @Override
    public void affectMultipleTargets() {
        System.out.println("All enemies in radius take damage!");
    }

    @Override
    public void cast() {

    }
}
