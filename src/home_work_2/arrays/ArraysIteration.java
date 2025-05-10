package home_work_2.arrays;

/**
 * 2.2 Создать класс ArraysIteration. В этом классе написать перебор (итерирование) массива
 * при помощи do....while, while, for, foreach. Вызывая ранее созданный метод arrayFromConsole
 * (ArraysUtils.arrayFromConsole()) получить массив. Все задачи в одном классе, в отдельных методах,
 * в каждом методе используется 4 разных цикла. Должно получиться 3 метода:
 * 		2.2.1. Вывести все элементы в консоль.
 * 		2.2.2. Вывести каждый второй элемент массива в консоль.
 * 		2.2.3. Вывести все элементы массива в консоль в обратном порядке.
 */
public class ArraysIteration {

    public static String printAllElements(){
        int[] array = ArraysUtils.arrayFromConsole();
        StringBuilder result = new StringBuilder();
        result.append("Итерирование циклом do...while \n [ ");
        int index = 0;
        int element;
        do{
            element = array[index];
            result.append(element).append(" ");
            index++;
        }while(index < array.length);

        result.append("]\n");

        result.append("Итерирование циклом while \n [ ");

        int indexForWhile = 0;
        int elementForWhile;
        while(indexForWhile < array.length){
            elementForWhile = array[indexForWhile];
            result.append(elementForWhile).append(" ");
            indexForWhile++;
        }

        result.append("]\n");

        result.append("Итерирование циклом for \n [ ");

        for (int i = 0; i < array.length; i++) {
            result.append(array[i]).append(" ");
        }

        result.append("]\n");

        result.append("Итерирование циклом foreach \n [ ");

        for(int arrayElement : array){
            result.append(arrayElement).append(" ");
        }

        result.append("]\n");

        return result.toString();
    }

    public static String printThroughOneElements(){
        int[] array = ArraysUtils.arrayFromConsole();
        StringBuilder result = new StringBuilder();
        result.append("Итерирование циклом do...while \n [ ");
        int index = 0;
        int element;
        do{
            element = array[index];
            result.append(element).append(" ");
            index = index + 2;
        }while(index < array.length);

        result.append("]\n");

        result.append("Итерирование циклом while \n [ ");

        int indexForWhile = 0;
        int elementForWhile;
        while(indexForWhile < array.length){
            elementForWhile = array[indexForWhile];
            result.append(elementForWhile).append(" ");
            indexForWhile = indexForWhile + 2;
        }

        result.append("]\n");

        result.append("Итерирование циклом for \n [ ");

        for (int i = 0; i < array.length; ) {
            result.append(array[i]).append(" ");
            i = i + 2;
        }

        result.append("]\n");

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

        result.append("]\n");

        return result.toString();
    }

    public static String printElementsInReverseOrder(){
        int[] array = ArraysUtils.arrayFromConsole();
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

        result.append("Итерирование циклом while \n [ ");

        int indexForWhile = array.length - 1;
        int elementForWhile;
        while(indexForWhile >= 0){
            elementForWhile = array[indexForWhile];
            result.append(elementForWhile).append(" ");
            indexForWhile--;
        }

        result.append("]\n");

        result.append("Итерирование циклом for \n [ ");

        for (int i = array.length - 1; i >= 0; i-- ) {
            result.append(array[i]).append(" ");
        }

        result.append("]\n");

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

        result.append("]\n");

        return result.toString();
    }




}
