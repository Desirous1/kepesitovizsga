package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.List;

public class Army {

    private List<MilitaryUnit> militaryUnitList = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        militaryUnitList.add(militaryUnit);
    }

    public void damageAll(int damage) {
        for (MilitaryUnit oi : militaryUnitList) {
            oi.sufferDamage(damage);
            if (oi.getHitPoints() < 25) {
                militaryUnitList.remove(oi);
            }
        }
    }

    public int getArmyDamage() {
        int result = 0;
        for (MilitaryUnit oi : militaryUnitList) {
            result += oi.doDamage();
        }
        return result;
    }

    public int getArmySize() {
        return militaryUnitList.size();
    }
}