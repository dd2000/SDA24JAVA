package Week_04_16_17mar2019.__sobota._T_1_typy_generyczne._Zadania_generics;

import java.util.List;

public class NumbersBox<T extends Number> {

    private List<T> numbers;

    public NumbersBox(List<T> numbers) {
        this.numbers = numbers;
    }

    public boolean isEmpty() {
        return numbers == null || numbers.isEmpty();
    }

    public T getFirstNumber() {
        if(isEmpty()) {
            return null;
        }

        return numbers.get(0);
    }

    public int getFirstNumberAsInt() {
        Number firstNumber = getFirstNumber();
        if(firstNumber == null) {
            return 0;
        }

        return firstNumber.intValue();
    }

    public T getLastNumber() {
        if(isEmpty()) {
            return null;
        }

        return numbers.get(numbers.size() - 1);
    }

    public int getLastNumberAsInt() {
        Number lastNumber = getLastNumber();
        if(lastNumber == null) {
            return 0;
        }

        return lastNumber.intValue();
    }
}