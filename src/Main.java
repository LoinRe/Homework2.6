import java.util.*;

public class Main {
    public static void main(String[] args) {
        // задача 1, 2 - Исходный список чисел
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        // задача 3
        Set<String> uniqueWords = new HashSet<>(List.of("Sun", "Moon", "Jupiter", "Mars", "Earth", "Sun", "Jupiter"));
        // задача 4
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

        // Задача 1 - Печать нечетных чисел
        System.out.println("Задание 1");
        printOddNumbers(nums);
        // Задача 2 - Печать четных чисел в порядке возрастания
        System.out.println("Задание 2");
        printEvenNumbers(nums);
        // Задача 3 - Уникальные слова
        System.out.println("Задание 3");
        printUniqueWords(uniqueWords);
        // Задача 4 - Количество дублей
        System.out.println("Задание 4");
        printNumOfDuplicates(strings);
    }

    // Задача 1
    public static void printOddNumbers(List<Integer> numbers) {
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    // Задача 2
    public static void printEvenNumbers(List<Integer> numbers) {
        // Используем для автоматической сортировки и удаления дубликатов
        Set<Integer> evenNumbers = new HashSet<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number); // HashSet автоматически удалит дубликаты
            }
        }
        for (Integer evenNumber : evenNumbers) {
            System.out.print(evenNumber + " ");
        }
        System.out.println();
    }

    // Задача 3
    public static void printUniqueWords(Set<String> words) {
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();
    }

    //Задача 4
    public static void printNumOfDuplicates(List<String> words) {
        Map<String, Integer> items = new HashMap();

        for (String word : words) {
            if (!items.containsKey(word)) {
                items.put(word, 1);
            } else {
                int count = items.get(word);
                count++;
                items.put(word, count);
            }
        }

        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}