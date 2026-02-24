package attacks.bases;

public abstract class Spell {
    protected double cooldown;
    protected double damage;

    public abstract void cast();
}