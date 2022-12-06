import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Hw4 {
    public static void main(String[] args) {
        String text = "Name: Иван Surname: Иванов Age: 33 Gender: M \n" +
                "Name: Ира Surname: Петрова Age: 23 Gender: W \n" +
                "Name: Татьяна Surname: Федорова Age: 18 Gender W:\n" +
                "Name: Дмитрий Surname: Андреев Age: 27 Gender W:\n" +
                "Name: Екатерина Surname: Васина Age: 32 Gender W:\n" +
                "Name: Петр Surname: Петров Age: 44 Gender: М";

               List<Person>people=getList(text); //получаем список людей
               print(people); 
            //    System.out.println(people);
               //выводим на экран нужные поля людей и отсортированные согласно компоратору в методе
               // можно в параметры метода принт передать поля, которые нужно выводить на экран
    
           }
       
           public static List<Person> getList(String text){
               //Парсим все строки и превращаем их в людей, и добавляем в Лист
               //В зависимости от формата входных данных парсить можно по-разному:
               //регулярные выражения, методы Стринга - сплит, сабстринг и т.д.
               List<Person>people = new ArrayList<>();
               String [] array = text.split("\n");
       
               for(int i=0;i<array.length;i++)
               {
                   String [] inAr = array[i].split(" ");
                   people.add(new Person(inAr[1],inAr[3],Integer.valueOf(inAr[5]),inAr[7]));
               }
               return people;
           }
       
           /**
         * @param people
         */
        public static void print(List<Person> people){
               // в этом методе выбираем уже какие поля выводить, какие не выводить. По какому полю
               // отсортировать людей и т.д. выходные данные в зависимости от цели, можете вернуть строкой,
               // записать в файл и т.д.
       
               //создаем Компоратор - по которому будем сортировать людей, у меня это будет возраст:
               //при необходимости можно создать различные компораторы и передавать в метод тот, который необходим:
               Comparator<Person> comparator= (o1, o2) -> o1.age-o2.age;
               people.sort(comparator); //сортируем людей по компоратору выше


               //Вывод на экран нужных полей:
               for(Person person: people){
                   System.out.println("Surname: "+person.surname);
                   System.out.println("Name: "+person.name);
                   System.out.println("Age: " + person.age);
                   System.out.println("Gender:"+ person.Gender);
               }
           }
       }
       
       class Person{
           String name;
           String surname;
           int age;
           String Gender;
           public Person(String name, String surname, int age, String Gender){

                     this.name = name;
               this.surname = surname;
               this.age = age;
               this.Gender = Gender;
   }
       
           @Override
           public String toString() {
               return "Person{" +
                       "name='" + name + '\'' +
                       ", surname='" + surname + '\'' +
                       ", age=" + age +
                       ", Gender='" + Gender +   
                                           '}';
           }
}
