public class Generics<AnyType extends Comparable<? super AnyType>> {

    public static <AnyType extends Comparable<? super AnyType>> AnyType findMaxNumber(AnyType a, AnyType b){

        if (a.compareTo(b)>0){
            System.out.println(a + " is bigger");
            return a;
        } else if (a.compareTo(b)<0){
            System.out.println(b + " is bigger");
            return b;
        } else {
            System.out.println("They're the same");
            return a;
        }

    }

    public static <AnyType extends Comparable<? super AnyType>> AnyType findMinNumber(AnyType a, AnyType b){

        if (a.compareTo(b)<0){
            System.out.println(a + " is smaller");
            return a;
        } else if (a.compareTo(b)>0){
            System.out.println(b + " is smaller");
            return b;
        } else {
            System.out.println(("They're the same"));
            return a;
        }
    }

    public static void main(String[] args) {

        Integer AnyA = new Integer(7);
        Integer AnyB = new Integer(5);
        Integer AnyC = new Integer(10);
        Integer AnyD = new Integer(11);
        Integer AnyE = new Integer(7);
        Integer AnyF = new Integer(7);

        findMaxNumber(AnyA, AnyB);
        findMinNumber(AnyC, AnyD);
        findMinNumber(AnyE, AnyF);


    }

}
