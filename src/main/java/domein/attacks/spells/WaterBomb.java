package domein.attacks.spells;

import domein.attacks.bases.Spell;
import domein.attacks.targeting.AreaOfEffect;
import domein.attacks.elements.Water;

public class WaterBomb extends Spell implements Water, AreaOfEffect {
    @Override
    public double getRadius() {
        return 4.5;
    }

    @Override
    public void affectMultipleTargets() {
        System.out.printf("multiple targets geraakt");

    }

    @Override
    public void applySlow() {
        System.out.printf("slow applied");

    }

    @Override
    public double getWaterDamage() {
        return 40;
    }

    @Override
    public void cast() {
        applySlow();
        affectMultipleTargets();
    }
}
