package home_work_2.arrays;

public class WhileOperation implements IArraysOperation{
    @Override
    public String printAllElements(int[] array) {
        StringBuilder result = new StringBuilder();
        result.append("Итерирование циклом while \n [ ");

        int indexForWhile = 0;
        int elementForWhile;
        while(indexForWhile < array.length){
            elementForWhile = array[indexForWhile];
            result.append(elementForWhile).append(" ");
            indexForWhile++;
        }

        result.append("]");
        return result.toString();
    }

    @Override
    public String printThroughOneElements(int[] array) {
        StringBuilder result = new StringBuilder();
        result.append("Итерирование циклом while \n [ ");

        int indexForWhile = 0;
        int elementForWhile;
        while(indexForWhile < array.length){
            elementForWhile = array[indexForWhile];
            result.append(elementForWhile).append(" ");
            indexForWhile = indexForWhile + 2;
        }

        result.append("]");
        return result.toString();
    }

    @Override
    public String printElementsInReverseOrder(int[] array) {
        StringBuilder result = new StringBuilder();
        result.append("Итерирование циклом while \n [ ");

        int indexForWhile = array.length - 1;
        int elementForWhile;
        while(indexForWhile >= 0){
            elementForWhile = array[indexForWhile];
            result.append(elementForWhile).append(" ");
            indexForWhile--;
        }

        result.append("]");
        return result.toString();
    }
}
