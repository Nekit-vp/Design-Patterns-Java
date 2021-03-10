package War;

public class CreateArmyTest {
    public static void main(String[] args) {

        Army earthArmy = new Army();

        Group groupA = new Group();
        for(int i=1; i<4; ++i)
            groupA.addNewSoldier(new Soldier("Alpha:" + i));

        Group groupB = new Group();
        for(int i=1; i<3; ++i)
            groupB.addNewSoldier(new Soldier("Beta:" + i));

        Group groupC = new Group();
        for(int i=1; i<2; ++i)
            groupC.addNewSoldier(new Soldier("Gamma:" + i));

        earthArmy.ArmyHero = new Hero("Богатырь");
        earthArmy.addArmyGroup(groupB);
        earthArmy.addArmyGroup(groupA);
        earthArmy.addArmyGroup(groupC);

        Iterator iterator = new SoldiersIterator(earthArmy);

        while(iterator.hasNext()){
            Soldier currSoldier = (Soldier) iterator.next();
            currSoldier.treat();
        }
    }
}
