public class SwordMaster extends Hero{
    public void seeStatus(){
        System.out.println("敵のステータス");
    }
    @Override
    public void attack(Slime s){
        int attackP = this.power + sword.sharpness;
        int damage = (attackP-s.protect)*2;
        s.hp -= damage;
        System.out.println(this.name+"は"+sword.name+"で二回きりつけた");
        System.out.println(s.name+"に"+damage+"のダメージ");
        System.out.println(s.name+"の残り体力は"+s.hp);
    }
    public SwordMaster(String name){
        super("名無しのヒーロー");
        this.name = name;
        this.level=10;
        this.power = 50;
        this.protect = 50;
        this.speed = 50;
        this.mazic = 50;
        this.hp = 200;
        this.mp = 100;
    }
}
