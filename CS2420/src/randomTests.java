public class randomTests {


    public static void main(String[] args) {

        int x = 5;
        int y = 7;

        System.out.println(x + ' ' + y);
        System.out.println(x + " " + y);

        System.out.println(foo());



    }

    public static int foo(){
        try{
            return 0;
        } finally {
            return 1;
        }
    }

    public static void bar(){
        try {
            throw new NullPointerException();
        } finally {
            throw new ArithmeticException();
        }
    }
}
