package home.work.l2;

class Product{
    private Long id;
    private String name;
    private int cost;

    public Product(Long id, String name, int cost){
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}