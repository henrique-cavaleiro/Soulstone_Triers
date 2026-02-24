package domein.attacks.spells;

import domein.attacks.bases.Aura;
import domein.attacks.elements.Fire;
import domein.attacks.elements.Lightning;
import domein.attacks.elements.Water;
import domein.attacks.elements.Wind;

public class TheOneSpell extends Aura implements Fire, Water, Wind, Lightning {
    @Override
    public void applyBurn() {

    }

    @Override
    public double getFireDamage() {
        return 30;
    }

    @Override
    public void applyChainLightning() {

    }

    @Override
    public double getLightningDamage() {
        return 30;
    }

    @Override
    public void applySlow() {

    }

    @Override
    public double getWaterDamage() {
        return 30;
    }

    @Override
    public void applyKnockback() {

    }

    @Override
    public double getWindDamage() {
        return 30;
    }

    @Override
    public double getRadius() {
        return 15;
    }

    @Override
    public void affectMultipleTargets() {

    }
}
