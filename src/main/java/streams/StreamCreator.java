package streams;

import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreator {
    public static void main(String[] args) {

        Stream.generate(() -> 3); //сколько раз попросят тройку столько и даст
        Stream.iterate(1, i -> i + 1);
        Stream.empty(); //пустой стрим
        IntStream.iterate(0, i -> i + 1); //примитивные
//       Files.lines("C://");  вычитать поток строчек из файла
        IntStream chars = "quack".chars();  //возвращает стрим из интов
                                            // но каждый их них представляет из себя примитив char.
                                            // Существует только int stream!

        final List<Integer> list = List.of(1, 2, 3);

        list.stream()
                .map(i -> i * i)
                .filter(el -> el > 3)
                .peek(el -> System.out.println("el :" + el)) //(System.out::println)
                .limit(10) //пропустит только 10 элементов из всего потока
                .skip(5) //пропустит 5 и потом будет брать
                .takeWhile(el -> el > 3) //принимает до тех пор, пока удовлетворяет предикат
                .dropWhile(el -> el > 3) //отбрасывает элементы пока удовлетворяют предикат, а потом всех пускает
                .distinct() //пропускает только уникальные элементы
                .sorted()//сортирует все элементы
                .peek(el -> System.out.println("el! :" + el)) //(System.out::println)
                .flatMap(el -> Stream.iterate(1, i -> i <= el, i -> i + 1)) //принимает функцию, которая делает из элемента стрим
                //флэтмэп после преобразования делает отдельные стримы одним общим потоком
                //2         3           6
                //{1 2}   {1 2 3}      {1 2 3 4 5 6} - итератор
                //1 2 1 2 3 1 2 3 4 5 6 - флэтмэп уплощает-конкатенирует
//                .count() //кол.-во элементов, которые добрались до этого места - терминальная
//                .max(Integer::compareTo) //узнать максимальное значение и указать как сравнивать
                                            // В потоке может быть нет максимального элемента
                                            // поэтому возвроащается optional
                                            // optional - это контейнер, чтобы вернуть даже когда нет значения
                .mapToInt(i -> i)
//                .average() //среднее
//                .sum() //сумма
//                .boxed() //вернуть обратно к стриму интежеров из инт стрим.
                .summaryStatistics(); // кол-во, сумма, мин, макс, среднее

        final IntStream stream = list.stream()
                .map(i -> i * i)
                .filter(el -> el >3)
                .flatMap(el -> Stream.iterate(1, i -> i <= el, i -> i + 1))
                .mapToInt(i -> i);
        System.out.println(stream.reduce((l, r) -> l * r));
                //1 2 3 4
                //1 * 2 = 2, 2 * 3 = 6, 6 * 4 = 24 - его и вернем.
                // Перемнож. первый элемент со вторым до результата




        List<String> someList = Arrays.asList("Andrew", "Serg", "Petia", "Gowa");

        List<Integer> newSomeList = someList.stream()
                .map(element -> element.length())
                .filter(x -> x > 4)
                .sorted()
//              .forEach(System.out::println);
                .collect(Collectors.toList());

        System.out.println(newSomeList);

        // Or we can create stream in Arrays.stream:
        int[] someArray = {458, 23311, 333, 543, 567, 876, 642};

        Arrays.stream(someArray)
                .filter(x -> x > 500 && x < 1000)
                .forEach(x -> {
                    x *= 2;
                    System.out.println(x);
                });

    }

}
