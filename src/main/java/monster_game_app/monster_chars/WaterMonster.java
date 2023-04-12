package monster_game_app.monster_chars;

import monster_game_app.Monster;

public class WaterMonster extends Monster {
    public WaterMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with water!";
    }
}
