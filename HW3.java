// import java.lang.reflect.Array;
import java.util.ArrayList;
// import java.util.Collections;
// import java.util.stream.Collectors;


// Создать новый список, добавить несколько строк и вывести коллекцию на экран.
// Итерация всех элементов списка цветов и добавления к каждому символа '!'.
// Вставить элемент в список в первой позиции.
// Извлечь элемент (по указанному индексу) из заданного списка.
// Обновить определенный элемент списка по заданному индексу.
// Удалить третий элемент из списка.
// Поиска элемента в списке по строке.
// Создать новый список и добавить в него несколько елементов первого списка.
// Удалить из первого списка все элементы отсутствующие во втором списке.
// *Сортировка списка.
// *Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList.
public class HW3 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Создать новый список, добавить несколько строк и вывести коллекцию на экран.
        // ArrayList<String> Surname= new ArrayList<String>();
        // Surname.add("Иванов");
        // Surname.add("Петров");
        // Surname.add("Сидоров");
        // System.out.println(Surname);

        // Итерация всех элементов списка цветов и добавления к каждому символа '!'.
        // for(String i : Surname) {
        //     System.out.println(i + "!");}
       
        // Surname.add("Иванов");
        // Surname.add("Петров");
        // Surname.add("Сидоров");
        // for(Object element : Surname) {
        //     System.out.println(element + "!");

        // Вставить элемент в список в первой позиции.   
        // ArrayList<String> Surname= new ArrayList<String>();
        // Surname.add("Иванов");
        // Surname.add("Петров");
        // Surname.add("Сидоров"); 
        // System.out.println(Surname);
        // Surname.add(1, "Пупкин");
        // Surname.add(2, "Сергеев");
        // System.out.println(Surname);

        // Извлечь элемент (по указанному индексу) из заданного списка.
        // ArrayList<String> Surname= new ArrayList<String>();
        // Surname.add("Иванов");
        // Surname.add("Петров");
        // Surname.add("Сидоров"); 
        // System.out.println(Surname);
        // String element = Surname.get(0);
        // System.out.println("Первый элемент: "+element);
        // element = Surname.get(2);
        // System.out.println("Третий элемент: "+element);

        // Обновить определенный элемент списка по заданному индексу.
        // ArrayList<String> Surname= new ArrayList<String>();
        // Surname.add("Иванов");
        // Surname.add("Петров");
        // Surname.add("Сидоров"); 
        // System.out.println(Surname);
        // Surname.set(2, "Пупкин");
        // System.out.println(Surname);

        // Удалить третий элемент из списка.
        // ArrayList<String> Surname= new ArrayList<String>();
        // Surname.add("Иванов");
        // Surname.add("Петров");
        // Surname.add("Сидоров"); 
        // System.out.println(Surname);
        // Surname.remove(2); 
        // System.out.println(Surname);

        // Поиска элемента в списке по строке.
   
        // ArrayList<String> Surname= new ArrayList<String>();
        // Surname.add("Иванов");
        // Surname.add("Петров");
        // Surname.add("Сидоров"); 
        // System.out.println(Surname);
        // if (Surname.contains("Петров"))
        // System.out.println(Surname.contains("Петров"));
        // System.out.println(Surname.contains("Пупкин"));

        // ArrayList<String> result = (ArrayList<String>) Surname.stream()
        // .filter(lang -> lang.contains("Иванов"))
        // .collect(Collectors.toList());
        // System.out.println(result);

        // System.out.println(Surname);
        // for (String lang : Surname) {
        // if (lang.startsWith("Петров")) {
        // System.out.println(lang);
        // }

        // Создать новый список и добавить в него несколько элементов первого списка.
        // Удалить из первого списка все элементы отсутствующие во втором списке.
        ArrayList<String> Surname = new ArrayList<String>();
        Surname.add("Иванов");
        Surname.add("Петров");
        Surname.add("Сидоров");        
        Surname.add("Пупкин");
        Surname.add("Сергеев");
        System.out.println(Surname);
        ArrayList<String> Surname1 = new ArrayList<String>();
        Surname1.add("Иванов");
        Surname1.add("Петров");
        Surname1.add("Сидоров");
        System.out.println(Surname1);
        for(Object o : Surname1){
            Surname.remove(o);
        }
        System.out.println(Surname);
    
        
        // List list = new ArrayList();
        // String element = "first element";
        // list.add(element);
        // list.remove(element);
        

    }
}


    

