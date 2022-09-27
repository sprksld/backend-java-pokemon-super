public class GrassPokemon extends Pokemon {

    private int grassHeight = 1;        // centimeters
    private int grassCuttingHeight;

    public GrassPokemon(String name, int hp, int damage, String action) {
        super(name, hp, "Green");
        super.setDamage(damage);
        super.setAction(action);
        this.grassCuttingHeight = 5;
    }

    public void setGrassCuttingHeight(int grassCuttingHeight) {
        this.grassCuttingHeight = grassCuttingHeight;
    }

    public void mowLawn() {
        if (this.grassHeight > this.grassCuttingHeight) {
            System.out.println("Mowing the lawn ...");
            this.grassHeight = 1;
        }
    }

    public void eat() {
        System.out.println("Ssst. I'm eating ...");
        this.grassHeight++;
        mowLawn();
    }

    @Override
    public void makeSound() {
        this.grassHeight++;
        System.out.println("S S S S S S S S SS S L IIIIIIII D E");
    }
}
