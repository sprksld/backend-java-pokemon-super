import com.sun.security.jgss.GSSUtil;

public class ElectricPokemon extends Pokemon {
    private int level;
    private int actionsDone;

    public ElectricPokemon(String name, int hp, int damage, String action) {
        super(name, hp, "Yellow");
        super.setDamage(damage);
        super.setAction(action);
        this.level = 1;
        this.actionsDone = 0;
    }

    @Override
    public void makeSound() {
        System.out.println("  SSSSSSS H O C K ! ! ! ");
        this.actionsDone++;
    }

    @Override
    public void levelUp() {
        this.level += 1;
        System.out.println(this.getName() + " has evolved to level " + this.level);
        this.actionsDone++;
    }
}
