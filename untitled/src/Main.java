import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.binarySearch;

public class Main {
    public static void main(String[] args) {
//        реализовать метод линейного поиска в массиве
//        System.out.println("{дан массив: 4, 2, 7, 1, 9, 5, 3}");
//        System.out.println("введите число для поиска в массиве: ");
//        Scanner scanner = new Scanner(System.in);
//        int target = scanner.nextInt();
//        int[] numbers = {4, 2, 7, 1, 9, 5, 3};
//
//        int result = Zadanie1.linearSearch(numbers, target);
//        if (result == -1) {
//            System.out.println("Элемент не найден");
//        } else {
//            System.out.println("Элемент найден:  " + result);
//        }
//-------------------------------------------------------------------------------
        // отсортировать массив, реализовать метод бинарного поиска по массиву
//        System.out.println("дан массив: {23, 5, 67, 12, 89, 3, 45, 17, 34}");
//        int[] array = {23, 5, 67, 12, 89, 3, 45, 17, 34};
//        // Сортируем массив
//        Arrays.sort(array);
//        System.out.println("Отсортированный массив: " + Arrays.toString(array));
//        System.out.println("введите число для поиска в массиве: ");
//        Scanner scanners = new Scanner(System.in);
//        int val = scanners.nextInt();
//        // Вызываем бинарный поиск
//        String result = Zadanie1.binarySearch(array, val);
//        System.out.println(result);


        //-----------------------------------------------------------------------------------
        //реализовать метод бинарного поиска с использованием бинарного дерева поиска
        BinarySearchTree bst = new BinarySearchTree();
        // Вставляем значения в дерево
        Scanner scanner =new Scanner(System.in);
        System.out.println("задайте размер массива: ");
        int size = scanner.nextInt();
        int []values = new int[size];
        System.out.println("запишите значения массива");
        for (int i = 0;i<values.length;i++){
            values[i]=scanner.nextInt();
        }
        for (int value : values) {
            bst.insert(value);
        }
        System.out.println("введите число для поиска");
        int number = scanner.nextInt();
        // Поиск значений
        System.out.println(bst.search(number)); // Найдено
    }

}