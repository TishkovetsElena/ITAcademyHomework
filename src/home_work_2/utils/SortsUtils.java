package home_work_2.utils;

public class SortsUtils {

    /**
     * Метод сортирует массив алгоритмом пузырьковая сортировка
     * @param arr массив целых чисел
     */
    public static void sort(int[] arr) {
        boolean flag = false;
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = arr.length - 1; i > j; i--) {
                if (arr[i] < arr[i - 1]) {
                    flag = true;
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                }
            }
            if(flag == false){
                break;
            }
            flag = false;
        }
    }

    /**
     * Метод сортирует массив алгоритмом шейкерная сортировка
     * @param array массив целых чисел
     */
    public static void shake(int[] array){
        int left = 0;
        int right = array.length -1;
        boolean flag = true;
        while(right > left){
            flag = false;
            for (int i = left; i < right; i++) {
                if(array[i] > array[i + 1] ){
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = true;
                }
            }
            if(flag == false){
                break;
            }
            right--;
            flag = false;
            for (int i = right; i > left ; i--) {
                if(array[i] < array[i -1]){
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    flag = true;
                }
            }
            if(flag == false){
                break;
            }
            left++;

        }
    }
}
