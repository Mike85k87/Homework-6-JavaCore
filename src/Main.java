import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println("Нечетные числа из последовательности:");
        PrintOddNumbers.printOddNumbers(nums);
        System.out.println();

        System.out.println("Четные и в порядке возрастания:");
        List<Integer> numbers = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        EvenNumbersWithoutDuplicates.evenNumbersWithoutDuplicates(numbers);
        System.out.println();

        System.out.println("Уникальные слова:");
        List<String> wordslist = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        UniqueWords.uniqueWords(wordslist);
        System.out.println();

        System.out.println("Повторы слов:");
        List<String> strings = new ArrayList<String>(List.of("один", "два", "два", "три", "три", "три"));
        RepeatWords.repeatWords(strings);
    }
}
