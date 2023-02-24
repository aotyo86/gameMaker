public class Enemy {
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
    char suffix;
    public void attack(){
        System.out.println(this.name+"はこうげきした。");
    }
    public void flee(){
        System.out.println(name+"は逃げ出した");
    }
}
