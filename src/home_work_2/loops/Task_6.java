package home_work_2.loops;

/**
 * 1.6. Вывести таблицу умножения в консоль. В консоли должно получиться также как и на картинке (динозаврика рисовать не надо):
 * https://www.dropbox.com/s/ibakfuppvy2w32g/multiplication_table.jpeg?dl=0
 */
public class Task_6 {
    public static void main(String[] args) {
        System.out.println("  ТАБЛИЦА    УМНОЖЕНИЯ  ");
        int[][][] array = new int[10][11][];
        int numberOfSeries = 2;
        int numberOfRows = 10;

        int numberOfColumn = 4;
        int sum;
        int multiplier1 = 2;
        int multiplier2 = 1;

        for (int i = 0; i < numberOfSeries; i++) {
            for (int j = 0; j < numberOfRows; j++) {
                for (int k = 0; k < numberOfColumn; k++) {
                    sum = multiplier1 * multiplier2;
                    if (sum < 10) {
                        System.out.print(" " + multiplier1 + " x  " + multiplier2 + " =  " + sum + " |");
                    } else if(multiplier2 == 10){
                        System.out.print(" " + multiplier1 + " x " + multiplier2 + " = " + sum + " |");
                    } else {
                        System.out.print(" " + multiplier1 + " x  " + multiplier2 + " = " + sum + " |");
                    }
                    multiplier1++;
                }
                System.out.println();
                multiplier1 = 2;
                multiplier2++;
                }

            multiplier2 = 1;
            System.out.println("________________________________________________________");
        }
    }
}
