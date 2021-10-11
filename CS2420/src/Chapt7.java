import java.io.*;
import java.util.Scanner;

public class Chapt7 {

    //if m = 0, n + 1
    //m > 0, n = 0, == m-1, 1
    //m and n > 0, return A(m-1, A(m, n-1))

    static int ackermann(int m, int n){

        if (m==0){
            return n + 1;
        }

        if (m > 0 && n == 0){
            return ackermann(m-1, 1);
        }

        if (m > 0 && n > 0){
            return ackermann(m - 1, ackermann(m, n -1));
        }

        return n+1;
    }

    static int binary1s(int n){
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        if (n>1 && n%2!=0){
            return binary1s(n/2)+1;
        }

        if (n>1 && n%2==0){
            return binary1s(n/2);
        }

        return 0;
    }

    static void printReverse(BufferedReader buff, int n){

        try {
            String line = buff.readLine();
            if (n > 0){
                printReverse(buff, n -1);
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println(ackermann(2, 4));

        System.out.println(binary1s(10));

        Scanner in = new Scanner(new File("CS2420/src/NameAndAge.txt"));

        int count = 0;

        while (in.hasNextLine()){
            count++;
            in.nextLine();
        }

        printReverse(new BufferedReader(new FileReader("CS2420/src/NameAndAge.txt")), count);
    }


}
