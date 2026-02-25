package domein.attacks.spells;

import domein.attacks.bases.Spell;
import domein.attacks.elements.Lightning;
import domein.attacks.targeting.SingleTarget;

public class LightningBolt extends Spell implements Lightning, SingleTarget {
    @Override
    public void cast() {
        applyChainLightning();
        enemyHit();

    }

    @Override
    public void applyChainLightning() {
        System.out.printf("enemies blitzed");
    }

    @Override
    public double getLightningDamage() {
        return 30;
    }

    @Override
    public void enemyHit() {
        System.out.printf("target hit");
    }
}
