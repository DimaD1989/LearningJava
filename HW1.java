import java.util.Arrays;
import java.util.Random;

// 1. Выбросить случайное целое число в диапазоне от -1000 до 1000 и сохранить в i
// 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
// 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
// 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

// Пункты реализовать в методе main
// *Пункты реализовать в разных методах

// int i = new Random().nextInt(k); //это кидалка случайных чисел!)
// import java.util.Random;
// import java.util.Arrays;

public class HW1 {
    public static void main(String[] args)
    {
        //1.
        int[] array  = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd(-1000,1000);
        }
        System.out.println(Arrays.toString(array));

        int a = (int) (Math.random()*(2000+1)) - 1000;
		
		System.out.println(a);

        //2
        

    }
    
    public static int rnd(int min, int max)
    {
        Random random = new Random();
        return random.nextInt(max - min +1) + min;  
    }
    
}
