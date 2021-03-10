package War;

import java.util.ArrayList;

public class Group {

    public ArrayList<Soldier> soldierArrayList;

    public Group() {
        soldierArrayList = new ArrayList<>();
    }

    public void addNewSoldier(Soldier soldier) {
        soldierArrayList.add(soldier);
    }
}
