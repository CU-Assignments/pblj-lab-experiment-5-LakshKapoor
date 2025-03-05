import java.util.*;

public class SumCalculator {
    public static Integer parseStringToInteger(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + str);
            return null;
        }
    }

    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            if (num != null) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        String[] inputs = {"10", "20", "30", "40", "50"};
        
        for (String input : inputs) {
            Integer number = parseStringToInteger(input);
            if (number != null) {
                numbers.add(number);
            }
        }
        
        System.out.println("The sum of the list is: " + calculateSum(numbers));
    }
}
