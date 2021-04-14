package homework1.BigTask;

import java.util.ArrayList;


public class Box<T extends Fruit> {

    public T fruit;
    ArrayList<T> boxArrayList;

    public Box() {

        boxArrayList = new ArrayList<>();
    }
    // g. Не забываем про метод добавления фрукта в коробку.

    public void add(T fruit) {
        boxArrayList.add(fruit);
        System.out.println(fruit + "добавлен в ящик");
    }

    //d. Сделать метод getWeight() который высчитывает вес коробки,
    // зная количество фруктов и вес одного фрукта
    // (вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);

    // 1) Этот не работает NPE выдает, не знаю как вытащить массу из класса-дженерика
    public  float getWeight(){
        float weight = boxArrayList.size() * fruit.getWEIGHT();
        System.out.println("Вес коробки: " + weight);
        return weight;
    }

    // 2) этот работает, но передавать в метод ничего не хотелось бы
    public  float getWeight1(T t){
        float weight = boxArrayList.size() * t.getWEIGHT();
        System.out.println("Вес коробки: " + weight);
        return weight;
    }
    //e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той,
    // которую подадут в compare в качестве параметра,
    // true - если их веса равны, false в противном случае
    // (коробки с яблоками мы можем сравнивать с коробками с апельсинами);

    public boolean compare(Box<?> anotherBox){
        if(this.boxArrayList.size() == anotherBox.boxArrayList.size()){
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }

    // f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку
    // (помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами),
    // соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты,
    // которые были в этой коробке;

    public void addFromAnotherBox(Box<T> anotherBox) {
        if(anotherBox.boxArrayList.size() != 0){
            boxArrayList.addAll(anotherBox.boxArrayList);
            anotherBox.boxArrayList.clear();
            System.out.println("Все пересыпали");
        } else {
            System.out.println("В той коробке пусто, нечего пересыпать");
        }

    }

}
