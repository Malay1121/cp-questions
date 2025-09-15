import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AllOddPrefixSums {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> inputLines = new ArrayList<>();
        while (input.hasNextLine()) {
            String line = input.nextLine();
            inputLines.add(line);
        }
        input.close();
        int testcases = Integer.parseInt(inputLines.get(0));
        for (int t = 0; t < testcases; t++) {
            String[] numbersString = inputLines.get(t * 2 + 2).split(" ");
            int[] numbers = new int[numbersString.length];
            List<Integer> oddNumbers = Arrays.stream(numbers).filter(num -> num % 2 != 0).boxed()
                    .collect(Collectors.toList());
            List<Integer> evenNumbers = Arrays.stream(numbers).filter(num -> num % 2 == 0).boxed()
                    .collect(Collectors.toList());

            Integer maxLength = Math.max(oddNumbers.size(), evenNumbers.size());

            List<Integer> finaList = new ArrayList<>();
            System.err.println(oddNumbers.size());

            if (oddNumbers.size() <= 0) {
                System.err.println("No");
                continue;
            }

            for (int i = 0; i < maxLength; i++) {
                if (oddNumbers.size() > i) {
                    finaList.add(oddNumbers.get(i));
                }
                if (evenNumbers.size() > i) {
                    finaList.add(evenNumbers.get(i));
                }
            }
            System.err.println(finaList.size());

            for (int i = 0; i < numbersString.length; i++) {
                numbers[i] = Integer.parseInt(numbersString[i]);
            }

            int sum = 0;

            for (int i = 0; i < finaList.size(); i++) {
                System.err.println(finaList.get(i));
                sum += finaList.get(i);
                if (sum % 2 == 0) {
                    System.err.println("No");
                    break;
                }
                if (i == finaList.size() - 1) {
                    System.err.println("Yes");
                }
            }
        }
    }
}