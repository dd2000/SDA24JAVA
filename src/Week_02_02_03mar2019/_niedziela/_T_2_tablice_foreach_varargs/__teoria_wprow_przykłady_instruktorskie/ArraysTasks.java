package Week_02_02_03mar2019._niedziela._T_2_tablice_foreach_varargs.__teoria_wprow_przykłady_instruktorskie;

public class ArraysTasks {
    public static void main(String[] args) {
        ArraysMethods arrays = new ArraysMethods();

        String[] strings = {"Toshiba", "Lenovo", "Dell", "HP"};
        arrays.printArray(strings);

        arrays.printArrayBasedOnVarargs("Toshiba", "Lenovo", "Dell", "HP", "Apple");
    }
}
