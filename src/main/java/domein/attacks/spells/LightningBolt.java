package domein.attacks.spells;

import domein.attacks.bases.Spell;
import domein.attacks.elements.Lightning;
import domein.attacks.targeting.SingleTarget;

public class LightningBolt extends Spell implements Lightning, SingleTarget {
    @Override
    public void cast() {

    }

    @Override
    public void applyChainLightning() {

    }

    @Override
    public double getLightningDamage() {
        return 30;
    }
}
