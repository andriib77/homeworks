package de.ait.homework57.Array2;

import java.util.Arrays;
import java.util.random.RandomGenerator;

public class Array2 {
    /*Цель: Написать программу на Java, которая выполняет следующие операции с двумерным массивом целых чисел.

Задачи:

    Создание и заполнение массива:
        Создайте двумерный массив целых чисел размером 5x5.
        Заполните массив случайными числами от 1 до 100.

    Поиск максимального элемента:
        Найдите максимальное число во всём массиве и выведите его на экран.

    Расчёт среднего значения:
        Вычислите и выведите среднее значение всех чисел в массиве.

    Поиск чисел по условию:
        Выведите на экран все числа, которые больше среднего значения

    Дополнительные требования:
        В коде должны быть использованы циклы для обработки массива.
        Для генерации случайных чисел используйте класс Random.
        Обратите внимание на обработку исключений, связанных с работой с массивами.
*/
    public static void main(String[] args) {
        int values[][] = new int[5][5];
        for (int i = 0; i < values.length; i++) {
            // do the for in the row according to the column size
            for (int j = 0; j < values[i].length; j++) {
                // multiple the random by 10 and then cast to in
                values[i][j] = ((int) (Math.random() * 100));
                System.out.print(values[i][j]);
            }
            // add a new line
            System.out.println();
        }
        System.out.println("Done");


        int max=values[0][0];
        for (int i=0; i<5; i++) //row
        {
            for (int j=0; j<5; j++) //coloum
            {
                if(values[i][j]>max)
                {
                    max=values[i][j];
                }
            }
        }
        System.out.println("Maximum number is "+max);
    }
   /* int average=values[0][0];
        for (int i=0; i<5; i++) //row
    {
        for (int j=0; j<5; j++) //coloum
        {
            if(values[i][j]>max)
            {
                max=values[i][j];
            }
        }
    }
        System.out.println("Average number is "+max);
}

**
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        for(int i = 0; i < data.length; i++) {
            Arrays.sort(data[i]);

            if(data[i][0] < minimum) minimum = data[i][0];
            if(data[i][data[i].length - 1] > maximum) maximum = data[i][data[i].length - 1];
        }

        System.out.println("Minimum = " + maximum);
        System.out.println("Maximum = " + minimum);
    }

        public static int getMaxValue (int[][] numbers){
            int maxValue = numbers[0][0];
            for (int j = 0; j < numbers.length; j++) {
                for (int i = 0; i < numbers[j].length; i++) {
                    if (numbers[j][i] > maxValue) {
                        maxValue = numbers[j][i];
                    }
                }
            }
            return maxValue;
        }


    }*/
}


