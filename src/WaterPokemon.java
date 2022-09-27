public class WaterPokemon extends Pokemon {
    private int favoriteWaterTemperature;
    private String favoriteFood;

    public WaterPokemon(String name, int hp, int damage, String action) {
        super(name, hp, "Blue");
        super.setDamage(damage);
        super.setAction(action);

        this.favoriteWaterTemperature = 20;
        this.favoriteFood = "plankton";
    }

    public int getFavoriteWaterTemperature() {
        return favoriteWaterTemperature;
    }

    public void setFavoriteWaterTemperature(int favoriteWaterTemperature) {
        this.favoriteWaterTemperature = favoriteWaterTemperature;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    @Override
    public void makeSound() {
        System.out.println("SSSSS P L A S H !!! ~~~~");
        System.out.println("Now let's eat some " + this.favoriteFood);
    }

    public void eat() {
        System.out.println("Now eating ... " + this.favoriteFood);
    }
}