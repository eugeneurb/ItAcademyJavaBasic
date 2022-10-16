import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Random;

public class HomeWork_4 {
    public static void main(String[] args) {

        getFactorial(0);
        productNumbers(25);
        sumOfNumbers(7893823445L);
        secondSipmleNumber();
        splitSeven();
        accountingFormat(1990255L);
        randomArray();
        otherArray();
        maxIndex();
        minMaxSum();
        arrayReverse();
        butterfly();

    }

    //Вычислить факториал целых чисел от 0 до 10 с помощью цикла while для каждого.
    public static void getFactorial(int a) {
        long factorial = 1;

        while (a <= 10) {
            if (a == 0) {
                System.out.println("Факториал числа 0=1");
                a++;
            }
            factorial = factorial * a;
            System.out.println("Факториал числа " + a + "=" + factorial);
            a++;
        }
    }

    //Вычислить произведение чисел от 1 до 25 с помощью цикла do while.
    public static void productNumbers(int m) {
        long prod = 1;
        int b = 1;

        do {
            prod = prod * b;
            b++;
        } while (b <= m);

        System.out.println("Произведение чисел от 1 до 25 " + prod);
    }

    //Посчитать сумму цифр числа 7893823445 с помощью цикла do while.
    public static void sumOfNumbers(long c) {
        int sum = 0;

        do {
            sum += c % 10;
            c /= 10;
        } while (c != 0);

        System.out.println("Сумма цифр числа равна sum=" + sum);
    }

    /* Найти среди чисел от 50 до 70 второе простое число(число называют простым,
    если оно делится без остатка только на 1 и себя) и завершить цикл с использованием break.*/
    public static void secondSipmleNumber() {
        boolean second = false;

        for (int e = 50; e <= 70; e++) {
            boolean first = true;
            for (int f = 2; f < e; f++) {
                if (e % f == 0) {
                    first = false;
                    break;
                }
            }
            if (first) {
                if (second) {
                    System.out.println("Второе простое число в заданном диапозоне " + e);
                    break;
                }
                second = true;
            }
        }
    }

    //Для целых чисел, которые делятся на 7 в диапазоне от 1 до 100, вывести на экран строку “Hope!”.
    public static void splitSeven() {

        for (int g = 1; g <= 100; g++)
            if (g % 7 == 0) {
                System.out.println(g + " Hope! ");
            }
    }


    /*Задать произвольное целое число и вывести его в бухгалтерском формате, то есть, начиная справа,
    каждые три позиции отделяются пробелом. Например, число 20023143 должно быть выведено как 20 023 143.*/
    public static void accountingFormat(long h) {
        final var formatSymbols = new DecimalFormatSymbols();
        formatSymbols.setGroupingSeparator(' ');
        final var decimalFormat = new DecimalFormat("#,###", formatSymbols);
        final var result = decimalFormat.format(h);
        System.out.println("Заданное число " + h + " в бухгатерском формате " + result);
    }

    /*Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями
    целочисленного типа и выведите последний элемент массива на экран.*/
    public static void randomArray() {
        int[] random = new int[10];
        Random rand = new Random();

        for (int i = 0; i < random.length; i++) {
            random[i] = rand.nextInt(20);
        }
        System.out.println("Случайный массив:" + Arrays.toString(random));
        System.out.println("Последний элемент массива:" + random[9]);
    }

    /*Создайте переменную для массива из 10 элементов (другим способом).
    Выведите на экран элементы, стоящие на четных позициях (индексы).*/
    public static void otherArray() {
        int[] other = new int[10];

        for (int j = 0; j < other.length; j++) {
            other[j] = 2 * j;
            if (j % 2 == 0) {
                System.out.println("Четный индекс " + j + " равен " + other[j]);
                j++;
            }
        }
        System.out.println("Массив для вывода четных значений:" + Arrays.toString(other));
    }

    /*Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями целочисленного типа.
    Найдите максимальный элемент и выведите его индекс.*/
    public static void maxIndex() {
        int[] maxArray = new int[10];
        Random comp = new Random();
        int index = 0;

        for (int i = 0; i < maxArray.length; i++) {
            maxArray[i] = comp.nextInt(50);
        }
        System.out.println("Поиск максимального элемента из массива:" + Arrays.toString(maxArray));
        int max = maxArray[0];

        for (int i = 0; i < maxArray.length; i++) {
            if (max < maxArray[i]) {
                max = maxArray[i];
                index = i;
            }
        }
        System.out.println("Максильное значение max=" + max + ". Его индекс:" + index);
    }

    /*Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями целочисленного типа.
    Определите сумму элементов массива, расположенных между минимальным и максимальным значениями (не включая).
    Если значений максимальных и минимальных несколько, то необходимо взять максимальное значение
    разницы индексов между максимальным и минимальным значениями.*/
    public static void minMaxSum() {
        int[] minMaxSum = new int[10];
        Random rand = new Random();
        int max = minMaxSum[0];
        int min = minMaxSum[0];
        int indexmax = 0;
        int indexmin = 0;
        int sum = 0;

        for (int i = 0; i < minMaxSum.length; i++) {
            minMaxSum[i] = rand.nextInt(100);
            if (minMaxSum[i] >= minMaxSum[indexmax])
                indexmax = i;
            else if (minMaxSum[i] < minMaxSum[indexmin])
                indexmin = i;
        }
        System.out.println("Массив:" + Arrays.toString(minMaxSum));
        System.out.println("Индекс минимума:" + indexmin);
        System.out.println("Индекс максимума:" + indexmax);
        for (int m = Math.min(indexmax, indexmin) + 1; m < Math.max(indexmax, indexmin); m++) {
            sum += minMaxSum[m];
        }
        System.out.println("Сумма элементов между максимальным и минимальным элементом равна " + sum);
    }

    /*Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями целочисленного типа.
    Выведите на экран, переверните и снова выведите на экран (при переворачивании нежелательно создавать еще один массив).*/
    public static void arrayReverse() {
        int[] reverseArray = new int[10];
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            reverseArray[i] = rand.nextInt(20);
        }
        System.out.println("Начальный массив:" + Arrays.toString(reverseArray));
        for (int i = 0; i < reverseArray.length / 2; i++) {
            int temp = reverseArray[i];
            reverseArray[i] = reverseArray[reverseArray.length - 1 - i];
            reverseArray[reverseArray.length - 1 - i] = temp;
        }
        System.out.println("Перевернутый массив:" + Arrays.toString(reverseArray));
    }

    /*Создать двухмерный квадратный массив и заполнить его «бабочкой»
     * P.S. Учтен случай, если в строке будет четное колличество элементов.*/
    public static void butterfly() {
        int[][] butterflyArray = new int[5][5];

        for (int i = 0; i < butterflyArray.length / 2 + 1; i++) {
            for (int j = 0; j < butterflyArray[i].length; j++) {
                if ((j < i) || (j >= (butterflyArray[i].length - i)))
                    butterflyArray[i][j] = 0;
                else
                    butterflyArray[i][j] = 1;
            }
        }
        for (int i = butterflyArray.length - 1; i >= butterflyArray.length / 2; i--) {
            for (int j = 0; j < butterflyArray[i].length; j++) {
                if ((j < (butterflyArray[i].length - 1 - i)) || (j > i))
                    butterflyArray[i][j] = 0;
                else
                    butterflyArray[i][j] = 1;
            }
        }
        for (int[] ints : butterflyArray) {
            for (int anInt : ints) System.out.print(anInt);
            System.out.println(" ");
        }
    }

}