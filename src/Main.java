import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // create some Pokemon
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 60, 20, "Iron Tail");
        FirePokemon magmar = new FirePokemon("Magmar", 80, 30, "Fire Punch");
        GrassPokemon tangela = new GrassPokemon("Tangela", 80, 20, "Bind");
        WaterPokemon wailmer = new WaterPokemon("Wailmer", 120, 20, "Splash");

        // create a playingfield (further actions not implemented yet)
        List<Pokemon> game = new ArrayList<Pokemon>();
        game.add( pikachu );
        game.add( magmar );
        game.add( tangela );
        game.add( wailmer );

        System.out.println();
        for ( Pokemon p : game ) {
            System.out.println(p.getColor() + " " + p.getName() + " entered the playingfield");
        }
        System.out.println();

        // let those Pokeman do some pre-defined things ...
        pikachu.attack(magmar);
        tangela.eat();
        tangela.eat();

        pikachu.attack(magmar);
        magmar.attack(tangela);
        tangela.eat();
        tangela.attack(pikachu);
        wailmer.attack(tangela);
        tangela.eat();
        magmar.attack(pikachu);
        tangela.eat();
        magmar.attack(pikachu);
        wailmer.attack(magmar);
        magmar.attack(pikachu);
        tangela.eat();
        tangela.eat();
        magmar.attack(pikachu);
        tangela.eat();
        magmar.attack(pikachu);

        pikachu.printHp();
        magmar.printHp();
        tangela.printHp();
        wailmer.printHp();

    }
}