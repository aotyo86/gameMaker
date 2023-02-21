public class Wizard {
    String name;
    int level;
    int exp;
    int power;
    int protect;
    int speed;
    int mazic;
    int hp;
    int mp;
    Stick stick;

    public void attack(){
        System.out.println(this.name+"は"+this.stick.name+"でこうげきした");
    }
    public void defend(){

    }
    public void castSpell(Hero h){
        h.hp += 10;
        System.out.println(h.name+"の体力を10回復した");
    }
    public void useSkill(){

    }
    public void flee(){
    }
    public Wizard(String name){
        this.name = name;
        level = 1;
        exp = 0;
        power = 1;
        protect = 3;
        speed = 7;
        mazic = 10;
        hp = 18;
        mp = 20;
    }
}
