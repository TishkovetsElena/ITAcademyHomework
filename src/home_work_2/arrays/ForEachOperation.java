package home_work_2.arrays;

public class ForEachOperation implements IArraysOperation{
    @Override
    public String printAllElements(int[] array) {
        StringBuilder result = new StringBuilder();
        result.append("Итерирование циклом foreach \n [ ");

        for(int arrayElement : array){
            result.append(arrayElement).append(" ");
        }

        result.append("]");
        return result.toString();
    }

    @Override
    public String printThroughOneElements(int[] array) {
        StringBuilder result = new StringBuilder();
        result.append("Итерирование циклом foreach \n [ ");

        int[] newArray = new int[((array.length + 1)/2)];
        int j = 0;
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[j];
            j = j + 2;
        }

        for(int arrayElement : newArray){
            result.append(arrayElement).append(" ");
        }

        result.append("]");
        return result.toString();
    }

    @Override
    public String printElementsInReverseOrder(int[] array) {
        StringBuilder result = new StringBuilder();
        result.append("Итерирование циклом foreach \n [ ");

        int j = 0;
        int[] newArray = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            newArray[i] = array[j];
            j++;
        }

        for(int arrayElement : newArray){
            result.append(arrayElement).append(" ");
        }

        result.append("]");
        return result.toString();
    }
}
