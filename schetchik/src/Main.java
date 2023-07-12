import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        int[] input = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4}; //создаем некий массив чисел

        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            intList.add(input[i]);                                   // присваиваем эти числа в arraylist
        }

        for (int i = 0; i < intList.size(); i++)                     // выделяем положительные значения
        {
            if (intList.get(i) <= 0) {
                intList.remove(i);
                i--;
            }
        }

        for (int i = 0; i < intList.size(); i++) {                   // оставляем четные числа
            if (intList.get(i) % 2 != 0) {
                intList.remove(i);
                i--;
            }
        }

        Collections.sort(intList);                              // сортируем по порядку

        for (int i = 0; i < intList.size(); i++) {         // выводим на экран
            System.out.println(intList.get(i));
        }
    }
}