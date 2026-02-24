package attacks.bases.Spells;

import attacks.targeting.SingleTarget;
import Spell;
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
