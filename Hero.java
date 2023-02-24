public class Hero extends Character{
    
    int money;
    Sword sword;

    public void flee(){
    }

    @Override
    public void attack(Enemy e){
        int attackP = this.power + sword.sharpness;
        int damage = attackP - e.protect;
        e.hp -= damage;
        System.out.println(this.name+"は"+sword.name+"でこうげきした");
        System.out.println(e.name+"に"+damage+"のダメージ");
        System.out.println(e.name+"の残り体力は"+e.hp);
    }

    public void castSpell(){

    }

    public void useSkill(){

    }

    public Hero(String name){
        //コンストラクタ(初期値を代入できる)
        this.name = name;
        this.level=1;
        this.power = 5;
        this.protect = 5;
        this.speed = 5;
        this.mazic = 5;
        this.hp = 20;
        this.mp = 10;
    }

    public void useItem(){

    }
}
