import java.util.ArrayList;


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
        ArrayList<String> Surname= new ArrayList<String>();
        Surname.add("Иванов");
        Surname.add("Петров");
        Surname.add("Сидоров"); 
        System.out.println(Surname);
        Surname.set(2, "Пупкин");
        System.out.println(Surname);


        }
    }


    

