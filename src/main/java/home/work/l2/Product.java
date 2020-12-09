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

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}