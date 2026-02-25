package domein.attacks.spells;

import domein.attacks.bases.Aura;
import domein.attacks.bases.Spell;
import domein.attacks.elements.Fire;
import domein.attacks.elements.Water;
import domein.attacks.targeting.AreaOfEffect;

public class FireIceStorm extends Aura implements Fire, Water {

    @Override
    public void applyBurn() {
        System.out.println("Burn effect applied!");
    }

    @Override
    public double getFireDamage() {
        return 35;
    }

    @Override
    public void applySlow() {
        System.out.println("slow applied");
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
        System.out.printf("multiple targets hit");
    }

    @Override
    public void cast() {
        affectMultipleTargets();
        applyBurn();
        applySlow();
    }
}
