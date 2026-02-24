package domein.attacks.spells;

import domein.attacks.bases.Spell;
import domein.attacks.targeting.SingleTarget;
import domein.attacks.elements.Water;

public class WaterArrow extends Spell implements Water, SingleTarget {
    @Override
    public void applySlow() {
        System.out.println("slow applied");
    }

    @Override
    public double getWaterDamage() {
        return 15;
//        return Character.getDamage()*1.50;
    }

    @Override
    public void cast() {

    }
}
