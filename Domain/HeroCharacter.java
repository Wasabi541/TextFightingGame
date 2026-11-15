package Domain;

import java.util.ArrayList;

public class HeroCharacter extends Character{
    public ArrayList<String> skillList;

    public HeroCharacter(){
        super();
        skillList = new ArrayList<String>();
    }

    public HeroCharacter(String name, int HP, int attack, int defense) {
        super(name, HP, attack, defense);
        skillList = new ArrayList<String>();
    }
}
