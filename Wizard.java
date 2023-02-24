public class Wizard extends Character{
    Stick stick;

    public void attack(Enemy e){
        int attackP = this.power + stick.sharpness;
        int damage = attackP - e.protect;
        e.hp -= damage;
        System.out.println(this.name+"は"+this.stick.name+"でこうげきした");
        System.out.println(e.name+"に"+damage+"のダメージ");
        System.out.println(e.name+"の残り体力は"+e.hp);
    }
    
    public void castSpell(){
    }

    public void heal(Hero h){
        h.hp += 10;
        System.out.println(h.name+"の体力を10回復した");
    }

    public void useSkill(){

    }

    public void useItem(){

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
