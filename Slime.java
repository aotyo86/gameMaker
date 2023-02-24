public class Slime extends Enemy{

    public Slime(){
        name = "スライム";
        level = 1;
        money = 5;
        exp = 5;
        power = 5;
        protect = 5;
        speed = 5;
        mazic = 0;
        hp = 8;
        mp = 0;
    }

    public Slime(char c){
        name = "スライム";
        level = 1;
        money = 5;
        exp = 5;
        power = 5;
        protect = 5;
        speed = 5;
        mazic = 0;
        hp = 8;
        mp = 0;
        suffix = c;
    }
}

