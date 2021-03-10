package War;

import java.util.ArrayList;

public class Army {

    public Hero ArmyHero;

    public ArrayList<Group> groupArrayList;

    public Army() {
        groupArrayList = new ArrayList<>();
    }

    public void addArmyGroup(Group group) {
        groupArrayList.add(group);
    }
}
