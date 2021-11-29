public class Blink {
    public int ID;
    public String name;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // Dit constructor en geeft informatie over het object!
    public Blink(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }


}
