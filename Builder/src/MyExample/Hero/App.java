package MyExample.Hero;

import MyExample.Hero.components.*;

public class App {
    public static void main(String[] args) {
        Hero mag = new Hero.Builder(Profession.MAGE, "Riobard")
                .withWeapon(Weapon.DAGGER)
                .withHairColor(HairColor.BLACK)
                .build();
        System.out.println(mag.toString());

        Hero warrior = new Hero.Builder(Profession.WARRIOR, "Amber")
                .withHairColor(HairColor.BLOND)
                .withHairType(HairType.LONG_CURLY).withArmor(Armor.CHAIN_MAIL).withWeapon(Weapon.SWORD)
                .build();
        System.out.println(warrior.toString());

        Hero thief = new Hero.Builder(Profession.THIEF, "Desmond")
                .withHairType(HairType.BALD)
                .withWeapon(Weapon.BOW)
                .build();
        System.out.println(thief.toString());

    }
}
