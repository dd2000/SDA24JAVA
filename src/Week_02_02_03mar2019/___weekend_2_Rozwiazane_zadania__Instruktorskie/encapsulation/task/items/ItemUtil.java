package Week_02_02_03mar2019.___weekend_2_Rozwiazane_zadania__Instruktorskie.encapsulation.task.items;

public class ItemUtil {
    public static String truncate(String text, int maxLength) {
        if (text == null || text.length() < maxLength) {
            return text;
        }
        return text.substring(0, maxLength);
    }
}