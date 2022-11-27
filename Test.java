// public class program {

// }

/**
 * program
 */
// public class Test {
// 	/**
// 	 * @param args
// 	 */
// 	public static void main(String[] args){
// 		double randomNumber = Math.floor(Math.random() * (2001) - 1000);
//         int random = (int) randomNumber;
//         System.out.println(random);
// // 	}
// public static void main(String... args)
// {
// 	final int min = 10; // Минимальное число для диапазона
// 	final int max = 75; // Максимальное число для диапазона
// 	final int rnd = rnd(min, max);

// 	System.out.println("Псевдослучайное целое число: " + rnd);
// }

// private static void arrReverse (int[] a){
// 	int last = a.length-1;
// 	for (int i = 0; i < a.length/2; i++) {
// 		int tmp=a[i];
// 		a[i] = a[last-i];
// 		a[last-i] = tmp;
	// }


/**
 * Метод получения псевдослучайного целого числа от min до max (включая max);
 */
// public static int rnd(int min, int max)
// {
// 	max -= min;
// 	return (int) (Math.random() * ++max) + min;