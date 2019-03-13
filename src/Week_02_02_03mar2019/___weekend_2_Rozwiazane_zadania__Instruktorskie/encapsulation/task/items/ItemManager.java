package Week_02_02_03mar2019.___weekend_2_Rozwiazane_zadania__Instruktorskie.encapsulation.task.items;

public class ItemManager {
    public ItemModel createShopItem(String title, String description, double price) {
        return new ItemModel(title, description, price);
    }
}
