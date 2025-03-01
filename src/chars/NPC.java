//baseline character class; will have subclasses
public class NPC {

    String name = "";
    int lvl = 0;

    public NPC (String name, int lvl) {
        this.name=name;
        this.lvl=lvl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }



}