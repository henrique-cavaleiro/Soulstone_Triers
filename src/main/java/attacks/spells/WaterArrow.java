package attacks.spells;

import attacks.bases.Spell;
import attacks.targeting.SingleTarget;
import attacks.elements.Water;

public class WaterArrow extends Spell implements Water, SingleTarget {
    @Override
    public void applySlow() {
        System.out.println("slow applied");
    }

    @Override
    public double getWaterDamage() {
        return 15;
    }

    @Override
    public void cast() {

    }
}
