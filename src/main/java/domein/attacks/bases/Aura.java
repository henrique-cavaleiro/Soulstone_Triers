package domein.attacks.bases;

import domein.attacks.targeting.AreaOfEffect;

public abstract class Aura implements AreaOfEffect {
    protected boolean isActive;
    protected double damage;
    public abstract void cast();
}
