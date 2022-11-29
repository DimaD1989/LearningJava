
import java.util.Arrays;;
public class HW2{
    public static  String[] forStar = Calc(3, 56);
    
    /**
     * @param args
     */
    public static void main(String[] args){
        //        5
        System.out.println("Task5");
        String str5 = "3 + 56 = 59";
        changeEquals(str5);
//        6
        System.out.println("Task6");
        String str6 = "3 + 56 = 59";
        System.out.println(replaceEquals(str6));
        task1();
        isRevers();
        StringBuilder sb = new StringBuilder("строка");
        isReversRecurs(sb);
        System.out.println(isReversRecurs(sb));
        Calc(3, 56);
        System.out.println(Arrays.toString(Calc(3, 56)));
    }
    static void task1(){    
        String stringFirst = "найти наименьшее окно в строке";
        String stringSecond = "содержащей все символы окно  другой строке наверное";
        String[] arr1 = stringFirst.split(" ");
        String[] arr2 = stringSecond.split(" ");
        String[] arr3 = new String[arr1.length > arr2.length ? arr1.length : arr2.length];
        System.out.println(Arrays.toString(arr1));
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].compareTo(arr2[j]) == 0) {
                    arr3[count++] = arr1[i];
                }
            }
        }
        int minLength = 100;
        String result = null;
        for (String each : arr3 ) {
            if (each != null && each.length()<minLength) {
                minLength = each.length();
                result = each;
            }
        }
        System.out.println(result);
    }


static void isRevers (){
    // Напишите программу на Java, чтобы проверить, являются ли две данные строки вращением друг друга.
    String stringFirst = "найти наименьшее окно в строке";
    String stringSecond = "екортс в онко еешьнемиан итйан";
    StringBuilder sb = new StringBuilder(stringFirst);
    String stringTemp = sb.reverse().toString();
    System.out.println(stringSecond.compareTo(stringTemp) == 0);
    }


//    *Напишите программу на Java, чтобы перевернуть строку с помощью рекурсии.
static StringBuilder isReversRecurs (StringBuilder sb) {
    System.out.print(sb.charAt(sb.length()-1));
    if (sb.length() == 1) {
        return sb;
    }
    return isReversRecurs(sb.deleteCharAt(sb.length()-1));
    }
    /**
     * @param x
     * @param y
     * @return
     */
    static String[] Calc(int x, int y) {
//    Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
                String[] result = new String[3];
        
                StringBuilder sb = new StringBuilder();
                sb.append(x);
                sb.append(" + ");
                sb.append(y);
                sb.append(" = ");
                sb.append(x+y);
                StringBuilder alfa = new StringBuilder();
                alfa.append(x);
                alfa.append(" - ");
                alfa.append(y);
                alfa.append(" = ");
                alfa.append(x-y);
                StringBuilder mult = new StringBuilder();
                mult.append(x);
                mult.append(" * ");
                mult.append(y);
                mult.append(" = ");
                mult.append(x*y);
        
                result[0] = sb.toString();
                result[1] = alfa.toString();
                result[2] = mult.toString();
        
                return result;
                // System.out.println(result[0]);
                // System.out.println(result[1]);
                // System.out.println(result[2]);
            }
/**
 * 
 */
static void changeFignyaFitchaStar(){
    for (int i = 0; i < forStar.length; i++) {
        StringBuilder sb = new StringBuilder(forStar[i]);
        sb.replace(7, 8, "Равно");
        forStar[i] = sb.toString();
        }
    }
    //  5. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
    static void changeEquals(String x){
        StringBuilder sb = new StringBuilder(x);
        int eq = sb.indexOf("=");
        sb.deleteCharAt(eq);
        sb.insert(eq, "равно");
        System.out.println(sb.toString());
    }
//  6. *Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
    static String replaceEquals(String x){
        StringBuilder sb = new StringBuilder(x);
        int eq = sb.indexOf("=");
        sb.replace(eq, eq+1,"равно" );
        return sb.toString();
    }
}
