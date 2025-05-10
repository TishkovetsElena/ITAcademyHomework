package home_work_2.arrays;

public class DoWhileOperation implements IArraysOperation{
    @Override
    public String printAllElements(int[] array) {
        StringBuilder result = new StringBuilder();
        result.append("Итерирование циклом do...while \n [ ");
        int index = 0;
        int element;
        do{
            element = array[index];
            result.append(element).append(" ");
            index++;
        }while(index < array.length);

        result.append("]");
        return result.toString();
    }

    @Override
    public String printThroughOneElements(int[] array) {
        StringBuilder result = new StringBuilder();
        result.append("Итерирование циклом do...while \n [ ");
        int index = 0;
        int element;
        do{
            element = array[index];
            result.append(element).append(" ");
            index = index + 2;
        }while(index < array.length);

        result.append("]");
        return result.toString();
    }

    @Override
    public String printElementsInReverseOrder(int[] array) {
        StringBuilder result = new StringBuilder();
        result.append("Итерирование циклом do...while \n [ ");
        int index = array.length - 1;
        int element;
        do{
            element = array[index];
            result.append(element).append(" ");
            index--;
        }while(index >= 0);

        result.append("]\n");
        return result.toString();
    }
}
