package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit{

    private int numberOfAttacks;

    public HeavyCavalry() {
        super(20, 150, true);
    }

    @Override
    public int doDamage() {
        numberOfAttacks++;
        if(numberOfAttacks == 1) {
            return super.doDamage() * 3;
        }
        return super.doDamage();
    }
}
