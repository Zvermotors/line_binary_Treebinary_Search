public class Zadanie1 {
    //реализовать метод линейного поиска в массиве
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return  array[i] ;//возвращает значение
            }
        }
        return -1; // Элемент не найден
    }


//--------------------------------------------------------------------------------
   //отсортировать массив, реализовать метод бинарного поиска по массиву
public static String binarySearch(int[] array, int target) {
    int left = 0;
    int right = array.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (array[mid] == target) {
            return "Число " + target + " найдено на позиции " + mid;
        }
        if (array[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return "Число " + target + " не найдено";
}
}