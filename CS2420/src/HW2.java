import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HW2 {


    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 letter prefix");

        String str1 = sc.nextLine();

        System.out.println("Now enter a word, with or without that prefix");

        String str2 = sc.nextLine();

        System.out.println("Is your prefix part of the word?" + " " + isPrefix(str1, str2));

        File file = new File("src/NameAndAge.txt");

        Scanner input = new Scanner(System.in);

        input = new Scanner(file);

        List<String> names = new ArrayList<String>();

        while (input.hasNextLine()) {
            names.add(input.nextLine());

        }

        int oldestIndex = -1;
        int oldestAge = 0;

        for (int i = 0; i < names.size(); i++){
            String temp = names.get(i);
            int age = Integer.parseInt(temp.replaceAll("[^0-9]", ""));

            if (age > oldestAge){
                oldestAge = age;
                oldestIndex = i;
            }
        }

        System.out.println(names.get(oldestIndex));


    }


    public static boolean isPrefix(String str1, String str2){

        if (str1.charAt(0) == str2.charAt(0)){
            if (str1.charAt(1) == str2.charAt(1)){
                if (str1.charAt(2) == str2.charAt(2)){
                    return true;
                }
            }
        }

        return false;


    }

}
