import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Chapt5HW {

    public static void main(String[] args) {

        int[] numbers = new int[]{1, 5, 7, 8, 20, 5, 8, 10, 9, 12};

        int[] majorityNumbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] majorityNumbers2 = new int[]{1, 1, 1, 1, 1, 6, 7, 8, 9};

        System.out.println(doesArrayContainI(numbers));

        System.out.println(isPrime(459673));

        System.out.println(isMajority(majorityNumbers));
        System.out.println(isMajority(majorityNumbers2));

    }

    public static boolean doesArrayContainI(int [] numbers) {

        boolean doesIt = false;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == i) {
                doesIt = true;
            }

        }
        return doesIt;
    }

    public static boolean isPrime(int n){

        if (2 == n){
            return true;
        }

        if (n % 2 == 0){
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i+=2){
            if (n % i == 0){
                return false;
            }
        }

        return true;

    }

    public static boolean isMajority(int [] intArray){

        int majority = intArray.length/2;
        int[] frequency = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < intArray.length; i++){

            frequency[intArray[i]] +=1;

        }

        for (int i = 1; i < frequency.length-1; i++){

            if (frequency[i] > majority){
                return true;
            }

        }

        return false;
    }



}
