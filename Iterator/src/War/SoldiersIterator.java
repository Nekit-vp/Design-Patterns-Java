package War;

public class SoldiersIterator implements Iterator {

    private Army _army;
    boolean heroIsIterated;
    int currentGroup;
    int currentGroupSoldier;

    public SoldiersIterator(Army army) {
        _army = army;
        heroIsIterated = false;
        currentGroup = 0;
        currentGroupSoldier = 0;
    }

    public boolean hasNext() {
        if(!heroIsIterated) return true;
        if(currentGroup < _army.groupArrayList.size())return true;
        if(currentGroup == _army.groupArrayList.size()-1)
            return currentGroupSoldier < _army.groupArrayList.get(currentGroup).soldierArrayList.size();

        return false;
    }

    public Soldier next() {
        Soldier nextSoldier;
        // we still not iterated all soldiers in current group
        if (currentGroup < _army.groupArrayList.size()) {
            if (currentGroupSoldier < _army.groupArrayList.get(currentGroup).soldierArrayList.size()) {
                nextSoldier = _army.groupArrayList.get(currentGroup).soldierArrayList.get(currentGroupSoldier);
                currentGroupSoldier++;
            }
            // moving to next group
            else {
                currentGroup++;
                currentGroupSoldier = 0;
                return next();
            }
        }
        // hero is the last who left the battlefield
        else if (!heroIsIterated) {
            heroIsIterated = true;
            return _army.ArmyHero;
        } else {
            // THROW EXCEPTION HERE
            throw new IllegalStateException("End of colletion");
            //or set all counters to 0 and start again, but not recommended
        }
        return nextSoldier;
    }
}
