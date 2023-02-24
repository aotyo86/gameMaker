public abstract class Character {
    String name;
    int level;
    int exp;
    int power;
    int protect;
    int speed;
    int mazic;
    int hp;
    int mp;
    Wepon wepon;
    Item item;

    public abstract void attack(Enemy e);

    public void protect(){
        protect = this.protect*2;
    }

    public abstract void castSpell();

    public abstract void useSkill();

    public abstract void useItem();

}
