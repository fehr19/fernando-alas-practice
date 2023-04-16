package canvas_assignments.monster_game_app.monster_chars;

import canvas_assignments.monster_game_app.Monster;

public class StoneMonster extends Monster {
    public StoneMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with stones!";
    }
}
