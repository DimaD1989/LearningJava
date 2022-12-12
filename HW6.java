import java.util.*;
// Реализовать множество (set) с помощью TreeMap. Создать метод add, добавляющий элемент в ваше множество.
//  Объявить и инициализировать компаратор с обратной (от большего к меньшеиу) логикой сортировки чисел. 
//  Объявить и инициализировать TreeSet использующий ваш компаратор. Добавить несколько эллементов в сет и вывести в консоль.
public class HW6 {
    public class Main {
        static Map<Integer, Object> mapaTree = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        static Set<Integer> treeSet1 = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        private static final Object O = new Object();
    
        public static void main(String[] args) {
            methodAdd(100);
            methodAdd(223);
            methodAdd(55);
            methodAdd(3124);
            methodAdd(10);
            methodAdd(145);
            methodAdd(8);
    
            System.out.println(mapaTree.keySet());
            treeSet1.add(44);
            treeSet1.add(6);
            treeSet1.add(91);
            treeSet1.add(17);
            treeSet1.add(70);
    
            System.out.println(treeSet1);
    
        }
        static void methodAdd(int x) {
            mapaTree.put(x, O);
            return;
        }
    }

    }  

