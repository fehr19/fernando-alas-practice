package canvas_assignments.monster_game_app;

public class Monster {
    String name;

    public Monster(String name) {
        this.name = name;
    }

    public String attack() {
        return "!^_&^$@+%$* I don't know how to attack!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
