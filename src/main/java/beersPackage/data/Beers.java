package beersPackage.data;

public class Beers {

    private int Id;
    private String name;
    private int BrewerId;
    private int CategoryId;
    private Brewers brewers;

    public Beers() {
    }

    public Beers(int id, String name, int brewerId, int categoryId) {
        Id = id;
        this.name = name;
        brewerId = brewerId;
        CategoryId = categoryId;
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

    public int getBrewerId() {
        return BrewerId;
    }

    public void setBrewerId(int brewerId) {
        BrewerId = brewerId;
    }

    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(int categoryId) {
        CategoryId = categoryId;
    }

    @Override
    public String toString() {
        return "Beers{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", BrewerId=" + BrewerId +
                ", CategoryId=" + CategoryId +
                '}';
    }
}
