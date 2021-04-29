package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit {

    private boolean shieldIntact = true;

    public Swordsman(boolean armored) {
        super(10, 100, armored);
    }

    @Override
    public void sufferDamage(int damage) {
        if (shieldIntact) {
            shieldIntact = false;
            return;
        }
        super.sufferDamage(damage);
    }
}
