public class Box<AnyType> {

    private AnyType item;

    public AnyType get(){
        return item;
    }

    public void set(AnyType i){
        item = i;
    }


    public static void main(String[] args) {

        Box<String> b = new Box<String>();
        b.set("Hello");

        Box<Integer> b2 = new Box<>();
        b2.set(5);
        //autoboxing above



    }



}
