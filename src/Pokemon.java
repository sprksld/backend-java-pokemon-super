public abstract class Pokemon {
    private String name;
    private int hp;
    private String color;

    private int damage;
    private String action;

    public Pokemon(String name, int hp, String color) {
        this.name = name;
        this.hp = hp;
        this.color = color;
        System.out.println(name + " starts with " + hp + " HP");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void printHp() {
        System.out.println(this.name + " has " + this.hp + " HP left");
    }

    public abstract void makeSound();

    public void attack(Pokemon defender) {
        if (defender.getHp() <= 0) {
            System.out.println(defender.getName() + " is finished. No need to attack.");
            return;
        }

        System.out.println(this.color + " " + this.getName() + "(" + this.getHp() + ")"
                + " attacks " + defender.color + " " + defender.getName() + "(" + defender.getHp() + ")"
                + " with " + this.getAction()
                + " and does " + this.getDamage() + " damage"
        );

        if (defender.getHp() > this.getDamage()) {
            defender.setHp(defender.getHp() - this.getDamage());
        } else {
            defender.setHp(0);
        }
        this.makeSound();

        if (defender.getHp() > 0) {
            System.out.println(defender.getName() + " has " + defender.getHp() + " left after the attack");
//            defender.printHp();
        } else {
            System.out.println(defender.getName() + " is FINISHED");
        }
    }

    public void levelUp() {
    }
}
