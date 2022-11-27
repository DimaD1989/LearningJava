import java.util.Arrays;;
public class HW2{
    /**
     * @param args
     */
    public static void main(String[] args){
        //task1();
        // isRevers();
        StringBuilder sb = new StringBuilder("Stroka");
        System.out.println(isReversRecurs(sb));
    }
    static void task1(){    
        String stringFirst = "naiti naimenshee okno v stroke";
        String stringSecond = "sodergashee vse simvols okno v drugoi stroke navernoe";
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
    String stringFirst = "naiti naimenshee okno v stroke";
    String stringSecond = "";
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
}