public class Main{
    public static void main(String arg[]){
        SwordMaster sm = new SwordMaster("あおちょ神");
        Hero h = new Hero("あおちょ");
        Wizard w = new Wizard( "魔法使い");
        Slime s1 = new Slime();
        Slime s2 = new Slime('A');
        Sword ken = new Sword("銅の剣",3);
        h.sword = ken;
        Sword ken2 = new Sword("鉄の剣",5);
        sm.sword = ken2;
        Stick st = new Stick("木の杖",1);
        w.stick = st;
        System.out.println(h.name+"は"+h.sword.name+"をそうびしている。");
        System.out.println(w.name+"は"+w.stick.name+"を装備している。");
        System.out.println(h.hp);

        h.attack(s1);
        s1.attack();
        w.heal(h);
        w.attack(s2);
        sm.attack(s2);
    }
}