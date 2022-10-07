import java.util.*;
public class Like8 {
    public static int[] twoSum(int[] numbers, int target)
    {
        // Create a dictionary to store the seen values and their index
        Map seenValues = new HashMap();

        // Iterate throught the list by index, if the current target - number[i] is in the dictionary, return it with i
        for (int i = 0; i < numbers.length; i++) {
            //Check if the partner value already exists in the dictionary
            if (seenValues.containsKey(target - numbers[i])) {
                return new int[]{(int)seenValues.get(target - numbers[i]), i};
            }

            seenValues.put(numbers[i], i);
        }

        return null; // Do your magic!
    }
}
