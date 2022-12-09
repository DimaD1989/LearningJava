// Создать словарь HashMap. Обобщение <Integer, String>.
// Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)
// Изменить значения дописав восклицательные знаки. 
// *Создать TreeMap, заполнить аналогично.
// *Увеличить количество элементов таблиц до 1000 случайными ключами и общей строкой.
// **Сравнить время прямого и случайного перебора тысячи элементов словарей.

import java.security.Key;
import java.util.*;

public class HW5 {
    private static final Integer Key = null;

    public static void main(String[] args) {
            //1. Создать словарь HashMap. Обобщение <Integer, String>.
            // Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)
            // Изменить значения дописав восклицательные знаки. 
   Map<Integer, String> Jornal = new HashMap<>();
   Jornal.put( 1, "Иванов Иван Иваныч") ;
   Jornal.put(2, "Петров Петр Петрович");
   Jornal.put( 3, "Ильин Илья Иваныч");
   Jornal.put( 4, "Иванова Дарья Ивановна");
   Jornal.put( 5, "Сергеев Сергей Иваныч");
   Jornal.put( 1, "Копытько Наталья Петровна");
   System.out.println(Jornal);
   for(int i:Jornal.keySet()){  // заводим цикл для всей элементов int и возвращаем множество ключей 
    Jornal.compute(i,(k, v) -> v = v + "!");  
    // Метод compute() будет вызывать лямбда-выражение внутри себя, передавая ключевой объект и любое значение, 
    // сохраненное в Map для этого ключевого объекта, в качестве параметров лямбда-выражения.
    // Какое бы значение не возвращалось лямбда-выражением, оно сохраняется вместо текущего значения этого ключа.Если
    //  лямбда-выражение возвращает ноль, запись удаляется. Там не будет ключа -> нулевое отображение хранится на карте.
    // Если лямбда-выражение выдает исключение, запись также удаляется.
   }
   System.out.println(Jornal);

   // *Создать TreeMap, заполнить аналогично.
   TreeMap<Integer,String> Jl = new TreeMap<>();
   Jl.put( 1, "Иванов Иван Иваныч") ;
   Jl.put(2, "Петров Петр Петрович");
   Jl.put( 3, "Ильин Илья Иваныч");
   Jl.put( 4, "Иванова Дарья Ивановна");
   Jl.put( 5, "Сергеев Сергей Иваныч");
   Jl.put( 1, "Копытько Наталья Петровна");
   System.out.println(Jl);
   for(int i:Jl.keySet()){
    Jl.compute(i,(k, v) -> v = v + "!");
   }
   System.out.println(Jl);
   // *Увеличить количество элементов таблиц до 1000 случайными ключами и общей строкой.
   for (int i = 0; i < 1000; i++) {
    int rand = new Random().nextInt(10000); // new Random() создаёт генератор чисел, использующий уникальное начальное число и  Метод nextInt считывает и возвращает введенное число
    Jornal.put(rand, " ");
   }
   System.out.println(Jornal);
    for (int i = 0; i < 1000; i++) {
    int rand = new Random().nextInt(10000);
    Jl.put(rand, " ");
    }
    System.out.println(Jl); 
    
    // **Сравнить время прямого и случайного перебора тысячи элементов словарей.
    System.out.println("---Timing---");
    long start = System.currentTimeMillis();
    Jornal.forEach((k,v) -> System.out.print(k + v));
    System.out.println();
    System.out.println("HashMap: " + (System.currentTimeMillis() - start));

    start = System.currentTimeMillis();
    for (int i = 0; i < 1001; i++) {
        System.out.printf(Jornal.get(i) + ", ");
    }
    System.out.println();
    System.out.println("HashMap iterator: " + (System.currentTimeMillis() - start));

    start = System.currentTimeMillis();
    for (int i = new Random().nextInt(1000); i < 1001; i++) {
        System.out.print(Jornal.get(i) +", ");
    }
    System.out.println();
    System.out.println("HashMap Random: " + (System.currentTimeMillis() - start));

    start = System.currentTimeMillis();
    Jl.forEach((k,v) -> System.out.print(k + v));
    System.out.println();
    System.out.println("TreeMap: " + (System.currentTimeMillis() - start));

    start = System.currentTimeMillis();
    for (int i: Jl.keySet()) {
        System.out.printf(i + ", ");
    }
    System.out.println();
    System.out.println("TreeMap iterator: " + (System.currentTimeMillis() - start));

    start = System.currentTimeMillis();
    for (int i = new Random().nextInt(1000); i < 1001; i++) {
        System.out.print(Jl.get(i) +", ");
    }
    System.out.println();
    System.out.println("TreeMap Random: " + (System.currentTimeMillis() - start));

    }

   
   
}
