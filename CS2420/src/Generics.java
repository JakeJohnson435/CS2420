public class Generics<AnyType extends Comparable<? super AnyType>> implements Comparable {

    private AnyType item;

    public AnyType get() {
        return item;
    }

    public void set(AnyType a){
        item = a;
    }

    public static Generics findMaxNumber(Generics<Integer> a, Generics<Integer> b){

        Generics maxNumber;

        if (a.get().compareTo(b.get())>0){
            maxNumber = a;
        } else {
            maxNumber = b;
        }
        return maxNumber;
    }

    public static Generics findMinNumber(Generics<Integer> a, Generics<Integer> b){

        Generics maxNumber;

        if (a.get().compareTo(b.get())<0){
            maxNumber = a;
        } else {
            maxNumber = b;
        }
        return maxNumber;
    }

    public static void main(String[] args) {

        Generics<Integer> AnyA = new Generics<>();
        Generics<Integer> AnyB = new Generics<>();

        AnyA.set(10);
        AnyB.set(11);

        Generics max = findMaxNumber(AnyA, AnyB);
        System.out.println("The higher number is " + max.get());

        Generics min = findMinNumber(AnyA, AnyB);
        System.out.println("The lower number is " + min.get());


    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
