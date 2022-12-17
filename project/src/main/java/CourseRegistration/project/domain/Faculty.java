package CourseRegistration.project.domain;

public class Faculty extends Person{

    private int id;
    private String tile;


    public Faculty(String name, String email, int id, String tile) {
        super(name, email);
        this.id = id;
        this.tile = tile;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTile() {
        return tile;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "id=" + id +
                ", tile='" + tile + '\'' +
                '}';
    }
}
