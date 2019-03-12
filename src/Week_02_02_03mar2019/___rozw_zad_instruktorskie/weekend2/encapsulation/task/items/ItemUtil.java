package Week_02_02_03mar2019.___rozw_zad_instruktorskie.weekend2.encapsulation.task.items;

public class ItemUtil {
    public static String truncate(String text, int maxLength) {
        if (text == null || text.length() < maxLength) {
            return text;
        }
        return text.substring(0, maxLength);
    }
}