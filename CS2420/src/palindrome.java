public class palindrome {

    public static boolean testPalindrome(String s){

        s = s.toLowerCase();

        if (s.length() <= 1){
            return true;
        }

        char left = s.charAt(0);
        char right = s.charAt(s.length()-1);

        if (left == ' ' || left == ',' || left == '.' || left == '-'){
            String inside = s.substring(1, s.length());
            return testPalindrome(inside);
        }

        if (right == ' ' || right == ',' || right == '.' || right == '-'){
            String inside = s.substring(0, s.length()-1);
            return testPalindrome(inside);
        }


        if (left != right){
            return false;
        }

        String inside = s.substring(1, s.length()-1);

        return testPalindrome(inside);

    }


    public static void main(String[] args) {

        String p1 = "Kayak";

        System.out.println(testPalindrome(p1));

        String p2 = "Jake";

        System.out.println(testPalindrome(p2));

        String p3 = "dammit im mad";

        System.out.println(testPalindrome(p3));



    }


}
