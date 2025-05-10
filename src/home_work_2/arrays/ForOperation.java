package home_work_2.arrays;

public class ForOperation implements IArraysOperation{
    @Override
    public String printAllElements(int[] array) {
        StringBuilder result = new StringBuilder();
        result.append("Итерирование циклом for \n [ ");

        for (int i = 0; i < array.length; i++) {
            result.append(array[i]).append(" ");
        }

        result.append("]");
        return result.toString();
    }

    @Override
    public String printThroughOneElements(int[] array) {
        StringBuilder result = new StringBuilder();
        result.append("Итерирование циклом for \n [ ");

        for (int i = 0; i < array.length; ) {
            result.append(array[i]).append(" ");
            i = i + 2;
        }

        result.append("]");
        return result.toString();
    }

    @Override
    public String printElementsInReverseOrder(int[] array) {
        StringBuilder result = new StringBuilder();
        result.append("Итерирование циклом for \n [ ");

        for (int i = array.length - 1; i >= 0; i-- ) {
            result.append(array[i]).append(" ");
        }

        result.append("]");
        return result.toString();
    }
}
