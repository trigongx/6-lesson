public class Boss extends GameEntity{
    private Weapon bossWeapon;

    Weapon weapon = new Weapon();



    public Weapon getBossWeapon() {
        return bossWeapon;
    }

    public void setBossWeapon(Weapon bossWeapon) {
        this.bossWeapon = bossWeapon;
    }

    public String printInfo(){
        return "Health:" + getHealth() +
                " damage:" + getDamage() +
                " weapon:" + weapon.getNameOfWeapon() +
                " type:" + weapon.getTypeOfWeapon() ;
    }
}
