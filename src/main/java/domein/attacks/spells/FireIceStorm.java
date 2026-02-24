package domein.attacks.spells;

import domein.attacks.bases.Aura;
import domein.attacks.bases.Spell;
import domein.attacks.elements.Fire;
import domein.attacks.elements.Water;
import domein.attacks.targeting.AreaOfEffect;

public class FireIceStorm extends Aura implements Fire, Water {

    @Override
    public void applyBurn() {

    }

    @Override
    public double getFireDamage() {
        return 35;
    }

    @Override
    public void applySlow() {

    }

    @Override
    public double getWaterDamage() {
        return 35;
    }

    @Override
    public double getRadius() {
        return 5;
    }

    @Override
    public void affectMultipleTargets() {

    }
}
