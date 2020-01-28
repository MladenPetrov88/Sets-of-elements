import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();



        for (int i = 0; i < Integer.parseInt(input[0]); i++) {
            int numbers = Integer.parseInt(scanner.nextLine());
            firstSet.add(numbers);
        }
        for (int i = 0; i < Integer.parseInt(input[1]); i++) {
            int numbers = Integer.parseInt(scanner.nextLine());
            secondSet.add(numbers);
        }

        for (Integer integer : firstSet) {
            for (Integer integer1 : secondSet) {
                if (integer1.equals(integer)) {
                    System.out.print(integer1 + " ");
                }
            }

        }


    }
}
