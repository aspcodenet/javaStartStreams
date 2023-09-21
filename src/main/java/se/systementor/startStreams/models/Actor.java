package se.systementor.startStreams.models;

public class Actor {
   private int id;

    public Actor(int id, String name, int birthyear) {
        this.id = id;
        this.name = name;
        this.birthyear = birthyear;
    }

    private String name;
   private int birthyear;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBirthyear() {
        return birthyear;
    }
    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

}
