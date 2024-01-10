import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EvenNumbersWithoutDuplicates {
    public static void evenNumbersWithoutDuplicates(List<Integer> numbers) {
        Set<Integer> evenNumbersSet = new HashSet<>();
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbersSet.add(num);
            }
        }
        List<Integer> sortedNumbers = new ArrayList<>(evenNumbersSet);
        sortedNumbers.sort(null);
        for (Integer num : sortedNumbers) {
            System.out.print(num + " ");
        }
    }
}
