package mx.com.movies.beans;

public class Actor {

    public Actor() {
    }

    public Actor(int id_actor, String name, String lastName) {
        this.id_actor = id_actor;
        this.name = name;
        this.lastName = lastName;
    }

    public Actor(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public int getId_actor() {
        return id_actor;
    }

    public void setId_actor(int id_actor) {
        this.id_actor = id_actor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private int id_actor;
    private String name;
    private String lastName;

    @Override
    public String toString() {
        return "Actor{" +
                "id_actor=" + id_actor +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
