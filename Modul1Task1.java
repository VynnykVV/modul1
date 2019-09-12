import java.util.Arrays;

public class Modul1Task1 {
    public static void main(String[] args) {
        System.out.println(variant1(new int[]{1, 4, 5, 1, 1, 3}));
       // System.out.println(variant1(new int[]{1, 4, 1}));
    }

    public static int variant1(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        //if array is not empty, then the first number is unique
        int result = 1;
        //sort so we could check difference with previous number
        Arrays.sort(numbers);
        //as far as first is unique and is not needed to be checked, we start with the numbers[1];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != numbers[i - 1]) {
                result++;
            }
        }
        return result;
    }
}
