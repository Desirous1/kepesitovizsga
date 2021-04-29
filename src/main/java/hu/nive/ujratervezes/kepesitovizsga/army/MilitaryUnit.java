package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {

    private int damage;
    private int hitPoints;
    private boolean armored;

    public MilitaryUnit(int damage, int hitPoints, boolean armored) {
        this.damage = damage;
        this.hitPoints = hitPoints;
        this.armored = armored;
    }

    public void sufferDamage(int damage) {
        if (armored) {
            hitPoints -= damage / 2;
        } else {
            hitPoints -= damage;
        }
    }

    public int doDamage() {
        return damage;
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
