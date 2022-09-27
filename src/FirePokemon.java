public class FirePokemon extends Pokemon {
    private int level;
    private int flamesLeft;

    public FirePokemon(String name, int hp, int damage, String action) {
        super(name, hp, "Red");
        super.setDamage(damage);
        super.setAction(action);
        this.level = 1;
        this.flamesLeft = 3;
    }

    @Override
    public void makeSound() {
        System.out.println("BURN BABY B U R N ! ! !");
    }

    public void flameThrower() {
        if (this.flamesLeft > 0) {
            System.out.println();
            System.out.println("F F F F F F F F");
            System.out.println("F F F F F F F F");
            System.out.println("---- " + this.getName() + " JUST THREW A FLAME ----\n");
            System.out.println();
            this.flamesLeft--;
        }
    }

    @Override
    public void attack(Pokemon defender) {
        int oldHp = defender.getHp();
        super.attack(defender);
        flameThrower();
        if (defender.getHp() == 0 && oldHp > 0)
            levelUp();
    }

    @Override
    public void levelUp() {
        this.level += 1;
        System.out.println(this.getName() + " has leveled up to level " + this.level);
        flamesLeft = 3;
    }

}
