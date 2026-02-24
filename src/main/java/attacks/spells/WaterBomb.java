package attacks.spells;

import attacks.bases.Spell;
import attacks.targeting.AreaOfEffect;
import attacks.elements.Water;

public class WaterBomb extends Spell implements Water, AreaOfEffect {
    @Override
    public double getRadius() {
        return 4.5;
    }

    @Override
    public void affectMultipleTargets() {
        System.out.printf("targets geraakt");

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

    }
}
