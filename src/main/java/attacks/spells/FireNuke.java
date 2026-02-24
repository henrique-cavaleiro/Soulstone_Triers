package attacks.bases.Spells;

public class FireNuke extends FireBomb {
    @Override
    public double getFireDamage() {
        return 100;
    }

    @Override
    public double getRadius() {
        return 10;
    }

    public double getCooldown(){
        return 10;
    }
}
