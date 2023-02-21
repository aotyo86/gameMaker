public class SwordMaster extends Hero{
    public void seeStatus(){
        System.out.println("敵のステータス");
    }
    public SwordMaster(String name){
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
