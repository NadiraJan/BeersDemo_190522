package beersPackage.data;

public class Brewers {

    private int Id;
    private String name;

    public Brewers() {
    }

    public Brewers(int id, String name) {
        Id = id;
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Brewers{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }
}
