import java.util.Scanner;

public class HW1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers");

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        System.out.println(max3(x, y, z));

        System.out.println("Now enter 4 numbers");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.println(max4(a, b, c, d));

        System.out.println("What year were you born?");

        int year = sc.nextInt();

        System.out.println("The Roman numeral equivalent is: " + toRoman(year));


    }

    public static int max3(int x, int y, int z){

        int max = 0;

        if (x > y && x > z){
            max = x;
        } else if (y > x && y > z){
            max = y;
        } else if (z > y && z > x){
            max = z;
        }

        return max;
    }

    public static int max4(int a, int b, int c, int d){

        int max = 0;

        if (a > b && a > c && a > d){
            max = a;
        } else if (b > a && b > c && b > d){
            max = b;
        } else if (c > b && c > a && c > d){
            max = c;
        } else if (d > a && d > b && d > c){
            max = d;
        }

        return max;

    }

    public static String toRoman(int year){

        String m[] = { "", "M", "MM", "MMM" };
        String c[] = { "",  "C",  "CC",  "CCC",  "CD", "D", "DC", "DCC", "DCCC", "CM" };
        String x[] = { "",  "X",  "XX",  "XXX",  "XL", "L", "LX", "LXX", "LXXX", "XC" };
        String i[] = { "",  "I",  "II",  "III",  "IV", "V", "VI", "VII", "VIII", "IX" };

        String thousand = m[year / 1000];
        String hundred = c[(year % 1000) / 100];
        String ten = x[(year % 100) / 10];
        String single = i[year % 10];

        String roman = thousand + hundred + ten + single;

        return roman;

    }


}
