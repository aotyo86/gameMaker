public class Hero {
    String name;
    int level;
    int money;
    int exp;
    int power;
    int protect;
    int speed;
    int mazic;
    int hp;
    int mp;
    Sword sword;

    public void attack(){
        System.out.println(this.name+"は"+this.sword.name+"でこうげきした");
    }
    public void defend(){

    }
    public void castSpell(){

    }
    public void useSkill(){

    }
    public void flee(){
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
    public Hero(){
        this("ダミー");
    }

}
