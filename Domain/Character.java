package Domain;

public class Character {
    public String name;
    public int HP;
    public int maxHP;
    public int attack;
    public int defense;

    public Character() {
    }

    public Character(String name, int HP, int attack, int defencse) {
        this.name = name;
        this.HP = HP;
        this.maxHP = HP;
        this.attack = attack;
        this.defense = defencse;
    }

    public boolean isAlive() {
        return HP > 0;
    }

    public void heal(int amount) {
        HP = +amount;
        if (HP > maxHP) {
            HP = maxHP;
        }
    }

    public void takeDamage(int damage) {
        HP = HP - damage;
        if (HP < 0) {
            HP = 0;
        }
    }

    public void show() {
        System.out.println(name + "[current HP:" + HP + ", attack" + attack + ", defense" + defense + "]");    
    }

}
