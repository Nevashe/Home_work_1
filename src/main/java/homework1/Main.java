package homework1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Integer[] INT = {1, 2, 3, 4, 5, 6};
        swapElement(INT, 3, 1);
        ArrayList<Integer> newInt = transformationMassiveToArrayList(INT);

    }

    // 1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
    public static <T> T[] swapElement(T[] t, int first, int second){
        if(first > t.length || second > t.length){
            System.out.println("Номера элементов больше длины массива");
        } else{
            T firstElement = t[first];
            T secondElement = t[second];
            t[second] = firstElement;
            t[first] = secondElement;
        }
        return  t;
    }
    // 1. end

    // 2. Написать метод, который преобразует массив в ArrayList;
    public static <T> ArrayList<T>  transformationMassiveToArrayList(T[] t){
         ArrayList<T> myArrayList = new ArrayList<>();
        for (T tt: t) {
            myArrayList.add(tt);
        }
        return myArrayList;
    }
    // 2. end
}
