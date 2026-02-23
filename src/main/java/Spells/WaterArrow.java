package Spells;

import bases.SingleTarget;
import bases.Water;

public class WaterArrow implements Water, SingleTarget {
    @Override
    public void applySlow() {
        System.out.println("slow applied");
    }

    @Override
    public double getWaterDamage() {
        return 15;
    }
}
