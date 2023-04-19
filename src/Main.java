
public class Main {
    public static void main(String[] args) {

        Boss boss1 = new Boss();
        boss1.setHealth(700);
        boss1.setDamage(250);
        boss1.weapon.setNameOfWeapon("AK-47");
        boss1.weapon.setTypeOfWeapon(WeaponType.FIREARMS);
        System.out.println(boss1.printInfo());
        Skeleton sk1 = new Skeleton();
        sk1.setHealth(130);
        sk1.setDamage(70);
        sk1.weapon.setNameOfWeapon("Crossbow");
        sk1.weapon.setTypeOfWeapon(WeaponType.PROJECTILE);
        sk1.setNumberOfArrows(7);
        Skeleton sk2 = new Skeleton();
        sk2.setHealth(100);
        sk2.setDamage(50);
        sk2.weapon.setNameOfWeapon("Crossbow");
        sk2.weapon.setTypeOfWeapon(WeaponType.PROJECTILE);
        sk2.setNumberOfArrows(5);
        System.out.println(sk1.printInfo());
        System.out.println(sk2.printInfo());
    }
}


