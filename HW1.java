// import java.util.Arrays;
// import java.util.Random;

// // 1. Выбросить случайное целое число в диапазоне от -1000 до 1000 и сохранить в i
// // 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
// // 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
// // 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

// // Пункты реализовать в методе main
// // *Пункты реализовать в разных методах

// // int i = new Random().nextInt(k); //это кидалка случайных чисел!)
// // import java.util.Random;
// // import java.util.Arrays;

// public class HW1 
// {
//     /**
//      * @param args
//      */
//     public static void main(String[] args)
//     {

//         //1.
//         int[] array  = new int[1000]; // создаем и инициализируем массив
//         for (int i = 0; i < array.length; i++) { // заполняем через for
//             array[i] = rnd(-1000,1000);
//         }
//         System.out.println(Arrays.toString(array));

//         int a = (int) (Math.random()*(2000+1)) - 1000;
		
// 		System.out.println(a);
        
//         int[] m1 = evensShort(i);
//         System.out.println("Третье задание: ");
//         printArr(m1);
//         System.out.println();

// //        System.out.println("Введите число: ");
// //        int m =sc.nextInt();
//         int m = -32750;
//         int[] m2 = oddShort(m);
//         System.out.println("Четвёртое задание:");
//         printArr(m2);
//     }
    
//     public static int rnd(int min, int max)
//     {
//         Random random = new Random();
//         return random.nextInt(max - min +1) + min;
        
//     }
//     public static int bit1( int i) {
            
//         int msbNumber = Integer.toBinaryString(i).length();
//         return msbNumber;
//     }
// /*
//     2. Метод вычисления позиции (номера) старшего значащего бита (msb).
// */
//     /**
//      * @param i
//      * @return
//      */
//     static int setBitNumber(int i) 
//     {

//         if (i == 0)
//             return 0;
 
//         int msb = 0;
//         i = i / 2;
 
//         while (i != 0) {
//             i = i / 2;
//             msb++;
//         }
 
//         return (1 << msb);
//     }
//     private static int[] evensShort(int i){
//         int[] m= new int[(Short.MAX_VALUE-i)/2];
//         for (int j = 0; j < m.length; j++) {
//             i++;
//             if (i%2 == 0)
//                 m[j] = i;
//             else j--;
//         }
//         return m;
//     }

//     private static int[] oddShort(int i){
//         int[] m= new int[Math.abs((Short.MIN_VALUE-i)/2)];
//         for (int j = 0; j < m.length; j++) {
//             i--;
//             if (i%2 != 0)
//                 m[j] = i;
//             else j--;
//         }
//         return m;
//     }

//     private static void printArr (int[] a){
//         for (int i = 0; i < a.length; i++) {
//             System.out.print(a[i]+"  ");
//         }
//     }
// }

