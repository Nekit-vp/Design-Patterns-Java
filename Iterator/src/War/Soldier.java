package War;

import java.util.ArrayList;

public class Soldier {
    public String Name;
    public int Health;
    protected int maxHealthPoints = 100;

    public Soldier(String name){
        Name = name;
    }

    public void treat(){
        Health = maxHealthPoints;
        System.out.println(Name);
    }
}

class Hero extends Soldier {
    protected int maxHealthPoints = 500;

    public Hero(String name) {
        super(name);
    }
}
