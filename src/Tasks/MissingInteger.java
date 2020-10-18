/*
  Given an array K with N integers from 1 to N+1
  such that the array has exactly one integer missing,
  write a Java function that returns the missing integer.
  e.g. given K = [3,5,4,1], the function should return 2
 */

package Tasks;

/* Steps:
  1. Find the sum of n integers in the array: n*(n+ )/2
  2. Find the sum of the integers present in the array
  3. Missing number = (step 1)- (step 2)
*/

public class MissingInteger {

    static int sumOfNIntegers(int n) {
        int sum = (n +1) * (n + 2) / 2;
        return sum;
    }

    static int sumOfPresentIntegers(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int a[] = {3, 5, 4, 1};
        int n = 4;
        int missingInteger = sumOfNIntegers(n) - sumOfPresentIntegers(a);
        System.out.println(missingInteger);
    }
}
