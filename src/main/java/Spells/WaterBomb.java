package Spells;

import bases.AreaOfEffect;
import bases.Water;

public class WaterBomb implements Water, AreaOfEffect {
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
}
