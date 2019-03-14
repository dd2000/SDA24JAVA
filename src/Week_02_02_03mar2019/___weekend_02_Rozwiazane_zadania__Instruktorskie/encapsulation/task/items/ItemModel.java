package Week_02_02_03mar2019.___weekend_02_Rozwiazane_zadania__Instruktorskie.encapsulation.task.items;

public class ItemModel {
    private String title;
    private String description;
    private double price;

    public ItemModel(String title, String description, double price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ItemModel{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}